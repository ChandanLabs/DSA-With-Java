import java.util.Scanner;
public class Patterntwo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println("Enter a number:");
        int num2 = input.nextInt();

        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                if(i==0 || i==num1-1 ||j==0 || j==num2-1){
                    System.out.print("*");
                }
                else{
                    System.out.println(" ");
                }
            
            }
            System.out.println(" ");
        }
    }
}
