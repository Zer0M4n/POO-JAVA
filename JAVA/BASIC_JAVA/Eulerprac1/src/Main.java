//<p>If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$. The sum of these multiples is $23$.</p>
//<p>Find the sum of all the multiples of $3$ or $5$ below $1000$.</p>
public class Main {
    public static void main(String[] args) {
        int Number = 1000;
        int result = 0;
        for (int i = 0; i<Number; i++){

            if(i % 3 == 0 || i % 5 == 0){
                result = result + i;
                System.out.println(i);
            }
        }
        System.out.println("Resultado de la suma de los multiplos " + result);


    }
}