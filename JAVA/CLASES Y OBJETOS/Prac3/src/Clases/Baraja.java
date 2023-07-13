package Clases;

import java.util.Random;

public class Baraja {
    private  Carta cartas[];
    private  int Pos_SiguienteCarta;//
    private  static  final  int NUM_CARTAS = 40;
    Random NumeroAleatorio = new Random();
    //Constructor de la clase

    public Baraja(){
        this.cartas = new Carta[NUM_CARTAS];
        this.Pos_SiguienteCarta = 0;
        CREAR_BARAJA();
        Barajar();
    }
    //Metodos de la clase
    public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    public void Barajar(){
        int Pos_Aleatoria = 0;
        Carta c;
        for (int i = 0; i < cartas.length; i++){
            Pos_Aleatoria = generaNumeroEnteroAleatorio (0,NUM_CARTAS-1);
            c = cartas[i];
            cartas[i] = cartas[Pos_Aleatoria];
            cartas[Pos_Aleatoria] = c;
        }

    }


    private  void  CREAR_BARAJA(){
        String[] palos = Carta.PALOS;
        for (int i = 0; i< palos.length;i++){

            for (int j = 0; j< Carta.LIMITE_CARTA_PALO;j++){
                if (!(j == 7 || j==8)){
                    if (j >= 9){
                        cartas[ ((i *(Carta.LIMITE_CARTA_PALO-2))+ (j-2))] = new Carta(j+1,palos[i]);
                    }else {
                        cartas[(i *(Carta.LIMITE_CARTA_PALO - 2) + j)] = new Carta(j+1,palos[i]);
                    }
                }
            }
        }
    }
    public Carta SiguienCarta(){
        Carta c = null;
        if (Pos_SiguienteCarta == NUM_CARTAS){
            System.out.println("ya no hay cartas");
        }else {
            c = cartas[Pos_SiguienteCarta++];
        }
        return c;
    }

    public Carta[] darCartas(int numCartas){
        if (numCartas > NUM_CARTAS){
            System.out.println("No se puede dar  cartas");
        }
        else {
            if (Cartas_Disponibles() < numCartas){
                System.out.println("No hay suficinete cartas");
            }else {
                Carta[] cartaDar = new Carta[numCartas];

                for (int i = 0; i< cartaDar.length; i++){
                    cartaDar[i] = SiguienCarta();

                }
                return cartas;
            }
        }
        return null;
    }
    public int Cartas_Disponibles(){
        return NUM_CARTAS-Pos_SiguienteCarta;
    }
    public  void Cartas_Monton(){
        if (Cartas_Disponibles() == NUM_CARTAS){

        }else {
            for (int i = 0; i< Pos_SiguienteCarta;i++){
                System.out.println(cartas[i]);
            }
        }
    }
    public void Mostrar_Baraja(){
        if (Cartas_Disponibles()==0){
            System.out.println("No hay cartas para mostrar");
        }else {
            for (int i = Pos_SiguienteCarta; i < cartas.length; i++){
                System.out.println(cartas[i]);
            }
        }

    }
}

