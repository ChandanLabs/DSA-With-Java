class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        int i = arr.length - 2;//choosing the pivot element
        while(i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if(i < 0) {
            return -1;
        }

        int j = arr.length - 1;//finding the smallest digit but greate then pivot
        while(arr[j] <= arr[i]) {
            j--;
        }
        //swap the pivot to next element
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


        //reverse the char of string 
        int left = i + 1;
        int right = arr.length - 1;
        while(left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        long result = Long.parseLong(new String(arr));
        if(result > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)result;
    }
}