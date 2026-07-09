class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                // delete the topmost element 
                minHeap.poll();
            }
        }
        // take the peak element
        return minHeap.peek();
    }
}