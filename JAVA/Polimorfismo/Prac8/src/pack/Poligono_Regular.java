package pack;

public class Poligono_Regular extends Datos implements Perimetros{
    //Constructor de la clase
    public Poligono_Regular(float Lado, float Numero_Lados ){
        this.Lado = Lado;
        this.Numero_Lados = Numero_Lados;
    }
    //Datos de la clase
    @Override
    public float Calcular_Poligono() {
        return Lado * Numero_Lados;
    }

    @Override
    public void Desplegar_Resultado() {

    }
}
