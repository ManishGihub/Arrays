package Array;
import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {3,24,2,1,4,6};

        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Min = "+min);
        System.out.println("max = "+max);
    }
}
// Min = 1
// max = 24
