// package LeetcodePractice;

public class FirstNLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,2,2,4,2};
        int target = 2;
        solution(arr,target);

    }
    static int[] solution(int[] arr ,int target){
        int[] ans = {-1,-1};
        int start = search(arr, target, true);
        int end = search(arr,target, false);

        ans[0] = start;
        if(ans[0] != 0){
            ans[1] = end;
        }
        return ans;
    }
    static int search(int[] arr, int target, boolean findIndexFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;

            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                //potential ans found
                ans = mid;
                //first occurance 
                if(findIndexFirst){
                    end = mid - 1;
                }
                //second occurance
                else{
                    start = mid + 1;
                }
            }
        }
        return ans ;

    }

}
