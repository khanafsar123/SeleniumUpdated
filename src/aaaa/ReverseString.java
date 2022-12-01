package aaaa;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("I am programmer"));
    }
    public static String reverse(String str) {
        String reverse1="";
        String[] arr=str.split(" ");
        for(int i= arr.length-1; i>0; i--) {
            reverse1+=arr[i]+" ";

        }

        return reverse1.trim();
    }
}
