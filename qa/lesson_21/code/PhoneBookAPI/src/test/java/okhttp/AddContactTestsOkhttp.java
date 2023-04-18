package okhttp;

import com.google.gson.Gson;
import dto.ContactDto;
import dto.ContactResponseDto;
import dto.ErrorDto;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class AddContactTestsOkhttp {

    private final MediaType JSON = MediaType.get("application/json;charset=utf-8");
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsKzRAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2ODIwODY5OTgsImlhdCI6MTY4MTQ4Njk5OH0.wanIL6Ya2HxxdM-m5qnLM_nBKexi2-tINu9Y7vC0Uo8";

    @Test
    public void addContactSuccessTest() throws IOException {
        int i = new Random().nextInt(1000) + 1000;
        ContactDto contactDto = ContactDto.builder().name("Oliver").lastName("Kan")
                .email("kan" + i + "@gmail.com").phone("1234512345" + i)
                .address("Berlin").description("goalkeeper").build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto), JSON);
        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization", token)
                .post(body).build();

        Response response = client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());

        ContactResponseDto contactResponse = gson.fromJson(response.body().string(), ContactResponseDto.class);
        System.out.println(contactResponse.getMessage());
        Assert.assertTrue(contactResponse.getMessage().contains("Contact was added!"));

    }

    @Test
    public void addContactWithoutNameTest() throws IOException {
        ContactDto contactDto = ContactDto.builder().
                lastName("Kan")
                .email("kan@gmail.com")
                .phone("1234512345")
                .address("Berlin")
                .description("goalkeeper").build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto), JSON);
        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization", token)
                .post(body).build();
        Response response = client.newCall(request).execute();
        Assert.assertEquals(response.code(), 400);

        ErrorDto error = gson.fromJson(response.body().string(), ErrorDto.class);
        Assert.assertEquals(error.getMessage().toString(), "{name=must not be blank}");
    }

    @Test
    public void addContactWithWrongEmailTest() throws IOException {
        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kangmail.com")
                .phone("1234512345")
                .address("Berlin")
                .description("goalkeeper").build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto), JSON);
        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization", token)
                .post(body).build();
        Response response = client.newCall(request).execute();
        Assert.assertEquals(response.code(), 400);

        ErrorDto error = gson.fromJson(response.body().string(), ErrorDto.class);
        Assert.assertEquals(error.getMessage().toString(),"{email=must be a well-formed email address}");

    }
}
