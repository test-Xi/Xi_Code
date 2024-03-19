package HomeWork;

public class Array {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = i*j - (j-i)*(j-i) + 10;
                arr[i][j] = num;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] >= max){
                    max = arr[i][j];
                }
            }
            System.out.println("第"+(i+1)+"行的最大值的为："+max );
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            int min = arr[0][i];
            for (int j = 1; j < 5; j++) {
                if(arr[j][i] <= min){
                    min = arr[i][j];
                }
            }
            System.out.println("第"+(i+1)+"列的最大值的为："+min );
        }
    }
}
