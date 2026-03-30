package Array;

public class CheckAsc {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {1,22,3,4,5};

        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp++;
            }
        }
        if(temp == 0){
            System.out.println("Array is in Ascending order");
        }else{
            System.out.println("Array is not in Ascending order");
        }
    }
}
// int arr[] = {1,2,3,4,5};
// Array is in Ascending order

// int arr[] = {1,22,3,4,5};
// Array is not in Ascending order