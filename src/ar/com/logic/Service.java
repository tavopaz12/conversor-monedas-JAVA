package ar.com.logic;

import java.io.*;
import java.net.URI;
import java.net.http.*;
import java.nio.file.Files;
import java.util.logging.*;
import org.json.JSONObject;

public class Service {

    public static JSONObject getAvailableCurrencies() {
        try {
            File jsonFile = new File("currencies.json");
            String jsonString = new String(Files.readAllBytes(jsonFile.toPath()));
            JSONObject jsonObject = new JSONObject(jsonString);

            return jsonObject;
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static JSONObject getConvertion(String from, String to, String amount) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://currency-converter-by-api-ninjas.p.rapidapi.com/v1/convertcurrency?have=" + from + "&want=" + to + "&amount=" + amount))
                    .header("X-RapidAPI-Key", "65b7259c3amsh5bedb069920db82p11f1e1jsn6f104b1eeee3")
                    .header("X-RapidAPI-Host", "currency-converter-by-api-ninjas.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            String responseString = response.body();
            JSONObject responseObject = new JSONObject(responseString);

            return responseObject;
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
}
