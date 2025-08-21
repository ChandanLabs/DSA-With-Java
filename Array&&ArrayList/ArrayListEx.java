import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       ArrayList<Integer> list = new ArrayList<>();

    //    list.add(10);
    //    list.add(20);
    //    list.add(30);
    //    list.add(40);
    //    list.add(50);
       
    //    System.out.println(list);
    //    System.out.println(list.contains(30));

    //    list.set(0, 100);
    //    System.out.println(list);

    //    list.set(1,200);
    //    System.out.println(list);
       //Explore all the list concepts

       for (int i = 0; i < n; i++) {
           list.add(sc.nextInt());
       }
       for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
            
       }
       System.out.println(list);
    }
}
