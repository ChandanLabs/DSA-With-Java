package Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2,5};
        search(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void search(int[] arr ){
        for (int i = 0; i < arr.length ; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = MaxValue(arr,0 ,lastIndex);
            swap(arr,maxIndex,lastIndex);
         
        }
    }
    static int  MaxValue(int[] arr, int start,int end){
        int max = start;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
             int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }
}
