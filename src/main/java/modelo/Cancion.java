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

}
