package LastReplsInterview;

public class LargestEvenNumber {
    public static void main(String[] args) {
        String str="I lov java khan";
        System.out.println(findMaxLenEven(str));
    }

    public static String findMaxLenEven(String str)
    {
        String largestNumber="";


        /*
        Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1

input ["find MaxLen Even"]
         */


        String[] arr=str.split(" ");
   for(int i=0; i<arr.length; i++) {
       if(arr[i].length()%2==0){
           if(arr[i].length() > largestNumber.length()) {
               largestNumber=arr[i];
           }
       } else {
           System.out.println("-1");
           break;
       }

   }




        return largestNumber;
    }
}
