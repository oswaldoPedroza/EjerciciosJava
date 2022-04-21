package ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        final double IVA=0.21;
        String texto= JOptionPane.showInputDialog("Introduce el precio de el producto: ");
        double precio=Double.parseDouble(texto);
        double precioFinal=precio+(precio*IVA);
        System.out.println(precioFinal);
    }
}
