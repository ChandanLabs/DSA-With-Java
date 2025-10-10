public class Stringbuilder {
    public static void main(String[] args) {
       /* 
        //Declare 
        StringBuilder sb = new StringBuilder("Chandan");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        // sb.setCharAt(0, "K");//the "" is not working why?
        sb.setCharAt(0,'k');
        System.out.println(sb);

        //insert
        sb.insert(1, 'u');
        System.out.println(sb);

        //delete
        sb.delete(2, 3);
        System.out.println(sb);

        //append means adding something in last
        sb.append("k");
        sb.append("u");
        sb.append("m");
        sb.append("a");
        sb.append("r");
        System.out.println(sb.length());
        */

        StringBuilder sb = new StringBuilder("Chandan");
        // sb.reverse();
        System.out.println(sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char fronChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fronChar);
        }
        System.out.println(sb);
    }
}
