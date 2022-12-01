package aaaa;

public class Reverse2 {

    public  static int reverseInteger(int N){
        int reverse=0;
        while(N>0) {
            int mod=N%10;
            reverse=reverse *10 + mod;
            N=N/10;


        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }
}
