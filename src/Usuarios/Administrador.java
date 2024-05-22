package Usuarios;

import Funcionalidades.Producto;
import Funcionalidades.Tienda;

import java.util.Scanner;

public class Administrador {
    Scanner scanner = new Scanner(System.in);
    Tienda tienda = new Tienda();
    String usuario;
    int contrasena;
    int opcion;
    int ciclo;

    public void admin(){

        do {
            System.out.println("\nUsuario: administrador ; Contraseña: 1");
            System.out.print("Escriba el usuario: ");
            usuario = scanner.next();
            System.out.print("Escriba la contraseña: ");
            contrasena = scanner.nextInt();
            System.out.println("\nIngresaste como administrador");
            System.out.println("Tienes estas opciones para escoger...");

            if (usuario.equals("administrador") && contrasena == 1) {
                do {

                    System.out.println("\n1. Agregar producto.");
                    System.out.println("2. Modificar producto.");
                    System.out.println("3. Eliminar producto.");
                    System.out.println("4. Generar informes de ventas.");
                    System.out.println("5. Mostrar inventario.");
                    System.out.println("6. Salir de como administrador.");
                    System.out.print("Opcion: ");
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.print("Nombre del producto: ");
                            String nombre = scanner.nextLine();
                            System.out.print("ID: ");
                            int ide = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Descripcion del producto: ");
                            String descripcion = scanner.nextLine();
                            System.out.print("Cantidad de productos a agregar: ");
                            int cantidad = scanner.nextInt();
                            System.out.print("Precio del producto: ");
                            double precio = scanner.nextDouble();
                            Producto nuevoProducto = new Producto(nombre, ide, descripcion, cantidad, precio);
                            tienda.agregarProducto(nuevoProducto);
                            break;

                        case 2:

                            break;

                        case 3:

                            System.out.print("Ingrese el nombre del producto a eliminar: ");
                            String nombreEliminar = scanner.nextLine();
                            tienda.eliminarProducto(nombreEliminar);
                            break;

                        case 4:

                            break;

                        case 5:

                            tienda.mostrarInventario();
                            break;

                        default:

                            System.out.println("Ingrese una opcion correcta.");

                    }
                } while (opcion != 6);

                ciclo = 0;

            } else {

                System.out.println("Usuario y/o contraseña incorrecta.");
                ciclo = 1;

            }
        }while (ciclo == 1);
    }
}
