import java.util.Arrays;
import java.util.*;


public class MultiDArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[4][];
        int[][] arr ={
            {1,2,3},
            {4,5,6,8},
            {7,8,9}
        };
        // System.out.print(Arrays.toString(arr));
        // int[][] arr1 = new int[2][3];

        // for ( int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         // arr[row][col]=sc.nextInt();
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        for (int[] arr1 : arr) {
            // System.out.println(arr1+"");
            System.out.println(Arrays.toString(arr1));
        }
    }



}
