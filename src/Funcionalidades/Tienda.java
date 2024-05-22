package Funcionalidades;

import java.util.HashMap;
import java.util.Scanner;

public class Tienda {
    private HashMap<String, Producto> inventario;
    Scanner scanner = new Scanner(System.in);

    public Tienda(){
        this.inventario = new HashMap<>();
    }

    public void agregarProducto(Producto producto){
        if (!inventario.containsKey(producto.getNombre())){
            inventario.put(producto.getNombre(), producto);
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("Este producto ya existe...");
            System.out.println("Cuantas unidades quieres agregar: ");

        }
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de Productos:");
            for (Producto producto : inventario.values()) {
                System.out.println(producto);
            }
        }
    }

    public void eliminarProducto(String nombreProducto) {
        if (inventario.containsKey(nombreProducto)) {
            inventario.remove(nombreProducto);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }
}
