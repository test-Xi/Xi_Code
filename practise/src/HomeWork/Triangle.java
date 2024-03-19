package HomeWork;

public class Triangle {
    public static void main(String[] args) {
        int n = 20;
        int maxNumber = 2*n-1;
        for (int i = 0; i < n; i++) {
            int number = 2*i +1;
            for(int j = -1*maxNumber ;j < maxNumber ; j++){
                if(j <= number/2 && j >= (-1)*number/2){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
