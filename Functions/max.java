
package Functions;

import java.util.Scanner;

public class max {
    public static void main(String args[]) {
        // int[] arr = {2,4,9,5,6,8,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The max value is :" + MaxOfValue(arr));
        // System.out.println(ans);
    }

    static int MaxOfValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        return max;

    }

}
