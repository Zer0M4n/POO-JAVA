package Clases;

public class Carta {
    private int Numero;
    private  String Palo;
    public static final int LIMITE_CARTA_PALO = 12;
    public  static  final  String[] PALOS= {"ESPADAS","Copas","Oros","Bastos"};

    public Carta(int Numero,String Palo){
        this.Numero = Numero;
        this.Palo = Palo;
    }
    @Override
    public  String toString(){
        return "Numero" +Numero + " ,palo" + Palo;
    }
}
