package Functions;
import java.util.Scanner;
public class BasicOfFun {

    //A function which return my name
static void PrintMyName(String str){
    System.out.println("Hello mr."+str);
   return ;
}

// make a function two multiply two numbers
static int MultiplyTwoNum(int num1, int num2){
    int Mul = num1*num2;
    return Mul; //if you are returning int then the type of the function should be int 
    // System.out.println("The Multiplicity of the "+num1+ " and " +num2+" is :"+(num1*num2));
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // System.out.print("Enter your name");
        // String name = in.nextLine();
        // PrintMyName(name);

        System.out.print("Enter the two numbrs:");
        int a = in.nextInt();
        int b = in.nextInt();
        int Ml = MultiplyTwoNum(a,b); //Hint : if you are calling here then the method must be print within the function otherwise you need to print after calling
        System.out.println("The Multiplicity of the two number "+Ml);
    }
}
