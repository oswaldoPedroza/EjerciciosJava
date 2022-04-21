package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;

        System.out.print("Ingrese un caracter: ");
        caracter = sc.next().charAt(0);

        System.out.println("El caracer se encuentra en la posición " + (int)caracter + " de la tabla ASCII");
    }
}
