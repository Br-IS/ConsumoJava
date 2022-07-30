/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.api.Apis;

public class Controlador {


    public static void main(String[] args) {

        Apis apis = new Apis();

        //System.out.println(apis.getCancion());
/*
        apis.getCancion().stream().forEach(cancion -> {
            System.out.println(cancion.getTitulo() + " - " + cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getAnio());
        });*/

        System.out.println(apis.getListas());

        apis.getListas().stream().forEach(lista -> {
            System.out.println(lista.getNombre() + " - " + lista.getDescripcion() + "" +
                    lista.getCancion().stream().map(
                            cancion -> cancion.getTitulo() + " - " + cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getAnio()).reduce("", (a, b) -> a + " Canciones: " + b));





            // System.out.println(lista.getNombre() + " - " + lista.getDescripcion() + "- " + lista.getCancion().stream().map(cancion -> cancion.getTitulo()).reduce("", (a, b) -> a + " - " + b));


            //System.out.println(lista.getNombre() + " - " + lista.getDescripcion() + " - " + lista.getCancion().stream().map(cancion -> cancion.getTitulo() + " - " + cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getAnio()).reduce("", (a, b) -> a + " - " + b));
        });


    }
}
/*
    private HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    private  HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://m5b.herokuapp.com/listas/list")).build();

    private Principal principal;

    public Controlador(Principal principal) {
        this.principal = principal;
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }

    Apis apis = new Apis();

        List<Cancion> listas = apis.cancionList();

        for (Cancion cancion : listas) {
            System.out.println(cancion.getTitulo());
        }


        HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://m5b.herokuapp.com/listas/list")).build();


        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println(httpResponse.body());

        } catch (IOException | InterruptedException e) {
            Logger.getLogger(Controlador.class.getName()).severe(e.getMessage());

            throw new RuntimeException(e);
        }*/


//CancionApi cancionApi = new CancionApi();
//cancionApi.cancionList();