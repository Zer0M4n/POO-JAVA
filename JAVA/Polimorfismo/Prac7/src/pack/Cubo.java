package pack;

public class Cubo extends Figuras{
    //Constructor de la clase
    public Cubo(float Lado){
        this.Lado = Lado;
    }
    //Metodos de la clase

    @Override
    public double Calcular_Area() {
        return Math.pow(Lado, 3);
    }

    @Override
    public void Desplegar_Area() {
        System.out.println("Lado: " + Lado + "\nArea del cubo: " + Calcular_Area() );
    }
}
