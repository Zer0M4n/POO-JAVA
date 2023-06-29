import java.util.Scanner;
public class Main {
    public  float Calcular_promedio(float Materia1,float Materia2, float Materia3){
        return (Materia1 + Materia2 +Materia3)/3;
    }
    public  void  Desplegar(float Materia1,float Materia2, float Materia3){

        System.out.println("Promedio es "+ Calcular_promedio(Materia1,Materia2,Materia3));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//contructor

        String opc = "a";
        boolean l = false;
        float Materia1 ,Materia2,Materia3;

        do {
            System.out.println("Que desea ? \nA)Promedio \nB)Salir");
            opc = sc.next();
            switch (opc){

                case "A":
                    System.out.println("Materia 1");
                    Materia1 = sc.nextFloat();
                    System.out.println("Materia 2");
                    Materia2 = sc.nextFloat();
                    System.out.println("Materia 3");
                    Materia3 = sc.nextFloat();

                    Main funciones = new Main();

                    funciones.Desplegar(Materia1,Materia2,Materia3);
                    break;
                case "B":
                    l = true;
                    break;
            }
        }while (l == false);


    }
}