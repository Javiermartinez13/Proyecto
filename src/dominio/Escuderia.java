package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una escudería de Fórmula 1.
 */
public class Escuderia implements Serializable {
    private String nombre;
    private List<Piloto> pilotos;
    private List<Coche> coches;
    private List<Motor> motores;
    private List<Neumaticos> neumaticos;

    /**
     * Constructor que inicializa una escudería con un nombre.
     *
     * @param nombre Nombre de la escudería.
     */
    public Escuderia(String nombre) {
        this.nombre = nombre;
        this.pilotos = new ArrayList<>();
        this.coches = new ArrayList<>();
        this.motores = new ArrayList<>();
        this.neumaticos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Agrega un piloto a la escudería.
     *
     * @param piloto Piloto a agregar.
     */
    public void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    /**
     * Agrega un coche a la escudería.
     *
     * @param coche Coche a agregar.
     */
    public void agregarCoche(Coche coche) {
        coches.add(coche);
    }

    /**
     * Agrega un motor a la escudería.
     *
     * @param motor Motor a agregar.
     */
    public void agregarMotor(Motor motor) {
        motores.add(motor);
    }

    /**
     * Obtiene la lista de pilotos de la escudería.
     *
     * @return Lista de pilotos.
     */
    public List<Piloto> getPilotos() {
        return pilotos;
    }

    /**
     * Obtiene la lista de coches de la escudería.
     *
     * @return Lista de coches.
     */
    public List<Coche> getCoches() {
        return coches;
    }

    /**
     * Obtiene la lista de motores de la escudería.
     *
     * @return Lista de motores.
     */
    public List<Motor> getMotores() {
        return motores;
    }

    /**
     * Agrega un neumático a la escudería.
     *
     * @param neumatico Neumático a agregar.
     */
    public void agregarNeumatico(Neumaticos neumatico) {
        neumaticos.add(neumatico);
    }

        /**
     * Obtiene la lista de neumáticos de la escudería.
     *
     * @return Lista de neumáticos.
     */
    public List<Neumaticos> getNeumaticos() {
        return neumaticos;
    }
    /**
     * Representación en cadena de la escudería.
     *
     * @return Cadena que representa la escudería.
     */
    @Override
    public String toString() {
        return "Escuderia{" +
                "nombre='" + nombre + '\'' +
                ", pilotos=" + pilotos +
                ", coches=" + coches +
                ", motores=" + motores +
                '}';
    }
}
