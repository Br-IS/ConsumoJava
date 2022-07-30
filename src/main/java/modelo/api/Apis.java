package modelo.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import modelo.Cancion;
import modelo.Lista;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Apis {

    private HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    public static final String BASE_URL = "https://m5b.herokuapp.com/";

    public List<Cancion> getCancion() {
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "canciones/list")).build();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            List<Cancion> cancionList = new ObjectMapper().readValue(response.body(), new TypeReference<>() {
            });
            return cancionList;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Lista> getListas() {
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "listas/list")).build();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            ArrayList<Lista> listaList = new ObjectMapper().readValue(response.body(), new TypeReference<>() {
            });

            return listaList;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


}
    /*
        public void getCanciones() {
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "canciones/list")).build();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }



    public List<Cancion> cancionList() {
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "canciones/list")).build();
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            List<Cancion> listasList = ConvertirObjeto(httpResponse.body(), new TypeReference<List<Cancion>>() {
            });

            //new ObjectMapper().readValue(httpResponse.body(), new TypeReference<List<Cancion>>() {});

            //ConvertirObjeto(httpResponse.body(), new TypeReference< List<Lista>>(){});

            return listasList;

            /*
            List<Lista> listas = new ObjectMapper().readValue(httpResponse.body(), new TypeReference<List<Lista>>() {
            });

            // List<Lista> listas = new Gson().fromJson(httpResponse.body(), new TypeToken<List<Lista>>() {}.getType());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T get(String url, TypeReference<T> typeReference) {
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return objectMapper.readValue(httpResponse.body(), typeReference);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T ConvertirObjeto(final String json, final TypeReference<T> reference){
        try {
           return this.objectMapper.readValue(json, reference);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    /*
    public List<Cancion> cancionList(){

        try  {
            URL url = new URL(BASE_URL + "canciones/list");
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

        return null;
    }*/


//}
