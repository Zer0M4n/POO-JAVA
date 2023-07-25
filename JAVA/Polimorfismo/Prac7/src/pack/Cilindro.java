package pack;

public class Cilindro extends Figuras{
    //Constructor de la clase
    public Cilindro(float Radio, float Altura){
        this.Radio = Radio;
        this.Altura = Altura;
    }
    //Metodos de la clase

    @Override
    public void Desplegar_Area() {
        System.out.println("Altura: " + Altura + "\nRadio: " +  Radio + "\n El area del cilindro" + Calcular_Area() );
    }

    @Override
    public double Calcular_Area() {
        return Math.PI * Math.pow(Radio,2) * Altura;
    }
}
