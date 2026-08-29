class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();
        int ans = 0;
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }else{
            ans = GCD(s1, s2);
        }
        return str1.substring(0, ans);
    }
    static int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}