package Main;
//Importamos las clases
import Package.ClaseHija_Suma;
import  Package.ClaseHija_Resta;
public class ClasePrincipal {
    public  static  void main(String[] arg){
        //Objeto de la clase hija
        ClaseHija_Suma Mensajero = new ClaseHija_Suma();
        //LLamamos a los metodos
        Mensajero.PedirDatos();
        Mensajero.Sumar();
        Mensajero.MostrarResultado();
        //Objeto de la clase hija resta
        ClaseHija_Resta Mensajero2 = new ClaseHija_Resta();
        //LLamamos a los metodos
        Mensajero2.PedirDatos();
        Mensajero2.Restar();
        Mensajero2.MostrarResultado();

    }
}
