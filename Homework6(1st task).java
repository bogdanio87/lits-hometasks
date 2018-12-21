import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.net.*;
import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.*;
import java.lang.Object;

public class HttpURLConnectionTest {
    public static void main(String[] args) throws Exception {
        URL myUrl = new URL("http://www.google.com");
        HttpURLConnection myUrlCon =
                (HttpURLConnection) myUrl.openConnection();

        System.out.println("Request: " + myUrl);

        System.out.println("Response status:  " + myUrlCon.getResponseCode() + " " + myUrlCon.getResponseMessage());

        System.out.println("" + myUrlCon.getHeaderField(5));

        InputStream in = myUrlCon.getInputStream();
        String encoding = myUrlCon.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        String body = IOUtils.toString(in, encoding);
        System.out.println(body);

    }
    @Test
    public void ServerStatus() {

    }
}
