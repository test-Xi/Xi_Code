package SelfStudy;

import java.util.Scanner;

public class HuiWenInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=0;
        num2=Calculate(num1,num2);
        if(num2==num1){
            System.out.println("是回文数！");
        }else {
            System.out.println("不是回文数！");
        }
    }
    public static int Calculate(int n,int m){
        if(n==0){
            return m;
        }else{
            m=m*10+n%10;
            return Calculate(n/10,m);
        }
    }
}
