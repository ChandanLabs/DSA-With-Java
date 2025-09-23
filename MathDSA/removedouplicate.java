package MathDSA;

import java.util.Arrays;

public class removedouplicate {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,6,6,7,8,8};
System.out.println(Remove(arr));
System.out.println(Arrays.toString(arr));
    }
    static int Remove(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
         
        }
         return i ;
    }
}
