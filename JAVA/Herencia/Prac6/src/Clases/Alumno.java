package Clases;

public class Alumno extends Escuela{
    //Atributos de la clase
    private String Nombre_Alumno, Carrera;
    private int Numero_Control;
    private byte Semestre;

    //Constructor de la clase
    public Alumno(String Nombre_Escuela,String Direccion, String Telefono,String Nombre_Alumno, String Carrera, int Numero_Control,byte Semestre){
        super(Nombre_Escuela,Direccion,Telefono);
        this.Nombre_Alumno =Nombre_Alumno;
        this.Carrera = Carrera;
        this.Numero_Control = Numero_Control;
        this.Semestre = Semestre;

    }

    //Metodos del alumno
    public void Desplegar_Alumno(){

        System.out.println("Datos de la Alumno");
        System.out.println(Nombre_Alumno);
        System.out.println(Semestre);
        System.out.println(Nombre_Escuela);
        System.out.println(Direccion);
        System.out.println(Telefono);
        System.out.println(Numero_Control);
        System.out.println(Carrera);

    }
}
