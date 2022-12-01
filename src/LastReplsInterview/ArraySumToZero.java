package LastReplsInterview;

public class ArraySumToZero {
    public static void main(String[] args) {

        arraySumToZero(4);



    }
    public static int[] arraySumToZero(int N) {


        int [] arr= new int[N];



            for (int i = 0; i < N; i++) {
                                //{-1,1}
                arr[i] += i *2  -  N+ 1;

                System.out.println(arr[i]);



        }
        return arr;
    }
}
