package rss;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectionHelper {

    private static final String urlPath = "test";

   static public int setUpConnection(String username, String password) throws IOException {
        URL url = new URL(urlPath);
        URLConnection connection = url.openConnection();
        HttpURLConnection http = (HttpURLConnection)connection;
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        return  http.getResponseCode();
    }


}
