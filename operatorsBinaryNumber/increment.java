package operatorsBinaryNumber;

public class increment {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;
        // System.out.println(a);
        // System.out.println(b);

        //post-increment
        b = ++a;
        System.out.println(b);//11
        System.out.println(a);//11

        // pre-increment
        b = a++;
        System.out.println(b);//11
        System.out.println(a);//11

    }
}
