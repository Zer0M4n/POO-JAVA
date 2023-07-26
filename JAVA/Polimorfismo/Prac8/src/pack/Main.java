package pack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Varibles
        float Lado, Base, Altura, Numero_Lados;
        byte opc;
        boolean Or = true;
        Scanner Entrada = new Scanner(System.in);//Entrada de datos

        do {
            System.out.println("******************Menu******************");
            System.out.println("1)Rombo\n2)Romboide\n3)Poligono Regular\n4)Salir");
            System.out.print("Que desea hacer? ");
            opc = Entrada.nextByte();
            switch (opc){
                case 1:
                    System.out.println("******************Rombo******************");
                    //Capturamos variables
                    System.out.print("Lado: ");
                    Lado = Entrada.nextFloat();

                    //Objeto de la clase
                    Rombo ROM = new Rombo(Lado);

                    //LLamamos los metodos
                    ROM.Desplegar_Resultado();
                    break;
                case 2:
                    System.out.println("******************Romboide******************");

                    System.out.print("Base: ");
                    Base = Entrada.nextFloat();

                    System.out.println("Altura: ");
                    Altura = Entrada.nextFloat();

                    Romboide ROBI = new Romboide(Base,Altura);

                    ROBI.Desplegar_Resultado();
                    break;
                case 3:
                    System.out.println("******************Poligono Regular******************");

                    System.out.print("Lado: ");
                    Lado = Entrada.nextFloat();

                    System.out.print("Numero de lados: ");
                    Numero_Lados = Entrada.nextFloat();

                    Poligono_Regular Pol = new Poligono_Regular(Lado,Numero_Lados);

                    Pol.Desplegar_Resultado();
                    break;
                case 4:
                    Or = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (Or);
    }
}