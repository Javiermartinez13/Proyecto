package dominio;

/**
 * Clase que representa los neumáticos de una escudería.
 */
public class Neumaticos extends Escuderia {
    private String tipo;

    /**
     * Constructor que inicializa los neumáticos con un tipo y el nombre de la escudería.
     *
     * @param tipo              Tipo de neumáticos.
     * @param nombreEscuderia   Nombre de la escudería a la que pertenecen los neumáticos.
     */
    public Neumaticos(String tipo, String nombreEscuderia) {
        super(nombreEscuderia);
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo de neumáticos.
     *
     * @return Tipo de neumáticos.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de neumáticos.
     *
     * @param tipo Tipo de neumáticos.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Representación en cadena de los neumáticos.
     *
     * @return Cadena que representa los neumáticos.
     */
    @Override
    public String toString() {
        return "Tipo de neumático =  " + tipo +
                '.';
    }
}
