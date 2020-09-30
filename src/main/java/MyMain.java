import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int arrlen = arr.length;
        int arrlen2 = arrlen - 1;
        int reversed[] = new int[arrlen];
        for (int  i = 0; i<arrlen; i++){
            reversed[i] = arr[arrlen2-i];
        }
        return reversed;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int arrlen = arr.length;
        for (int i = 0; i < arrlen; i++){
            for (int a = i+1; a < arrlen; a++){
                if (arr[i] > arr[a]){
                    int x = arr[i];
                    arr[i] = arr[a];
                    arr[a] = x;
                }
                else {
                    continue;
                }
            }
        }
        return arr[arrlen - 2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        boolean IsGeom = false;
        int arrlen = arr.length;
        double f = (double)arr[1] / (double)arr[0];
        for (int i=2;i<arrlen;++i){
            if ((arr[1] *= f) == arr[i]){
                IsGeom = true;
            }
            else{
                break;
            }
        }
        return IsGeom;
    }


    public static void main(String[] args) {
        int testarr[]= {2, 5, 18, 54};
        System.out.println(Arrays.toString(reverse(testarr)));
        System.out.println(secondLargest(testarr));
        System.out.println(isGeometric(testarr));
    }
}
