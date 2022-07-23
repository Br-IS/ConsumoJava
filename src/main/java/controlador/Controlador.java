/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cancion;
import modelo.api.CancionApi;
import vista.Principal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Boris
 */
public class Controlador {

    private  Principal principal;

    public Controlador(Principal principal) {
        this.principal = principal;
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }

    public static void main(String[] args) {
        CancionApi cancionApi = new CancionApi();

        cancionApi.cancionList();

        /*
        for (int i = 0; i < cancionApi.cancionList().size(); i++) {
            cancionApi.cancionList().get(i).toString();
        }*/
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