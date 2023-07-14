package Clases;

public class Carta {
    //Atributos de la clase
    private int Numero;
    private  String Palo;
    public static final int LIMITE_CARTA_PALO = 12;
    public  static  final  String[] PALOS= {"ESPADAS","Copas","Oros","Bastos"};

    //Constructor de la clase
    public Carta(int Numero,String Palo){
        this.Numero = Numero;
        this.Palo = Palo;
    }
    //Metodos de la clase
    @Override
    public  String toString(){
        return "Numero" +Numero + " ,palo" + Palo;
    }
}
