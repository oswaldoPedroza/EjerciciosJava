package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.println("El resultado equivalente en la tabla ASCII es: " + (char)numero);
    }
}
