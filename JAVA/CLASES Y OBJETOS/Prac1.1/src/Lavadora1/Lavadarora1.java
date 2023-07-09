package Lavadora1;
import Libreria.Funciones;

import java.util.Scanner;

public class Lavadarora1 {
    public static  void  main(String[] arg){
        int TipoDeRopa, Kilos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Precione[1] - Ropa blanca, [2]-Ropa de color");
        TipoDeRopa = entrada.nextInt();

        System.out.println("Cuantos kilos de ropa");
        Kilos = entrada.nextInt();

        Funciones mensajero = new Funciones(Kilos,TipoDeRopa);

        mensajero.Ciclo_Finalizado();

    }
}
