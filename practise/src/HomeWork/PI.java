package HomeWork;

public class PI {
    public static void main(String[] args) {
        int flag = 1;
        int n = 10000;
        double sum = 0.0;
        for (int i = 0; i <= n; i++,flag *=(-1)) {
            sum += flag/(2.0*i+1.0);
        }
        double PI = 4.0*sum;

        System.out.println("当n是100时，PI为："+PI);
    }
}
