package Model;

import Controller.Empleado;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LecturaCandidatos {
    public ArrayList<LecturaCandidatos> listaCandidatos;
    public ObjectInputStream flujoEntradaCan;
    public FileInputStream pathArch;

    public ArrayList LecturaCandidatos(FileInputStream pathArch) {
        this.pathArch = pathArch;
    }
    public ArrayList lecturaCandidatosArchivo(){
        int i = 0;
        try {
            flujoEntradaCan = new ObjectInputStream (pathArch);
            while(true){
                listaCandidatos.add( (LecturaCandidatos) flujoEntradaCan.readObject() );
                System.out.println(listaCandidatos.get(i));
                i++;
            }
        } catch (EOFException error){
           // return;
        return listaCandidatosan;
        } catch (Exception e) {
        }
    }
}

