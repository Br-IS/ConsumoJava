package modelo.api;

import modelo.Cancion;
import retrofit2.Response;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class CancionApi {

    public static final String BASE_URL = "https://m5b.herokuapp.com/";

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
    }



}
    /*
    private Cancion cancion;
    private List<Cancion> canciones;

    public void consumirJson(){

    }


    public List<Cancion> cancionList() {
        try {
            URL url = new URL(BASE_URL + "canciones/list");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            if (con.getResponseCode() != 200) {
                throw new RuntimeException("Error: " + con.getResponseCode());
            } else {
                StringBuilder result = new StringBuilder();

                Scanner scanner = new Scanner(url.openStream());

                while(scanner.hasNext()){
                    result.append(scanner.next());



                }

                /*
                canciones = new ArrayList<>();

                while (scanner.hasNext()) {
                    result.append(scanner.next());

                    String[] cancionesStr = result.toString().split(";");
                    for (String cancionStr : cancionesStr) {
                        String[] cancionStrSplit = cancionStr.split(",");
                        cancion = new Cancion(cancionStrSplit[0], cancionStrSplit[1], cancionStrSplit[2], cancionStrSplit[3]);
                        canciones.add(cancion);
                    }


                }

                scanner.close();

                return canciones;
            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/



    /*
    */


