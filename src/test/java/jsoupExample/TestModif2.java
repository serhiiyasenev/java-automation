package jsoupExample;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.testng.annotations.Test;
import userAgent.UserAgentInterceptor;

import java.io.IOException;

public class TestModif2 {
    @Test
    public void alala11() throws IOException {

        OkHttpClient client = new OkHttpClient.Builder().
                addInterceptor(new UserAgentInterceptor("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")).
                build();
        //String html = client.newCall(new Request.Builder().url("http://www.business-template.com/").build()).execute().body().string();

        String html = client.newCall(new Request.Builder().url("http://kismia.com/").build()).execute().body().string();
    }
}
