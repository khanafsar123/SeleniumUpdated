package LastReplsInterview;

public class ReverseEachword {
    /*public static String reverseAString(String s) {
        String reverse = "";


        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

*/
    public static void main(String[] args) {
        String str="I am Programmer";
       // reverseAString(str);
        StringBuilder abc=new StringBuilder(str);
        abc.reverse();

        System.out.println(abc);


    }
}
