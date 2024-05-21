package javaapplication2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException {
        // Flujo de salida
        System.out.println("Hola mundo");
        Formatter s = new Formatter("test.txt"); 
        s.format("%s", "Andy fallo un poco");
        s.close();
        //Flujo de entrada
        Scanner e = new Scanner(System.in);
        String saludo = e.nextLine();
        System.out.println("Ingreso es: " + saludo);
        Scanner s1 = new Scanner(new File("test.txt"));
        String valor = s1.nextLine();
        System.out.println("El valor leido del archivo es: " +valor);
    }
}
