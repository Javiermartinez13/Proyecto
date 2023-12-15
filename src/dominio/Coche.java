package dominio;


import java.io.Serializable;

/**
 * Clase que representa a un coche de Fórmula 1.
 */
public class Coche implements Serializable {
    private String modelo;
    private String color;

    /**
     * Constructor que inicializa un coche con un modelo y un color.
     *
     * @param modelo Modelo del coche.
     * @param color  Color del coche.
     */
    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Representación en cadena del coche.
     *
     * @return Cadena que representa al coche.
     */
    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
