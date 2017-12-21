package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */

        int num1 = 0;
        int num2 = 1;
        int num3;
        int i;
        int count = 40;

        for(i = 2;i < count ; ++i){
            num3 = num1 + num2;
            System.out.println(" "+num3);// Printing 40 Fibonacci numbers.
            num1=num2;
            num2=num3;
        }
    }
}
