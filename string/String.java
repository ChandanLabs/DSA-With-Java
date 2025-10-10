import java.util.*;
class Strings{
public static void main(String[] args) {
        //string declaration
        // String name = "Chandnan";
        // String full_name = "Chandan Kumar Sah";

        Scanner inp = new Scanner(System.in);
        // String name = inp.next();
        // String name = inp.nextLine();
        // System.out.println("Your name is :"+name);


        //Concatination
        String fistName = "chandan";
        String lastName = "Kumar";
        String fullName = fistName +"@" +lastName;
        // System.out.println(fullName.length());

        //to print each character 
        for (int i = 0; i < fullName.length(); i++) {
            // System.out.println(fullName.charAt(i));
        }

        //how to compare to string 
        /*
         s1 > s2 : +ve value
         s1 == s2:0
         s1 < s2 :-ve value
         */
        String name1 = "Chandan";
        String name2 = "Kundan";
        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equals");
        // }else{
        //     System.out.println("Strings are not equals");
        // }

        //Try to avoid the use == : sometimes it may give you wrong anwsers
        // bec in java string are stored in objects .. to know depth of the string once read the string builder also
        // if(name1 == name2){
        //     System.out.println("Strings are equals");
        // }else{
        //     System.out.println("Strings are not equals");
        // }


        //here we clearly see that these two names are equal right bt "idk" why?..
        // if(new String("Chandan") == new String("Chandan")){
        //     System.out.println("Strings are equals");
        // }
        // else{
        //     System.out.println("Strings are not equals");
        // }


        String sentence = "My name is Chandan";
        String name = sentence.substring(11,sentence.length());
        //substring(beginning,ending)//ending is excluding
        System.out.println(name);
    }
}   
