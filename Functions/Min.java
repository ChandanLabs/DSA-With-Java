
package Functions;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The min value is :" + MinOfValue(arr));
        // System.out.println(ans);
    }

    static int MinOfValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        return min;

    }

}