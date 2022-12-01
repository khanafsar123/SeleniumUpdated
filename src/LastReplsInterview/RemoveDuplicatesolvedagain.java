package LastReplsInterview;

public class RemoveDuplicatesolvedagain {
    public static void main(String[] args) {
        String str="abababbb";
        System.out.println(removeConsecutiveDuplicates(str));

    }



    public static String removeConsecutiveDuplicates(String input) {


        String duplicate = "";
        int count=0;
        String first="";


        for (int i = 0; i < input.length()-1; i++) {

            if(i==0) {
                first+=input.charAt(i);
            }


            // a               !      b


            if(input.charAt(i+1) != input.charAt(i)){

                //duplicate+= input.charAt(i);
                duplicate+=input.charAt(i+1);

            }

        }
       duplicate= first+""+duplicate;


        return duplicate;
    }
}
