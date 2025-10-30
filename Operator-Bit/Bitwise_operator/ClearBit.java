public class ClearBit {
    public static void main(String[] args) {
// For this first take the leftshift of with one and then go with
//not operation (~) and then perform the AND operation
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        int newBitmask = ~(bitmask);
        int clearBit = newBitmask & n;
        System.out.println(clearBit);

    }
}
