import Usuarios.Administrador;
import Usuarios.Gerente;
import Usuarios.Vendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrador administrador = new Administrador();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();

        int eleccion;
        int ciclo;

        do {

            System.out.println("Sistema de Gestión de Inventario para una Tienda de Electrónica");
            System.out.println("Escoja el numero asignado a la opcion si eres...");
            System.out.println("1. Administrador");
            System.out.println("2. Vendedor");
            System.out.println("3. Gerente");
            System.out.print("Opcion: ");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    ciclo = 0;
                    administrador.admin();
                    break;
                case 2:
                    ciclo = 0;
                    vendedor.vendedor();
                    break;
                case 3:
                    ciclo = 0;
                    gerente.gerente();
                    break;
                default:
                    System.out.println("Elija una opcion correcta.");
                    ciclo = 1;
            }

        }while (ciclo == 1);
    }
}