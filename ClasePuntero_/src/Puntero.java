public class Puntero {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        Persona referencia = persona1;
        System.out.println("Persona original: " + persona1);
        referencia.setNombre("Pedro");
        referencia.setEdad(25);
        System.out.println("Persona modificada: " + referencia);
    }
}