package View;
import Controller.Empleado;
import java.util.ArrayList;
public class EjecutorEmpleado {
    public static void main(String[] args) {
        //Version 1: Objetos individuales
        //Empleado emp = new Empleado("Segi", 2000, 23);
        //System.out.println(emp);
        
        //Version 2: Arreglo ESTATICOS de objs.
        /*Empleado empleados[] = {new Empleado("Segi", 2000, 23),new Empleado("Nicole", 1500, 22)};
        for (Empleado emp : empleados)
        System.out.println(emp);*/
        
        //Version 3: Arreglos DINAMICOS de objs. List de objs.
        ArrayList<Empleado> listaEmp = new ArrayList<Empleado>();
        listaEmp.add(new Empleado("Segi", 2000, 23));
        listaEmp.add(new Empleado("Nicole", 1500, 22));
        for (Empleado emp : listaEmp)
        System.out.println(emp);
    }
    
}
