package dominio;

import java.io.Serializable;

/**
 * Clase que representa a un motor de Fórmula 1.
 */
public class Motor implements Serializable {
    private String fabricante;

    /**
     * Constructor que inicializa un motor con un fabricante.
     *
     * @param fabricante Fabricante del motor.
     */
    public Motor(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Representación en cadena del motor.
     *
     * @return Cadena que representa al motor.
     */
    @Override
    public String toString() {
        return "Motor del fabricante = " + fabricante +
                '.';
    }
}
