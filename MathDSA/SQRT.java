package MathDSA;

public class SQRT {
    public static void main(String[] args) {
        
    }
    static double sqrt(int n, int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if(m * m == n){
                return m;
            }
            else if(n > m * m){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }

        return root;
    }
}
