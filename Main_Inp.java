import java.util.Scanner;

public class Main_Inp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the vlaue of number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the vlaue of number:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        // System.out.println(sum);
        System.out.println("The sum of the" +num1 +"+" +num2 +"is:" +sum);
        
    }
}
