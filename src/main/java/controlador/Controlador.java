/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

/**
 * @author Boris
 */
public class Controlador {

    private HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    private  HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://m5b.herokuapp.com/listas/list")).build();

    private Principal principal;

    public Controlador(Principal principal) {
        this.principal = principal;
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }

    public static void main(String[] args) {

        HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://m5b.herokuapp.com/listas/list")).build();


        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println(httpResponse.body());

        } catch (IOException | InterruptedException e) {
            Logger.getLogger(Controlador.class.getName()).severe(e.getMessage());

            throw new RuntimeException(e);
        }


        //CancionApi cancionApi = new CancionApi();
        //cancionApi.cancionList();


    }
}
/*

Controlador controlador = new Controlador(new Principal());

Principal principal = new Principal();
        new Controlador(principal);


        try {
            URL url = new URL("https://m5b.herokuapp.com/canciones/list");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("Error: " + responseCode);
            }else{
                StringBuilder result = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    result.append(scanner.next());
                }

                scanner.close();

                System.out.println(result);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */