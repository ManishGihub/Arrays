package Array;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,2,4,1,7,5};

        System.out.print("Enter no. to search :");
        int n = sc.nextInt();

        int temp = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(n == arr[i]){
                System.out.println("Element found at index "+i);
                temp ++;
            }
        }
        if(temp == 0){
            System.out.println("Element not found");
        }
    }
}
// Enter no. to search :12
// Element not found

// Enter no. to search :7
// Element found at index 4