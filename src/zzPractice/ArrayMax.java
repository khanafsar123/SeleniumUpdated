package zzPractice;

public class ArrayMax {
    public static void main(String[] args) {

        int [] num= {1,55,56,1,9,10};

        int largest=num[0];
        int secondLar=num[0];
        for(int i=0; i< num.length; i++) {
            if(num[i]> largest) {
                secondLar=largest;
                largest=num[i];

            }
            if(num[i]>secondLar && num[i]!=largest) {

                secondLar=num[i];

            }




        }
        System.out.println(largest);
        System.out.println(secondLar);
    }
}
