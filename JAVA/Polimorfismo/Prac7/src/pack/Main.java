package pack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        float Radio, Altura, Lado;
        boolean Or = true;
        byte Opc ;
        Scanner Entrada = new Scanner(System.in);//Constructor para capturar los datos

        do {
            System.out.println("************Menu************");
            System.out.println("1)Esfera\n2)Cubo\n3)Cilindro\n4)Cono\n5)Salir del programa");
            System.out.print("Que desea escoger? ");
            Opc = Entrada.nextByte();
            switch (Opc) {
                case 1 -> {
                    //Capturamos los valores
                    System.out.print("Radio: ");
                    Radio = Entrada.nextFloat();

                    //Creamos el objeto
                    Esfera ESF = new Esfera(Radio);

                    //Invocamos los metodos
                    ESF.Desplegar_Area();
                }
                case 2 -> {
                    //Capturmos los valores
                    System.out.print("Lado: ");
                    Lado = Entrada.nextFloat();

                    //Creamos el objeto
                    Cubo CUB = new Cubo(Lado);

                    //Invocamos los metodos
                    CUB.Desplegar_Area();
                }
                case 3 -> {
                    //Capturamos los datos
                    System.out.print("Radio: ");
                    Radio = Entrada.nextFloat();
                    System.out.print("Altura: ");
                    Altura = Entrada.nextFloat();
                    //Creamos el objeto
                    Cilindro CILIN = new Cilindro(Radio, Altura);
                    //Invocamos  los metodos
                    CILIN.Desplegar_Area();
                }
                case 4 -> {
                    //Capturamos los datos
                    System.out.print("Radio: ");
                    Radio = Entrada.nextFloat();
                    System.out.print("Altura: ");
                    Altura = Entrada.nextFloat();
                    //Creamos el objeto
                    Cono Con = new Cono(Radio, Altura);
                    //LLammos los metodos
                    Con.Desplegar_Area();
                }
                case 5 -> Or = false;
                default -> System.out.println("Esa opcion no esta disponible");
            }
        }while (Or);
    }
}