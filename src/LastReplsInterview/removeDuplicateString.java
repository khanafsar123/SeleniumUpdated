package LastReplsInterview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateString {

    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("abaabaadcdega"));
    }

    public static String removeConsecutiveDuplicates(String input) {


       String duplicate="";
        for(int i=0; i<input.length(); i++){
            char ch=input.charAt(i);
            if(ch!=' '){
                duplicate+=ch;
                input=input.replace(ch, ' ');
            }
        }



       return duplicate;
    } }

 /*   public static String removeConsecutiveDuplicates(String input) {
   char[] arr=input.toCharArray();

   Set<Character> set = new LinkedHashSet<>();


      for(Character s:arr) {
          set.add(Character.valueOf(s));
      }

        int n = set.size();
        String[] arr1 = set.stream().toArray(String[] ::new);
        return arr1.toString();
    }}*/


