package View;
import Controller.Empleado;
import java.util.ArrayList;
public class Ejecutor Camapana Electoral {
    public static void main(String[] args) {
        Version 1: Objetos individuales
         emp = new Candidato("Candidato");
        System.out.println(emp);
        
        Version 2: Arreglo ESTATICOS de objs.
        Candidato candidato[] = {new Candidato("Candidato"),new Candidato("Candidato")};
        for (Candidato can : candidato)
        System.out.println(can);*/
        
        Version 3: Arreglos DINAMICOS de objs. List de objs.
        ArrayList<Candidato> listaCan = new ArrayList<Candidato>();
        listaEmp.add(new Empleado("candidato" ));
        listaEmp.add(new Empleado("candidato" ));
        for (Candidato can : listaCan)
        System.out.println(can);
    }

}
