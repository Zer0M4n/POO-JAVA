package Paquete;

public class Cilindro extends Areas{
    //Atributos de la clase
    private float Altura;
    //Constructor de la clase
    public Cilindro(float Altura, float radio){
        this.Altura = Altura;
        this.radio = radio;
    }
    //Metodos de la clase
    @Override
    public float Calcular_Area() {
        return (float)(2 * Math.PI * radio *(Altura + radio));
    }

    @Override
    public void Imprimir_Area() {
        System.out.println("AREA DEL CILINDRO ES " + Calcular_Area());
    }
}
