package pack;

public class Cono extends Figuras{
    //Constructor de la clase
    public Cono(float Radio, float Altura){
        this.Radio = Radio;
        this.Altura = Altura;
    }
    //Metodos de la clase
    @Override
    public double Calcular_Area() {
        return (1/3f)*Math.PI * Math.pow(Radio,2) * Altura;
    }

    @Override
    public void Desplegar_Area() {
        System.out.println("Radio: " + Radio + "\nAltura: " +Altura + "\nArea del cono: " + Calcular_Area());
    }
}
