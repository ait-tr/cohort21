package okhttp;

import com.google.gson.Gson;
import dto.ContactDto;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddContactTestsOkhttp {

    private  final MediaType JSON = MediaType.get("application/json;charset=utf-8");
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsKzRAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2ODIwODY5OTgsImlhdCI6MTY4MTQ4Njk5OH0.wanIL6Ya2HxxdM-m5qnLM_nBKexi2-tINu9Y7vC0Uo8";

    @Test
    public void addContactSuccessTest() throws IOException {

        ContactDto contactDto = ContactDto.builder().name("Oliver").lastName("Kan")
                .email("kan@gmail.com").phone("1234512345")
                .address("Berlin").description("goalkeeper").build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto),JSON);
        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization", token)
                .post(body).build();

        client.newCall(request).execute();

    }
}
