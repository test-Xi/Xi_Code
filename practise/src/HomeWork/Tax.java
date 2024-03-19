package HomeWork;

public class Tax {
    public static void main(String[] args) {
        int sarlary = 20000;
        double tax = 0.0;
        if(sarlary > 3500){
            int money = sarlary - 3500;
            if(money <= 1500){
                tax = money * 0.03 - 0;
            }else if (money > 1500 && money <= 4500){
                tax = money * 0.1 - 105;
            }else if (money > 4500 && money <= 9000){
                tax = money * 0.2 - 555;
            }else if (money > 9000 && money <= 35000){
                tax = money * 0.25 - 1005;
            }else if (money > 35000 && money <= 55000){
                tax = money * 0.3 -2755;
            }else if (money > 55000 && money <= 80000){
                tax = money * 0.35 - 5505;
            }else if (money > 80000){
                tax = money * 0.45 - 13505;
            }
            System.out.println("您的税收为："+tax+"元");
        }else{
            System.out.println("您不需要纳税");
        }
    }
}
