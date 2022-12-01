package LastReplsInterview;

public class Paranthesis {
    public static void main(String[] args) {
        System.out.println(isBalanced(")()("));

    }
    public static boolean isBalanced(String str) {
        boolean isBal = false;
        int count = 0;
        int count1 = 0;
        if(str.isBlank() && str.length()%2!=0) {
            isBal = false;
        } else {
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i)%2==0) {
                    if(str.startsWith("(") || str.endsWith(")"))
                        count1++;
                    isBal = true;
                } else if(str.endsWith(")") || str.endsWith("(")) {
                    count ++;
                    isBal = true;
                }
                isBal = count1 == count;
            } //for closing

        } // else closing

        return isBal;
    }
}
