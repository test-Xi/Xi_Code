package SelfStudy;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount person = new BankAccount("曦","123456",100000);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账户的名字：");
        String name = sc.next();
        System.out.println("");
        while(name != person.getName()){
            System.out.println("");
        }


    }
}
