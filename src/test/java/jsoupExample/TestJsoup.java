package jsoupExample;

import okhttp3.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;
import userAgent.DefaultCookieStorage;
import userAgent.UserAgentInterceptor;
import java.io.IOException;

public class TestJsoup {



        Document document = Jsoup.parse(html);
        //Elements select = document.select(".hero-title");
        //Element element = select.get(0);
       // System.out.println(element.text());
        //System.out.println(document.body());

       // Elements select = document.select("img");
      //  for (Element elem : select){
         //   System.out.println(elem.attr("src"));
      //  }

        for (Cookie cookie : DefaultCookieStorage.cookies) {
            System.out.println(cookie.name());
        }
        RequestBody requestBody = new FormBody.Builder()
                .add("email", "lasd")
                .add("password", "asd").build();
        Request request = new Request.Builder().url("https://kismia.com/sign/in/").post(requestBody).build();

        System.out.println(client.newCall(request).execute().body().string());

    }




}
