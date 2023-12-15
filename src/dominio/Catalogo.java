package dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalogo {
    private List<Producto> productos;

    public Catalogo() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        Iterator<Producto> iterador = productos.iterator();
        while (iterador.hasNext()) {
            Producto producto = iterador.next();
            if (producto.getNombre().equals(nombre)) {
                iterador.remove();
                break; // Terminamos el bucle ya que encontramos y eliminamos el producto
            }
        }
    }

    public void modificarProducto(String nombre, Producto nuevoProducto) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            if (producto.getNombre().equals(nombre)) {
                productos.set(i, nuevoProducto);
                break; // Terminamos el bucle ya que encontramos y modificamos el producto
            }
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null; // Retorna null si no se encuentra el producto
    }

    public List<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(productos); // Devuelve una copia de la lista para evitar modificaciones externas
    }

    public int obtenerNumeroDeProductos() {
        return productos.size();
    }

}
