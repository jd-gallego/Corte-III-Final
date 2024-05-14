package Usuarios;

import java.util.Scanner;

public class Gerente {
    Scanner scanner = new Scanner(System.in);
    String usuario;
    int contrasena;
    int ciclo;

    public void gerente(){

        do{
        System.out.println("Usuario: gerente ; Contraseña: 12");
        System.out.print("Escriba el usuario: ");
        usuario = scanner.nextLine();
        System.out.print("Escriba la contraseña: ");
        contrasena = scanner.nextInt();

        if (usuario.equals("gerente") && contrasena == 12) {
            ciclo = 0;
            System.out.println("Quedo bien melo");
        } else {
            ciclo = 1;
            System.out.println("Usuario y/o contraseña incorrecta");
        }

    }while (ciclo == 1);
    }
}
