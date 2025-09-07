public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,13,16,18};
        int target = 14;
        int ans = Solution(arr,target);
        System.out.println(ans); 
    }
    static int Solution(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1 ;
        while (start <= end){
                int mid = start + (end - start) / 2;
                // int element = arr[mid];
                if(target == arr[mid]){
                    return arr[mid];
                }
                else if(target < arr[mid]){
                    end = mid - 1 ;
                }
                else if(target > arr[mid]){
                    start = mid + 1 ;
                }
              
        }
        return end;
    }
}

