import java.util.*;
public class AddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            }
        int ans = Sum(arr);
        System.out.println(ans);
    }
    static int Sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
