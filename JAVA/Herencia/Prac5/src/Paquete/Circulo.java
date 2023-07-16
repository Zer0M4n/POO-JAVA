package Paquete;

public class Circulo extends Areas{
    //Constructor de la clase
    public Circulo(float radio){
        this.radio = radio;
    }
    //Metodos de la clase
    @Override
    public float Calcular_Area() {
        return (float) (Math.PI * Math.pow(radio,2));
    }

    @Override
    public void Imprimir_Area() {
        System.out.print("Area del circulo es " + Calcular_Area());
    }
}
