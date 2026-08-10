class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                ans = mid;       // Potential answer found, try larger values
                left = mid + 1;
            } else {
                right = mid - 1; // Square is too large, look in left half
            }
        }

        return ans;
    }
}