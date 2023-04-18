package okhttp;

import com.google.gson.Gson;
import dto.ContactDto;
import dto.ContactResponseDto;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class DeleteContactByIdTestsOkhttp {

    private final MediaType JSON = MediaType.get("application/json;charset=utf-8");
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsKzRAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2ODIwODY5OTgsImlhdCI6MTY4MTQ4Njk5OH0.wanIL6Ya2HxxdM-m5qnLM_nBKexi2-tINu9Y7vC0Uo8";

    String id;

    @BeforeMethod
    public void precondition() throws IOException {
        int i = new Random().nextInt(1000) + 1000;
        ContactDto contactDto = ContactDto.builder().
                name("Oliver")
                .lastName("Kan")
                .email("kan" + i + "@gmail.com")
                .phone("1234512345" + i)
                .address("Berlin").
                description("goalkeeper").build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto), JSON);
        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization", token)
                .post(body).build();

        Response response = client.newCall(request).execute();

        ContactResponseDto contactResponse = gson.fromJson(response.body().string(), ContactResponseDto.class);
        //Contact was added! ID: 6e52993e-d114-4681-82bf-27a0c8ebe125
        String message = contactResponse.getMessage();

        String[] split = message.split(": ");
        id = split[1];
    }

    @Test
    public void deleteContactByIdSuccess() throws IOException {

        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts/" + id)
                .addHeader("Authorization", token)
                .delete().build();

        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        ContactResponseDto contactResponse = gson.fromJson(response.body().string(), ContactResponseDto.class);
        Assert.assertEquals(contactResponse.getMessage(),"Contact was deleted!");
    }
}
