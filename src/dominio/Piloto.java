package dominio;

import java.io.Serializable;

/**
 * Clase que representa a un piloto de Fórmula 1.
 */
public class Piloto implements Serializable {
    private String nombre;
    private int edad;

    /**
     * Constructor que inicializa un piloto con un nombre y una edad.
     *
     * @param nombre Nombre del piloto.
     * @param edad   Edad del piloto.
     */
    public Piloto(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Representación en cadena del piloto.
     *
     * @return Cadena que representa al piloto.
     */
    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
