package pack;

public class Rombo extends Datos implements Perimetros{
   //Constructor de la clase
    public Rombo(float Lado){
        this.Lado = Lado;
    }
    //Metodos de la clase
    @Override
    public float Calcular_Poligono() {
        return 4 * Lado ;
    }

    @Override
    public void Desplegar_Resultado() {
        System.out.println("Perimetro: " + Calcular_Poligono());
    }
}
