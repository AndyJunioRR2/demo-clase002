package javaapplication2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Formatter;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("Flujos de salida");
        // Flujo de salida
        System.out.println("Hola mundo"); // Flujo de salida del .java a consola
        Formatter s2 = new Formatter("Clase1.txt");
        s2.format("Saludo: %s", "Saludos clase"); //Flujo de salida del .java a un archivo
        s2.close();
        Saludo obj1 = new Saludo("Saludos OUT - Objt1");
        //Flujo de salida del .java a un archivo "BASADO EN BITS"
        ObjectOutputStream fsb = new ObjectOutputStream(new FileOutputStream("ArchivoSaludos.dat"));
        fsb.writeObject(obj1);
        fsb.close();
        System.out.println("Flujos de entrada");
        //Flujo de entrada
        System.out.println(new Scanner(System.in).nextLine()); // Flujo de entrada de consola al programa
        System.out.println((new Scanner(new File("Clase1.txt")).nextLine())); //Flujo de entrada del archivo al programa / .java
        //Flujo de entrada desde archivo al .java "BASADO EN BITS"
        ObjectInputStream fsb1 = new ObjectInputStream(new FileInputStream("ArchivoSaludos.dat"));
        Saludo obj2 = (Saludo) fsb1.readObject(); // Deserealizacion
        System.out.println(obj2);
     }
}

class Saludo implements Serializable {

    public String saludos;

    public Saludo(String saludos) {
        this.saludos = saludos;
    }

    @Override
    public String toString() {
        return "Saludo{" + "saludos=" + saludos + '}';
    }
}
