public class BinarSearch {
    public static void main(String[] args) {
        int[] arr = { 9, 10, 11, 12, 13, 20, 22, 34, 56 };
     
        int target = 13;
        int ans = BinarySearch1D(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch1D(int[] arr, int target) {
        if(arr.length == 0){
            return -1 ;
        }
       
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
        int mid = start + (end - start) /2;
           
            if(arr[mid] < target){
               
                start = mid + 1;
            }
            else if(arr[mid] > target){
          
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1 ;

    }
}
