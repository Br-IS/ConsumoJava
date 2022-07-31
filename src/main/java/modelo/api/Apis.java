package modelo.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import modelo.Cancion;
import modelo.Lista;
import org.json.JSONException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Apis {

    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    public static final String BASE_URL = "http://localhost:8080/";
    private HttpResponse<String> httpResponse;
    private Lista lista;
    private ArrayList<Lista> listaList;
    private List<Cancion> cancionList;

    private HttpRequest httpRequest;

    public class Listas {

        //CREATE
        public boolean createLista(Lista lista) {
            try {
                String json = "{\"nombre\":\"" + lista.getNombre() + "\" ,\"descripcion\":\"" + lista.getDescripcion() + "\"}";

                httpRequest = HttpRequest.newBuilder()
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .uri(URI.create(BASE_URL + "listas/crear"))
                        .setHeader("Content-Type", "application/json")
                        .build();
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                System.out.println(json);
                return true;

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        //READ
        public ArrayList<Lista> getListas() {
            httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "listas/list")).build();
            try {
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                listaList = new ObjectMapper().readValue(httpResponse.body(), new TypeReference<>() {
                });

                return listaList;

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        //UPDATE
        public boolean updateLista(String nombre, Lista lista) {
            try {
                String json = "{\"nombre\":\"" + lista.getNombre() + "\" ,\"descripcion\":\"" + lista.getDescripcion() + "\"}";

                httpRequest = HttpRequest.newBuilder()
                        .PUT(HttpRequest.BodyPublishers.ofString(json))
                        .uri(URI.create(BASE_URL + "listas/" + nombre))
                        .setHeader("Content-Type", "application/json")
                        .build();
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

                return true;

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //DELETE
        public boolean deleteLista(String nombre) {
            httpRequest = HttpRequest.newBuilder().DELETE().uri(URI.create(BASE_URL + "listas/" + nombre)).build();
            try {
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                return true;
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        }

    }

    public class Canciones {

        public Lista getListas(String nombre) {
            httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "listas/" + nombre)).build();
            try {
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

                lista = new ObjectMapper().readValue(httpResponse.body(), Lista.class);

                return lista;

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean createCancion(Cancion cancion) {

            try {
                String json = "{\"titulo\":\"" + cancion.getTitulo() + "\",\"artista\":\"" + cancion.getArtista() + "\",\"album\":\"" + cancion.getAlbum() + "\",\"anio\":\"" + cancion.getAnio() + "\"}";

                httpRequest = HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL + "canciones/crear"))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .build();

                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                return true;
            } catch (IOException | InterruptedException | JSONException e) {
                e.printStackTrace();
            }
            return false;
        }

        public boolean deleteCancion(String titulo) {
            try {
                httpRequest = HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL + "canciones/" + titulo))
                        .header("Content-Type", "application/json")
                        .DELETE()
                        .build();

                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                return true;
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        }


        public List<Cancion> getCanciones() {
            httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(BASE_URL + "canciones/list")).build();

            try {
                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                cancionList = new ObjectMapper().readValue(httpResponse.body(), new TypeReference<>() {
                });

                return cancionList;

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }


    }

    public boolean asignarCancionLista(String titulo, String nombre) {
        try {
            String json = "{}";

            httpRequest = HttpRequest.newBuilder().PUT(HttpRequest.BodyPublishers.ofString(json))
                    .uri(URI.create(BASE_URL + "canciones/" + titulo + "/" + nombre))
                    .header("Content-Type", "application/json")
                    .build();

            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return true;

        } catch (IOException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
        return false;

    }

    /*
       try {
                String json = "{\"titulo\":\"" + cancion.getTitulo() + "\",\"artista\":\"" + cancion.getArtista() + "\",\"album\":\"" + cancion.getAlbum() + "\",\"anio\":\"" + cancion.getAnio() + "\"}";

                httpRequest = HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL + "canciones/crear"))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .build();

                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                return true;
            } catch (IOException | InterruptedException | JSONException e) {
                e.printStackTrace();
            }
            return false;


    try {
                httpRequest = HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL + "canciones/" + titulo))
                        .header("Content-Type", "application/json")
                        .DELETE()
                        .build();

                httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                return true;
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            return false;
     */


}