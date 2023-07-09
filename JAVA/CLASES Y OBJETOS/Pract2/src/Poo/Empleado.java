package Poo;

public class Empleado {
    private String Nombre ;
    private byte edad;
    private float sueldo;
    private  int mesesT;
    public  Empleado(String Nombre, byte edad, float sueldo, int mesesT) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.mesesT = mesesT;

    }
    public float Calcular_Sueldo(){
        return sueldo * mesesT;
    }
    public void  desplegar_Datos(){
        System.out.println("Nombre: " + Nombre +"\nEdad: " +edad+"\nSueldo: " +sueldo+"\nMeses Trabajados: "+ mesesT+"Sueldo total: "
                +Calcular_Sueldo());

    }
}
