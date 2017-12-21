package math;

public class FactorialRecursion {

    //Factorial calculation using Recursion
    public int factoRecursion(int n){
        if (n == 0){
            return 1;
        }else {
            return (n * factoRecursion(n-1));
        }
    }
}
