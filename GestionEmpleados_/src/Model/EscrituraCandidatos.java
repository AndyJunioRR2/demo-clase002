package Model;
import Controller.Empleado;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class EscrituraCandidatos {
    public ArrayList<Candidatos> listCandidatos;
    public ObjectOutputStream flujoSalidaCan;
    public FileOutputStream pathArch;
    public EscrituraCandidatso(ArrayList<Candidato> listCandidatos,FileOutputStream pathArch) {
        this.listEmpleados = listCandidatos;
        this.pathArch = pathArch;
    }
    public void escribirEmpArchivo(){
        try {
            this.flujoSalidaCan = new ObjectOutputStream(pathArch);
            for (Candidatos can: listCandidatos ) {
                flujoSalidaCan.writeObject(can);
                flujoSalidaCan.close();
            }
        } catch (Exception e) {
        }
    }
}
