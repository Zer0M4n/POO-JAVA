//IMPORTAMOS LA LIBRERIA
import java.io.Console;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CREAMOS EL OBJETO PARA CAPTURAR
        Scanner sc = new Scanner(System.in);
        int EDAD = 0;
        String nombre = "";
        float Ingresos = 0.0f;

        System.out.println("Cual es tu nombre?");
         nombre = sc.nextLine();
        System.out.println("Cual es tu edad?");
        EDAD = sc.nextInt();
        System.out.println("ingresos MENSUSALES");
        Ingresos = sc.nextFloat();

        if (EDAD >= 18 && Ingresos> 1500){
            System.out.println("Nombre: "+nombre+"\nEDAD: "+ EDAD+ "\nIngresos: "+Ingresos);
            System.out.println("piedes entranr");
        }
        else {
            System.out.println("No puedes entrar");
        }
    }
}