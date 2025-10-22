package Recursion;

public class sumofNnum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int ans = SumOfNnumbers(n, sum);
        System.out.println(ans);

    }
    static void SumOfNnumbers(int n,int sum){
        if(n == 1 ){
            sum = sum + n;
            return sum;
        }
        sum = sum + n;
        SumOfNnumbers(n - 1,sum);
       
    }
}
