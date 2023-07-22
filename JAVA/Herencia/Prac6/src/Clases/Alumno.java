package Clases;

public class Alumno extends Escuela{
    //Atributos de la clase
    private String Nombre_Alumno, Carrera;
    private int Numero_Control;
    private byte Semestre;

    //Constructor de la clase
   
    public Alumno(String Nombre_Escuela, String Direccion, String Telefono) {
        super(Nombre_Escuela, Direccion, Telefono);
    }
}
