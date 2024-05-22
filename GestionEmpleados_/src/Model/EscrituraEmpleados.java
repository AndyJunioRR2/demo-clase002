package Model;
import Controller.Empleado;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class EscrituraEmpleados {
    public ArrayList<Empleado> listEmpleados;
    public ObjectOutputStream flujoSalidaEmp;
    public FileOutputStream pathArch;
    public EscrituraEmpleados(ArrayList<Empleado> listEmpleados,FileOutputStream pathArch) {
        this.listEmpleados = listEmpleados;
        this.pathArch = pathArch;
    }
    public void escribirEmpArchivo(){
        try {
            this.flujoSalidaEmp = new ObjectOutputStream(pathArch);
            for (Empleado emp: listEmpleados ) {
                flujoSalidaEmp.writeObject(emp);
                flujoSalidaEmp.close();
            }
        } catch (Exception e) {
        }
    }
}
