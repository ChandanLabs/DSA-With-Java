// package OOPS.introducntion;

public class wrapperclass {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        Integer a = 10;
        Integer b = 20;
        System.out.println(a+ " " +b);
        swap(a, b);
        System.out.println(a + " " +b);

        // final int num = 2;
        // num = num + 2;


        final A object = new A("Chandan");
        //Here you can reassign the value, beacuse its not a primitve type- its a non primitive
        object.name = "Other name";
        //when a non primitive is final , you can not reassign it.
        // object = new A("new object");
    }
    // static void swap(int a, int b){
    // int temp = a;
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
}

