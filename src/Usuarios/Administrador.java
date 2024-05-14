package Usuarios;

import java.util.Scanner;

public class Administrador {
    Scanner scanner = new Scanner(System.in);
    int opcion;
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
                System.out.println("Quedo bien melo");
            } else {
                ciclo = 1;
                System.out.println("Usuario y/o contraseña incorrecta");
            }

        }while (ciclo == 1);
    }
}
