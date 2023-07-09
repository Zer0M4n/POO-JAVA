package Libreria;
//Logica del programa
//Funciones de la lavadora
public class Funciones {
    //Atributos de la clase
    private int Kilos = 0 , LLenadoCompleto = 0, TipoDeRopa = 0,LavadoCompleto = 0, SecadoCompleto = 0;
    //Constructor de la clase
    public  Funciones(int Kilos,int TipoDeRopa)
    {
        this.Kilos = Kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    //Metodos de la clase

    private void  LLenado(){//Nos avisara si la lavadora se lleno

        if (Kilos <= 12){
            LLenadoCompleto = 1;
            System.out.println("LLenando....");
            System.out.println("LLenado Completo");
        }else {
            System.out.println("La carga de ropa es muy pesada");
        }//Fin de la condicion

    }//Fin de la funcion

    private void Lavado(){//Metodo para lavar
        LLenado();//LLamamos el metodo
        if (LLenadoCompleto == 1){
            if (TipoDeRopa == 1){
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else if (TipoDeRopa == 2) {

                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando");
                LavadoCompleto = 1;
            }else {
                System.out.println("Tipo de ropa no disponible");
                System.out.println("Se lavara de color / Lavado rudo");
                LavadoCompleto = 1;
            }
        }// Fin de la funcion
    }//Fin del metodo

    private  void  Secado(){//Sirve para verificar secado
        Lavado();//LLamos la funcion
        if (LavadoCompleto == 1){
            System.out.println("Secando..");
            SecadoCompleto = 1;
        }//Fin de la condicion
    }//Fin del metodo

    public void Ciclo_Finalizado(){
        Secado();
        if (SecadoCompleto == 1){
            System.out.println("Ropa ListA");
        }
    }//Fin del metodo

}
