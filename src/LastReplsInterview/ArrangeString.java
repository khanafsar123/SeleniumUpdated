package LastReplsInterview;

public class ArrangeString {
    public static void main(String[] args) {
        String str="00-44  #$% 48 55";
        System.out.print(formatString(str));
    }
    public static String formatString(String S){
        String format ="";
        String replaceCharacter="";
        for(int i=0; i<S.length(); i++) {
            replaceCharacter=S.replaceAll("[^0-9a-zA-Z]", "");
            replaceCharacter=replaceCharacter.replaceAll(" ", "");

           // replaceCharacter= String.valueOf(replaceCharacter.matches("\\d{3}-\\d{3}-\\d{4}"));
            }

            char[] arr=replaceCharacter.toCharArray();
           for(int i=0; i<arr.length; i++) {
               if(i==3) {
                   format+="-";
               } else if (i==6) {
                   format+="-";
               } else if (i==9) {
                   format+="-";

               }
               format+=arr[i];
           }






        return format;
    }
}
