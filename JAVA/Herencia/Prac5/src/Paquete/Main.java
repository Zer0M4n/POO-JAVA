package Paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        //Variables
        float Altura, radio;
        boolean Op = true;
        byte opc;
        Scanner entrada = new Scanner(System.in);//objeto para capturar variables
        do {
            System.out.println("1)Circulo\n2)Cilindro\n3)Esfera\n4)Salida del programa");
            System.out.println("\nQue desea escoger?  ");
            opc = entrada.nextByte();
            switch (opc){
                case 1:
                    //Capturamos los datos para el circulo
                    System.out.print("radio: ");
                    radio = entrada.nextFloat();

                    Circulo circle = new Circulo(radio);

                    //Invocamos los metodos
                    circle.Imprimir_Area();
                    break;
                case 2:
                    //Capturamos los datos de la Cilindro
                    System.out.print("radio: ");
                    radio = entrada.nextFloat();

                    System.out.print("Altura: ");
                    Altura = entrada.nextFloat();

                    //Crear objeto
                    Cilindro cilindro = new Cilindro(radio,Altura);
                    //LLAMAMOS AL LOS METODOS
                    cilindro.Imprimir_Area();
                    break;
                case 3:
                    //Capturamos los datos del Esfera
                    System.out.print("radio: ");
                    radio = entrada.nextFloat();

                    //Creamos un objeto
                    Esfera ESFERA = new Esfera(radio);
                    //llammamos a los metodos
                    ESFERA.Imprimir_Area();
                    break;
                case 4:
                    Op = false;
                    break;
            }

        }while (Op);

    }
}
