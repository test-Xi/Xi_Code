package HomeWork1;

public class CompressAndDecompress {
    public static void main(String[] args) {
        String str = "TAGGGATTAACCGTTAATATATTATAGCCATGGATGGATCGATTATATAACCGTTATATATATATAGCCATGGATCGATTATA";
        int[] arr = compress(str);
        String s = deCompress(arr);
        System.out.println("原结果为:   "  + s);
        System.out.println("解压缩结果为:" + s);
        //在数组最后一位储存了字符串长度,故不算
        double compressionRatio = str.length() / (arr.length - 1.0);
        System.out.println("压缩比是:" + compressionRatio);
    }
    public static int[] compress(String str){
        int length = str.length();
        int count = length % 16 == 0 ? length / 16 : length /16 +1 ;
        //数组多一位用来储存字符串长度
        int[] arr = new int[count+1];
        int index = 0;

        arr[count] = length;
        for (int i = 0; i < str.length(); i++) {
            //32位存储16个核苷酸
            if(i % 16 == 0 && i != 0){
                index ++;
            }
            char c = str.charAt(i);
            arr[index] = arr[index] << 2;
            switch (c){
                case 'A' -> arr[index] += 0;
                case 'C' -> arr[index] += 1;
                case 'G' -> arr[index] += 2;
                case 'T' -> arr[index] += 3;
                default -> System.out.println("错误DNA序列!");
            }
        }
        return arr;
    }
    public static String deCompress(int[] arr){
        //总共需获取的核苷酸数量
        int length = arr[arr.length-1];
        int index = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < length ; i++) {
            if(i % 16==0 && i != 0){
                index ++;
                sb.append( temp.reverse() );
                temp.setLength(0);
            }
            int n = arr[index];
            n = n & 3;
            switch (n){
                case 0 -> temp.append("A");
                case 1 -> temp.append("C");
                case 2 -> temp.append("G");
                case 3 -> temp.append("T");
            }
            arr[index] = arr[index] >> 2;
        }
        //最后一组未满
        sb.append( temp.reverse());
        return sb.toString();
    }
}
