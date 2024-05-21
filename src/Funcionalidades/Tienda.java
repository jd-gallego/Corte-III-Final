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
}
