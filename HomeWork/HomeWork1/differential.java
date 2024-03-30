package HomeWork1;

public class differential {
    public static void main(String[] args) {
        double x = 1.0;
        double h = 0.000000001;
        double result = differentialCalculate(x,h);

        System.out.println("函数f(x)在x = "+ x +"时微分值为： "+ result );
    }

    public static double differentialCalculate(double x , double h){
        double fx1 = 1/(1+Math.exp((-0.085)*(x+h)));
        double fx2 = 1/(1+Math.exp((-0.085)*(x-h)));

        double result = (fx1-fx2)/(2*h);
        return result;
    }
}
