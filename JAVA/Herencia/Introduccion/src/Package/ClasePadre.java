package Package;
import java.util.Scanner;
public class ClasePadre {
    //atributos de la clase
    protected  int Valor1,Valor2,Resultado;
    //Scanner para capturar los valores
    Scanner entrada = new Scanner(System.in);
    //Metodos de la clase
    public void  PedirDatos(){
        System.out.print("Dame el primer valor: ");
        Valor1 = entrada.nextInt();

        System.out.println("Dame el segundo dato: ");
        Valor2 = entrada.nextInt();

    }
    public void MostrarResultado(){
        System.out.println(Resultado);
    }
}
