package HomeWork;

public class Factorial {
    public static void main(String[] args) {
        int p = 30 , q = 7;
        double result = factorial(p) / (factorial(q)*factorial(p-q));
        System.out.println(result);
    }
    public static double factorial(int n){
        double result=1.0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
