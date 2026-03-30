package Array;
import java.util.*;

public class TudiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns = ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("===================");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
// Enter no of rows = 3
// Enter no of columns = 3
// 1 2 3
// 4 5 6
// 7 8 9
// ===================
// 1 2 3
// 4 5 6
// 7 8 9