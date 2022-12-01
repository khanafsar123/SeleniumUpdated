package LastReplsInterview;

public class aaaaaaaaaaa {
    public static void removeDuplicates(String str)
    {
        //Create an empty string
        String newstr = new String();


        int length = str.length();


        for (int i = 0; i < length; i++)
        {
            char charAtPosition = str.charAt(i);
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }
        //Print string after removing duplicate characters
        System.out.println(newstr);
    }

    // main() method start
    public static void main(String[] args)
    {
        // Create a string variable with default value
        String str = "JavaTpoint is the best learning website";
        //call removeDuplicates() method for removing duplicate characters
        removeDuplicates(str);
    }
}




