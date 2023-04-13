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

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsKzRAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2ODE5ODIwNDMsImlhdCI6MTY4MTM4MjA0M30.gqsFTURMKE5vb7_-P8EM5OiksH8-oSYjP5b0YGaOa0A";

    @Test
    public void addContactSuccessTest() throws IOException {

        ContactDto contactDto = ContactDto.builder().name("Oliver").lastName("Kan")
                .email("kan@gm.co").phone("123456789876")
                .address("Berlin").description("goalkeeper").build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto),JSON);
        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/user/login/usernamepassword")
                .addHeader("Authorization",token)
                .post(body).build();

        client.newCall(request).execute();
    }
}
