package Controller;
public class Candidato {
    public String nombre;
    public double actividad electoral;
    public int resultado;

    public Candidato(String nombre, double actividad, int resultado) {
        this.nombre = nombre;
        this.actividad = actividad;
        this.resultado = resultado;
    }
    @Override
    public String toString() {
        return "candidato{" + "nombre=" + nombre + ", actividad=" + actividad + ", resultado=" + resultado + '}';
    }   
}
