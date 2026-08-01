class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new ArrayList<>());

        return ans;
    }
    void backtrack(int start, int n, int k, ArrayList<Integer> path){
        if(path.size() == k){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i <= n; i++){
            path.add(i);

            backtrack(i + 1, n, k, path);
            path.remove(path.size() - 1);
        }
    }
}