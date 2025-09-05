// package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,13,11,16,30,20,22,34,56};
        // int target = 5;
        int target = 30;
        int ans = LinearSearch1D(arr, target);
        System.out.println(ans);
    }

    static int LinearSearch1D(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // int element = arr[i];
            if(arr[i] == target){
                return i;
                // return element;
            }
         
        }
         return -1;
    }
   
}
