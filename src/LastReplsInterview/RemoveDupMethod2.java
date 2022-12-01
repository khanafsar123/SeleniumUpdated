package LastReplsInterview;

public class RemoveDupMethod2 {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("abaabaadcdega"));
    }
    public static String removeConsecutiveDuplicates(String input) {


        String duplicate="";
        for(int i=0; i<input.length(); i++) {
            char ch=input.charAt(i);
            char index=input.charAt(0);
            if(input.charAt(i) ==ch) {
                duplicate+=ch;
                input = input.replace(ch, ' ');
                duplicate=duplicate.replaceAll(" ", "");
            }
        }

        return duplicate;
    } }

