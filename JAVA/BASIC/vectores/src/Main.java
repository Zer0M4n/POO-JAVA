public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] number = {1,2,3,4,5};

        System.out.println(number[2]);

        //array con varias varibles
        String[] name = new String[3];
        name[0] = "juan";
        name[1] = "kyle";
        name[2] = "pedro";


        for (int i = 2; i >= 0;i = i -1){
            System.out.println(name[i]);
        }

        //matrizes
        int[][] matriz = new  int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        for (int filas = 0; filas < matriz.length;filas++){

            for (int columnas = 0; columnas < matriz.length; columnas++){
                System.out.println(matriz[filas][columnas]);
            }
            System.out.println();
        }
    }
}