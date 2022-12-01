package LastReplsInterview;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        removeConsecutiveDuplicates("abaabaadcdega");
    }

    public static void removeConsecutiveDuplicates(String input) {


        String duplicate = "";
        /*
        for (int i = 0; i < length; i++)
        {
            char charAtPosition = str.charAt(i);
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }
         */

        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            if (duplicate.indexOf(index) < 0) {
                duplicate += index;
            }

        }
           /* char ch=input.charAt(i);
            if(input.charAt(i) ==ch) {
               break;
            } else if (input.charAt(i)!= ch){
                duplicate+=ch;

            }*/
        System.out.println(duplicate);
    }
}
