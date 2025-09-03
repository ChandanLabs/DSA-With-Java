package Functions;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
/* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
*/
/*           
        int[] arr = {2,4,5,6,7,10};
        // System.out.println("The min value is :" + MinOfValue(arr));
        // System.out.println(ans);

        System.out.println(MinvalueInRange(arr, 1, 4));
        
*/
/* 
int[][] arr ={ 
    {2,3,4,5},
    {6,7,8,9},
    {10,11,12},
};
System.out.println(BinarySearch2D(arr));
*/
    }
 
/* 
    static int MinOfValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        return min;

    }
*/
/* 
static int MinvalueInRange(int[] arr, int start,int end){
    // int min = arr[0]
    int min = Integer.MAX_VALUE;
    for (int i = start; i < end; i++) {
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return min;
    }
*/
/* 
static int BinarySearch2D(int[][] arr){
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] < min){
                min = arr[i][j];
            }
        }
    }
    return min;
}
*/
}