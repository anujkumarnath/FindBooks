package com.androiddreams.findbooks;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class QueryUtils {
    private final String TEST_URL = "https://www.googleapis.com/books/v1/volumes?q=machine%20learning%20in%20python&maxResults=5";

    private QueryUtils() {}

    public static ArrayList<Book> readItemsFromJson(/*String jsonResponse*/) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            /**
             * getting the root JSON object
             */
            JSONObject root = new JSONObject(DeleteThis.GOOGLE_BOOKS_JSON_RESPONSE/*jsonResponse*/);
            if (root == null)
                return null;
            /**
             * getting the array with key "items"
             */
            JSONArray itemsArray = root.optJSONArray("items");
            for (int i = 0; i < itemsArray.length(); i++) {
                /**
                 * get individual item from the array of items
                 */
                JSONObject item = itemsArray.optJSONObject(i);
                /**
                 * getting JSON object with key "volumeInfo"
                 */
                JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                String title = volumeInfo.optString("title");
                String subTitle = volumeInfo.optString("subtitle");
                JSONArray authorsArray = volumeInfo.optJSONArray("authors");
                String authors = authorsArray.optString(0);
                if (authorsArray.length() > 0)
                for (int j = 1; j < authorsArray.length(); j++) {
                    authors += ", " + authorsArray.optString(j);
                }
                String publisher = volumeInfo.optString("publisher");
                String rating = volumeInfo.optString("averageRating");

                books.add(new Book(title, subTitle, authors, publisher, rating));
            }
        } catch (JSONException e) {
            //TODO: handle exception here
        }
        return books;
    }

    public static String makeHttpsRequest (URL googleBooksurl) throws IOException {
        String jsonResponse = "";
        HttpsURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpsURLConnection) googleBooksurl.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(10000);
            urlConnection.setReadTimeout(15000);
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readFromInputStream(inputStream);
        } catch (IOException e) {
            // TODO: handle exception later
        } finally {
            if (urlConnection != null)
                urlConnection.disconnect();
            if (inputStream != null)
                inputStream.close();
        }
        return jsonResponse;
    }

    public static URL createUrl(String urlString) {
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            // TODO: handle exception later
        }
        return url;
    }

    public static String readFromInputStream(InputStream inputStream) {
        String jsonResponse = "";
        StringBuilder output = new StringBuilder();
        if (inputStream == null)
            return jsonResponse;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                output.append(line);
                line = bufferedReader.readLine();
            }
            jsonResponse = output.toString();
        } catch (IOException e) {
           // TODO: handle exception later
        }
        return jsonResponse;
    }
}
