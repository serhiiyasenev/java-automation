package lesson17;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestHttp {
    OkHttpClient okHttpClient = new OkHttpClient();

    @Test
    public void alala() throws IOException {

          Request request = new Request.Builder().url("https://kismia.com/").build();
          Response response = okHttpClient.newCall(request).execute();

          System.out.println("-----CODE-----");
          System.out.println(response.code());

          System.out.println("-----HEADER-----");
          System.out.println(response.headers());

          System.out.println("-----BODY-----");
          System.out.println(response.body().string());


    }
}
