// package 2DArray;
import java.util.*;
import java.util.Arrays;
public class Arrays_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int rows = inp.nextInt();
        int columns = inp.nextInt();

        int[][] nums = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                nums[i][j] = inp.nextInt();
            }
        }
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < columns; j++) {
    //             System.out.print(nums[i][j] +" ");
    //         }
    //         System.out.println();
    //     }
    System.out.println(Arrays.toString(nums));
    }

}
