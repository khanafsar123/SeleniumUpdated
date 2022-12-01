package LastReplsInterview;

public class ReverseANumber {
    public static void main(String[] args) {

        System.out.println(reverseInteger(123));
    }
    public  static int reverseInteger(int N){
        int reverse=0;
        while(N>0) {
            int mod=N%10;
            reverse=reverse *10 + mod;
            N=N/10;


        }
        return reverse;
    }

}
