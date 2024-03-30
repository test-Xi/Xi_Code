package HomeWork1;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = new int[2000];
        int count = 0;
        int sum = 0;
        for (int i = 2; i <= 10000; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
                arr[count] = i;
                count++;
            }
        }
        System.out.println("素数的平均数为:"+sum/count);
        for (int i = 0; i < count; i++) {
            if(arr[i] >= 1000) {
                System.out.println("大于1000的最小素数：" + arr[i]);
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            if(arr[i+1] >= 8000) {
                System.out.println("小于8000的最大素数：" + arr[i]);
                break;
            }
        }
    }
}
