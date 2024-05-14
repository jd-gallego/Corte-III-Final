package Usuarios;

import java.util.Scanner;

public class Vendedor {
    Scanner scanner = new Scanner(System.in);
    String usuario;
    int contrasena;
    int ciclo;

    public void vendedor(){

        do{
        System.out.println("Usuario: vendedor ; Contraseña: 123");
        System.out.print("Escriba el usuario: ");
        usuario = scanner.nextLine();
        System.out.print("Escriba la contraseña: ");
        contrasena = scanner.nextInt();

        if (usuario.equals("vendedor") && contrasena == 123) {
            ciclo = 0;
            System.out.println("Quedo bien melo");
        } else {
            ciclo = 1;
            System.out.println("Usuario y/o contraseña incorrecta");
        }

    }while (ciclo == 1);
    }
}
