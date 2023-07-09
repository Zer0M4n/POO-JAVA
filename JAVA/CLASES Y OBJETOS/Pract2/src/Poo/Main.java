package Poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables que utilizamos
        String Nombre ;
        byte edad;
        float sueldo;
        int mesesT;//Meses de trabajo

        Scanner entrada = new Scanner(System.in);

        System.out.println("NOMBRE:");
        Nombre = entrada.next();
        System.out.println("EDAD:");
        edad = entrada.nextByte();
        System.out.println("SUELDO: ");
        sueldo = entrada.nextFloat();
        System.out.println("MESES TRABAJDOS: ");
        mesesT = entrada.nextInt();

        Empleado INFORMACION = new Empleado(Nombre,edad,sueldo,mesesT);

        INFORMACION.desplegar_Datos();


    }
}