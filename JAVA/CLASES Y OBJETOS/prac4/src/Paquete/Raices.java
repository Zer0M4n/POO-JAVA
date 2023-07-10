package Paquete;

public class Raices {
    //Atributos de la clase
    private double a , b , c;
    //Constructor de la clase
    public Raices(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Metodos de la clase
    private  void  Obtener_Raices() {//mETODO PARA EL CASO DE TENER DOS RAICES
        double x1 = (-b+Math.sqrt(getDiscriminante()))/(2*a) ,
                x2 = (-b-Math.sqrt(getDiscriminante()))/(2*a);
        System.out.println("Solucion x1");
        System.out.println(x1);
        System.out.println("Solucion x2");
        System.out.println(x2);
    }
    private void ObtenerRaiz(){//Metodo en caso de tener una raiz
        double x = (-b)/(2*-a);
        System.out.println("Solucion unica");
        System.out.println("X es igual a " + x);
    }
    private double getDiscriminante() {//Calcula el discriminante
        return Math.pow(b,2)-(4*a*c);
    }
    private boolean tiene_Raices(){//verifica si tiene mas de una raiz
        return  getDiscriminante() > 0;
    }
    private  boolean tiene_Raiz(){//Verifica si tiene una raiz
        return getDiscriminante() == 0;
    }
    public  void Calcular(){//Selecciona cual se va calcular

        if (tiene_Raices()){
            Obtener_Raices();
        } else if (tiene_Raiz()) {
            ObtenerRaiz();
        }else {
            System.out.println("No tiene raiz");
        }

    }//Fin del metodo calcular

}//Fin de la clase
