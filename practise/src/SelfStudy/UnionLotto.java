package SelfStudy;

import java.util.Random;
import java.util.Scanner;

public class UnionLotto {
    public static void main(String[] args) {
        int[] arr = ran();
        Scanner sc = new Scanner(System.in);
        int[] own = new int[7];

        System.out.println("请输入六个红球号码:");
        for (int i = 0; i < 6; i++) {
            own[i] = sc.nextInt();
        }

        System.out.println("请输入蓝球号码：");
        own[6] = sc.nextInt();

        int redBall = judge(arr, own);
        int blueBall = own[6] == arr[6] ? 1 : 0;

        System.out.println("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("红球中奖个数为：" + redBall);
        System.out.println("蓝球中奖个数为：" + blueBall);

        int result = calculate(redBall, blueBall);

        System.out.println("你获得的奖励为：" + result + "元");
    }

    public static int[] ran() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            if (i < 6) {
                int number;
                boolean flag;
                do {
                    number = r.nextInt(33) + 1;
                    flag = isContain(arr, number);
                } while (!flag);
                arr[i] = number;
            } else {
                int number = r.nextInt(13) + 1;
                arr[i] = number;
            }
        }
        return arr;
    }

    public static boolean isContain(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return false;
            }
        }
        return true;
    }

    public static int judge(int[] arr, int[] own) {
        int n = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (own[i] == arr[j]) {
                    n++;
                    break;
                }
            }
        }
        return n;
    }

    public static int calculate(int redBall, int blueBall) {
        switch (blueBall) {
            case 1:
                switch (redBall) {
                    case 6:
                        return 10000000;
                    case 5:
                        return 3000;
                    case 4:
                        return 200;
                    case 3:
                        return 10;
                    case 2:
                    case 1:
                        return 5;
                    case 0:
                        return 5;
                }
                break;
            case 0:
                switch (redBall) {
                    case 6:
                        return 5000000;
                    case 5:
                        return 3000;
                    case 4:
                        return 200;
                }
                break;
        }
        return 0;
    }
}
