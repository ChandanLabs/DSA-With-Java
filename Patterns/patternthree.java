import java.util.Scanner;

public class patternthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println("Enter a number:");
        int num2 = input.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }
    }
}
