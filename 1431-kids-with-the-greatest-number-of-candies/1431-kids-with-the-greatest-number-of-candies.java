class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int n = candies.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(!(candies[i] + extraCandies >= max)){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
    }
}