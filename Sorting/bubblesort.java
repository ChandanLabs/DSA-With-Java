package Sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        // int[] arr = {1,4,6,9,10,2,3,7};
        int[] arr = {1,2,3,4,5,5,6,7};
        search(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                int temp = arr[j];
                  arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
