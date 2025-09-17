import java.util.*;
public class BinarSearchWithinp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the  target:");
        int target = sc.nextInt();

        int ans = Binary(arr, target);
        System.out.println(ans);


    }
    static int Binary(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        int[] ans = new int[]{-1,-1};
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;

            }
            else{
               return mid;
            }
        }
        return -1;
    }
}
