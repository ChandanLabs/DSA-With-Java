// package 2DArray;
import java.util.*;
public class FindPosition {
    public static void main(String[] args) {
        

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int rows = inp.nextInt();
        System.out.println("Enter the first number:");
        int cols = inp.nextInt();
        System.out.println("Enter the target:");
        int target = inp.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(target == matrix[i][j]){
                    // return new int[][]{i,j};
                    System.out.println("Number is found at location:("+i+ ","+j+")");
                }
            } 
        }
        

    }
}
