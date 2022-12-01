package zzPractice;





public class IsPrime {
    public static void main(String[] args) {



        boolean isPrime=true;
        int isPrimeNumber = 100;

        for(int i=0; i<isPrimeNumber; i++) {
            if(isPrimeNumber%i!=0) {
                isPrime = false;

            } else if (isPrimeNumber%i==0){
                isPrime=true;

            }
            break;
        }
    }
}
