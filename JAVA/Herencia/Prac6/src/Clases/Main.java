package Clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        String Nombre_Alumno, Carrera, Nombre_Escuela,Direccion,Telefono;
        String Nombre_Maesstro, Departamento, Profecion;
        int Numero_Control;
        int ID = 0 ;
        byte Semestre;
        Scanner Entrada = new Scanner(System.in);//Objeto de Para variables

        //Datos de la escuela
        System.out.println("Nombre de la escuela");
        Nombre_Escuela = Entrada.next();
        System.out.println("Direccion");
        Direccion = Entrada.next();
        System.out.println("Telefono");
        Telefono = Entrada.next();
        Escuela school = new Escuela(Nombre_Escuela,Direccion,Telefono);

        //Datos del maestro
        System.out.println("Datos del Maestro");
        System.out.println("Nombre del maestro");
        Nombre_Maesstro = Entrada.next();
        System.out.println("Nombre del Departamento");
        Departamento = Entrada.next();
        System.out.println("Profesion");
        Profecion = Entrada.next();
        System.out.println("ID");
        ID = Entrada.nextInt();

        //Constructor de la clase Maestro
        Maestro Master = new Maestro(Nombre_Escuela,Telefono,Direccion,Nombre_Maesstro,Departamento,Profecion,ID);
        //Datos del alumno

        school.Desplegar_Escuela();
        Master.Desplegar_Maestro();
    }
}