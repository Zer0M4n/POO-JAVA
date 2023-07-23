package Clases;

public class Escuela {
    //Atributos de la clase
    public String Nombre_Escuela,Direccion,Telefono;

    public Escuela(String Nombre_Escuela,String Direccion, String Telefono) {
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Nombre_Escuela = Nombre_Escuela;
    }



    //Constructor de la escuela
    //METODOS DE LA CLASE
    protected void Desplegar_Escuela(){
        System.out.println(Nombre_Escuela + " " + Direccion +" " + Telefono);
    }
}
