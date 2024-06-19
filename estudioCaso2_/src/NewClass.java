public class NewClass {
    public static void main(String[] args) {
        
    }
}
class Trabajo {
    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;
    public Trabajo(){}
    public Trabajo(int id, String descripcion, int plazo) {
        this.id = id;
        this.descripcion = descripcion;
        this.plazo = plazo;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void aumentarHoras(double numHoraIncr){
        this.numeroHoras+= numHoraIncr; // numeroHoras = numeroHoras + numHorasIncr;
    } 
    public void calcularCostoTrabajo(){
        this.costoTrabajo = this.numeroHoras * 30;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", descripcion=" + descripcion + ", numeroHoras=" + numeroHoras + ", estado=" + estado + ", costoTrabajo=" + costoTrabajo + ", plazo=" + plazo + '}';
    }
}
class ReparacionMecanica extends Trabajo {
    public double precioMaterial;
    public ReparacionMecanica(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }
    @Override
    public void calcularCostoTrabajo(){};
    public void aumentarPrecio(){};

    @Override
    public String toString() {
        return "ReparacionMecanica{" +super.toString() +"precioMaterial=" + precioMaterial + '}';
    }
    
}
class ReparacionChapasPintura extends Trabajo{
    public double precioMaterial;
    public ReparacionChapasPintura(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }
    @Override
    public void calcularCostoTrabajo(){};
    public void aumentarPrecio(){};

    @Override
    public String toString() {
        return "ReparacionChapasPintura{" +super.toString()+ "precioMaterial=" + precioMaterial + '}';
    }
}
class Revision extends Trabajo{
    public Revision(int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
    }
    @Override
    public void calcularCostoTrabajo(){};
}

