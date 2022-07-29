package modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Lista {
    private String nombre;
    private String descripcion;
    private ArrayList<Cancion> cancion;
}
