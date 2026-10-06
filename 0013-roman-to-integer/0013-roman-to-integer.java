class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int i = 0;
        int total = 0;

        while(i < s.length() - 1) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if(i < s.length() - 1 && current < next) {
                total += next - current;
                i = i + 2;
  
            }else{
                total += current;
                i = i + 1;
            }
            // i++;
        }
        if (i == s.length() - 1) {
            total += map.get(s.charAt(s.length() - 1));
        }
        return total;
    }
}