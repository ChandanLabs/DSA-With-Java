public class PlaywithDigits {
    public static void main(String[] args) {
        // printDigits_o1(1, 8);
        printDigits_o2(4);
    }

    static void printDigits_o1(int n, int idx) {
        if (n == idx) {
            return;
        }
        System.out.println(n);
        printDigits_o1(n + 1);
        // memory stack then
        // System.out.println(n);
    }

    // Normal way of printing the numbers
    static void printDigits_o2(int n) {
        for (int i = 0; i <= n; i++) {

            System.out.println(i);
        }
    }
}
