package interfaz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dominio.*;


/**
 * Clase que gestiona el menú y la interacción con el usuario.
 */
public class Menu {
    public List<Escuderia> escuderias;

    /**
     * Constructor que inicializa la lista de escuderías y carga los datos si existen.
     */
    public Menu() 
    {
        this.escuderias = new ArrayList<>();
        cargarDatos();
    }

/**
 * Muestra el menú y realiza las acciones según la opción seleccionada por el usuario.
 */
public void mostrarMenu() 
{
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    while (!salir) 
    {
        System.out.println("\n-- Menú --");
        System.out.println("1. Crear Escudería");
        System.out.println("2. Mostrar Escuderías");
        System.out.println("3. Eliminar Escudería");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");

        String input = scanner.nextLine();

        if (!input.isEmpty() && input.matches("\\d+")) 
        {
            int opcion = Integer.parseInt(input.trim());

            switch (opcion) 
            {
                case 1:
                    crearEscuderia();
                    break;
                case 2:
                    mostrarEscuderias();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la escudería a eliminar: ");
                    String nombreEscuderia = scanner.nextLine();
                    eliminarEscuderia(nombreEscuderia);
                    break;
                case 4:
                    guardarDatos();
                    System.out.println("Programa cerrado. ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        else 
        {
            System.out.println("Por favor, ingresa un número entero.");
        }
    }

    // Cerrar el Scanner al salir del bucle
    scanner.close();
}
    /**
     * Permite al usuario crear una nueva escudería, ingresando información sobre pilotos, coches, motores y neumáticos.
     */
    private void crearEscuderia() 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Ingrese el nombre de la escudería: ");
            String nombre = scanner.nextLine();

            Escuderia escuderia = new Escuderia(nombre);

            // Agregar pilotos
            System.out.print("¿Cuántos pilotos quieres agregar? ");
            int numPilotos = scanner.nextInt();
            for (int i = 0; i < numPilotos; i++) 
            {
                System.out.print("Nombre del piloto " + (i + 1) + ": ");
                String nombrePiloto = scanner.next();
                System.out.print("Edad del piloto " + (i + 1) + ": ");
                int edadPiloto = scanner.nextInt();
                escuderia.agregarPiloto(new Piloto(nombrePiloto, edadPiloto));
            }

            // Agregar coches
            System.out.print("¿Cuántos coches quieres agregar? ");
            int numCoches = scanner.nextInt();
            for (int i = 0; i < numCoches; i++) 
            {
                System.out.print("Modelo del coche " + (i + 1) + ": ");
                String modeloCoche = scanner.next();
                System.out.print("Color del coche " + (i + 1) + ": ");
                String colorCoche = scanner.next();
                escuderia.agregarCoche(new Coche(modeloCoche, colorCoche));
            }

            // Agregar motores
            System.out.print("¿Cuántos motores quieres agregar? ");
            int numMotores = scanner.nextInt();
            for (int i = 0; i < numMotores; i++) 
            {
                System.out.print("Fabricante del motor " + (i + 1) + ": ");
                String fabricanteMotor = scanner.next();
                escuderia.agregarMotor(new Motor(fabricanteMotor));
            }

            // Agregar neumáticos
            System.out.print("¿Cuántos neumáticos quieres agregar? ");
            int numNeumaticos = scanner.nextInt();
            for (int i = 0; i < numNeumaticos; i++) 
            {
                System.out.print("Tipo de neumático " + (i + 1) + ": ");
                String tipoNeumatico = scanner.next();
                escuderia.agregarNeumatico(new Neumaticos(tipoNeumatico, nombre));
            }

            escuderias.add(escuderia);
        }
        System.out.println("Escudería creada con éxito. ");
        
    }

    /**
     * Muestra la información de todas las escuderías registradas.
     */
    private void mostrarEscuderias() 
    {
        System.out.println("\n-- Escuderías Registradas --");
        for (Escuderia escuderia : escuderias) 
        {
            System.out.println(escuderia);
        }
    }

/**
 * Carga los datos almacenados en el archivo al iniciar la aplicación.
 */
@SuppressWarnings("unchecked")
private void cargarDatos() 
{
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("escuderias.dat"))) 
    {
        Object object = ois.readObject();

        if (object instanceof List<?>) 
        {
            escuderias = (List<Escuderia>) object;
            System.out.println("Datos cargados exitosamente.");
        } 
        else 
        {
            System.out.println("Error al cargar datos: Tipo de objeto no esperado.");
        }
    } catch (FileNotFoundException e) 
    {
        System.out.println("Archivo de datos no encontrado. Se creará uno nuevo al guardar.");
    } catch (IOException | ClassNotFoundException e) 
    {
        e.printStackTrace();
    }
}

    /**
     * Guarda los datos en un archivo al cerrar la aplicación.
     */
    private void guardarDatos() 
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("escuderias.dat"))) 
        {
            oos.writeObject(escuderias);
            System.out.println("Datos guardados exitosamente.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    /**
 * Elimina una escudería por su nombre.
 * @param nombre Nombre de la escudería a eliminar.
 */
private void eliminarEscuderia(String nombre) 
{
    boolean escuderiaEliminada = escuderias.removeIf(escuderia -> escuderia.getNombre().equals(nombre));

    if (escuderiaEliminada) 
    {
        System.out.println("Escudería eliminada con éxito.");
    } 
    else 
    {
        System.out.println("No se encontró ninguna escudería con el nombre: " + nombre);
    }
}

}
