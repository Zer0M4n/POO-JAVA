package pack;

public class Romboide extends Datos  implements Perimetros{
    //Constructor de la clase
    public Romboide(float Base, float Altura){
        this.Base = Base;
        this.Altura = Altura;
    }
    //Metodos de la clase
    @Override
    public float Calcular_Poligono() {
        return (2*Base) + (2*Altura);
    }

    @Override
    public void Desplegar_Resultado() {
        System.out.println("Perimetro: " + Calcular_Poligono());
    }
}
