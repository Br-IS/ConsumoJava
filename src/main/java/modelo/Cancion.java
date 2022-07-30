package modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private String anio;

    public Cancion() {
    }
/*
    public List<Cancion> getCanciones(String body) {
List<Cancion> cancionList = new ConvertirObjeto().convertir(body, new TypeReference<List<Cancion>>() {
        });
        return cancionList;
    }*/
}
