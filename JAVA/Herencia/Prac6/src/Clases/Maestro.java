package Clases;

public class Maestro extends Escuela{
    //Atributos de la clase
    private String Nombre_Maesstro, Departamento, Profecion;
    private int ID ;
    //Constructor de la clase
    public Maestro(String Nombre_Maesstro,String Departamento,String Profecion,int ID){
        this.Departamento = Departamento;
        this.ID = ID;
        this.Profecion = Profecion;
        this.Nombre_Maesstro = Nombre_Maesstro;

    }
    //Metodos
    public void Desplegar_Maestro(){
        System.out.println("Datos de maestro");
        System.out.println(Nombre_Maesstro);
        System.out.println(Profecion);
        System.out.println(Nombre_Escuela);
        System.out.println(Direccion);
        System.out.println(Telefono);
        System.out.println(ID);
        System.out.println(Departamento);

    }

}
