public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        System.out.println(Search1D(arr, target));
        
    }
    static int Search1D(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int i = 0;
        while(start<end){
            int mid = start +(end - start)/2;
        }
        if(arr[mid]==target){
            // System.out.println(mid);
            return mid;
        }
        else if(arr[mid]>target){
            start = mid+1;
        }
        else if(arr[mid]<target){
            end = mid-1;
        }
        else{
            // System.out.println("Target not found:");
            return -1;
        }
    }
}