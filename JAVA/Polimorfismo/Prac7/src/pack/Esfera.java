package pack;

public class Esfera extends Figuras{
    //Constructor de la clase
    public Esfera(float Radio){
        this.Radio = Radio;
    }
    //Metodos de la clase
    @Override
    public void Desplegar_Area() {
        System.out.println("Area de la esfera: " + Calcular_Area());
        System.out.println("Radio de la esfera: " + Radio);
    }

    @Override
    public double Calcular_Area() {
        return ((double) 4 /3) * Math.PI * Math.pow(Radio, 3);
    }
}
