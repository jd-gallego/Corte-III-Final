package Usuarios;

import Funcionalidades.Producto;
import Funcionalidades.Tienda;

import java.util.Scanner;

public class Administrador {
    Scanner scanner = new Scanner(System.in);
    Tienda tienda = new Tienda();
    String usuario;
    int contrasena;
    int ciclo;

    public void admin(){

        do {
            System.out.println("Usuario: administrador ; Contraseña: 1");
            System.out.print("Escriba el usuario: ");
            usuario = scanner.next();
            System.out.print("Escriba la contraseña: ");
            contrasena = scanner.nextInt();

            if (usuario.equals("administrador") && contrasena == 1) {
                ciclo = 0;
                System.out.print("Nombre del producto: ");
                String nombre = scanner.next();
                System.out.print("ID: ");
                int ide = scanner.nextInt();
                System.out.print("Descripcion del producto: ");
                String descripcion = scanner.next();
                System.out.print("Cantidad de productos a agregar: ");
                int cantidad = scanner.nextInt();
                System.out.println("Precio del producto: ");
                double precio = scanner.nextDouble();
                Producto nuevoProducto = new Producto(nombre, ide, descripcion, cantidad, precio);
                tienda.agregarProducto(nuevoProducto);
            } else {
                ciclo = 0;
                System.out.println("Usuario y/o contraseña incorrecta");
            }

        }while (ciclo != 1);
    }
}
