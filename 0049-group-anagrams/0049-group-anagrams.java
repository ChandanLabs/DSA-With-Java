class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //freq signature 
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int freq[] = new int[26];

            for(char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int count : freq) {
                sb.append("#").append(count);
            }
            String keyString = sb.toString();

            if(!map.containsKey(keyString)) {
                map.put(keyString, new ArrayList<>());
            }
            map.get(keyString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}