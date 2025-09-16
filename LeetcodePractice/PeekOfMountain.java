public class PeekOfMountain {
    public static void main(String[] args) {
        int[] arr = { 10,20,40,50,60,5,4,1};
        System.out.println(Peak(arr));
    }

    // Binary search
    static int Peak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;

    }

    // Brute force algorithm
    static int solution(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}
