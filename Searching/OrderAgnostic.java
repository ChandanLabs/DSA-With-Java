public class OrderAgnostic {

    public static void main(String[] args) {
        int[] arr = {12,13,11,16,30,20,22,34,56};
        // int target = 5;
        int target = 30;
        int ans = OrderAgnostic1D(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnostic1D(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end ){
            int mid = start + ( end -start )/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}