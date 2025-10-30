public class GetBit{
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = n << pos;
        int ans = bitmask & n; // to get the Bit use Binary AND 
        if(ans == 0){
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit was One");
        }
    }
}