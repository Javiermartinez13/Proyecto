package dominio;

import java.io.*;
import java.util.ArrayList;


public class CatalogoGestion {

    private ArrayList<Producto> catalogo;

    public CatalogoGestion() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        catalogo.add(producto);
    }

 
    public void eliminarProducto(String nombre) {
        catalogo.removeIf(producto -> producto.getNombre().equals(nombre));
    }

    
    public void modificarProducto(String nombre, Producto nuevoProducto) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getNombre().equals(nombre)) {
                catalogo.set(i, nuevoProducto);
                break;
            }
        }
    }

    
    public void generarCSV(String ruta) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ruta))) {
            writer.println("Nombre,Descripcion,Precio");

            // Escribir datos de productos
            for (Producto producto : catalogo) {
                writer.println(producto.getNombre() + "," + producto.getDescripcion() + "," + producto.getPrecio() +"$");
            }

            System.out.println("Archivo CSV generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo CSV: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        CatalogoGestion catalogoGestion = new CatalogoGestion();

        Producto producto1 = new Producto("Coche", "Automovil de lujo", 150000);
        Producto producto2 = new Producto("Bicicleta", "Bicicleta de montaña", 800);
        catalogoGestion.agregarProducto(producto1);
        catalogoGestion.agregarProducto(producto2);

        catalogoGestion.eliminarProducto("Bicicleta");

        Producto productoModificado = new Producto("Coche", "Automovil deportivo", 160000);
        catalogoGestion.modificarProducto("Coche", productoModificado);

        catalogoGestion.generarCSV("catalogo.csv");
    }
}