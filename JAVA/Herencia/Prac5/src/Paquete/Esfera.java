package Paquete;

public class Esfera extends Areas {
    //Constructor de la clase
    public Esfera(float radio){
        this.radio = radio;
    }
    //Metodos de la clase
    @Override
    public float Calcular_Area() {
        return (float)(4 * Math.PI *Math.pow(radio,2));
    }

    @Override
    public void Imprimir_Area() {
        System.out.println("Area de la esfera es" + Calcular_Area());
    }
}
