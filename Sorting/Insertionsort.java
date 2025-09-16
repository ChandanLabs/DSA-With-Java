package Sorting;

public class Insertionsort {
    public static void main(String[] args) {
         int[] arr = {1,4,6,9,10,2,3,7};
         insertionsort(arr);
    }
    static void swap(int[] arr, int one,int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
  
    static void insertionsort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i +1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
