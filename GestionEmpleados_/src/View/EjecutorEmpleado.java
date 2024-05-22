package View;

import Controller.Empleado;
import Model.EscrituraEmpleados;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class EjecutorEmpleado {

    public static void main(String[] args) {
        ArrayList<Empleado> listEmp = new ArrayList<Empleado>(Arrays.asList(
                new Empleado("Anthony", 1000, 23),
                new Empleado("Marco", 1500, 21),
                new Empleado("Suanny", 2000, 24)));
        try {
            FileOutputStream pathArchivo = new FileOutputStream("DataEmpleados.dat");
            EscrituraEmpleados escrituraEmp = new EscrituraEmpleados(listEmp, pathArchivo);
            escrituraEmp.escribirEmpArchivo();
        } catch (Exception e) {
        }

    }
}
