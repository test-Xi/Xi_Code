package HomeWork1;

public class Integral {
    public static void main(String[] args) {
        double a = 0.0;//下限
        double b = 1.0;//上限

        int n = 1000;//平均分为1000份
        //第一题
        double result1 =  calculateIntegral1(a,b,n);
        System.out.println("result1 = "+result1);
        //第二题
        double result2 = calculateIntegral2(a,b,n);
        System.out.println("result2 = "+result2);
        //第三题
        a = -1.0;
        b = 1.0;
        double result3 = calculateIntegral3(a,b,n);
        System.out.println("result = "+result3);
    }

    public static double calculateIntegral1(double a ,double b , int n){
        double dx = (b-a)/n;
        double result = 0.0;
        for (int i = 0; i < n; i++) {
            double x0 = a+i*dx;
            double fx = 4.0/(1.0+(x0)*(x0));
            double sum = dx*fx;
            result += sum;
        }
        return result;
    }

    public static double calculateIntegral2(double a ,double b , int n){
        double dx = (b-a)/n;
        double result = 0.0;
        for (int i = 0; i < n; i++) {
            double x0 = a+i*dx;
            double fx = Math.sin(x0)-Math.cos(x0);
            double sum = dx*fx;
            result += sum;
        }
        return result;
    }
    public static double calculateIntegral3(double a ,double b , int n){
        double dx = (b-a)/n;
        double dy = (b-a)/n;
        double result = 0.0;
        for (int i = 0; i < n; i++) {
            double y0 = a+i*dy;
            double sum = 0;
            for (int j = 0; j < n; j++) {
                double x0 = a+i*dx;
                double fx = x0*x0 + y0*y0;
                sum = dx*fx;
            }
            result += sum * dy;
        }
        return result;
    }
}
