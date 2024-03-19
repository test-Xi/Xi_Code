package SelfStudy;

import java.util.Scanner;

public class stringMul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int num1 = create(s1);
        int num2 = create(s2);

        System.out.println(num1 * num2);
    }

    public static int create(String str){
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            number = number * 10 + n;
        }
        return number ;
    }
}