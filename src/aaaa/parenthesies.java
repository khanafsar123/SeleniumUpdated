package aaaa;

public class parenthesies {

    /*
    public static boolean isBalanced(String str) {
        boolean isBal = false;


        while(str.length()%2!=0 && !str.isBlank()) {
            int a;
            int b;
            if(str.startsWith("(") )
        }

    return isBal;
    }
    */
    public static void main(String[] args) {
        System.out.println(isBalanced("()))"));

    }


    public static boolean isBalanced(String str) {
        boolean isBal = false;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char char1 = 0;
            if (str == null && str.length() % 2 != 0) {
                isBal = false;


                char1 = str.charAt(i);

            } else if (str.length() % 2 == 0 && char1 == '(') {
                count++;

                if (char1 == ')') {
                    count++;

                }

            }
            isBal = count == count1;
        }

        return isBal;
    }
}
