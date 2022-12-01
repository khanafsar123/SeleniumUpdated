package LastReplsInterview;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("I am programmer")); //how are you
                                                            // you are how
    }
    public static String reverse(String str) {
        String reverse1 = "";
        String[] arr=str.split(" "); // {"I", "am", "Programmer"} length = 3
        for(int i= arr.length-1; i>=0; i--) {
            reverse1 = reverse1 + arr [i] +" ";
        }

        return reverse1;

    }

}
/*
 String reverse1="";
        String[] arr=str.split(" ");
        for(int i= arr.length-1; i>0; i--) {
            reverse1+=arr[i]+" ";

        }

        return reverse1;
    }
 */