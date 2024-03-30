package HomeWork1;

public class MulTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int mul = i*j;
                System.out.print(i+"*"+j+"="+mul+"\t");
            }
            System.out.println();
        }
    }
}
