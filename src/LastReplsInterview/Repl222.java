package LastReplsInterview;

import java.util.ArrayList;
import java.util.List;

public class Repl222 {
    /*
    Write the logic that picks largest and second largest numbers from a list add them and return the results.
 input to method is a list that contains the numbers
input [10,20,30,40]

output [70]

input[5,3,8,9,10,11,5]

output [21]
     */

    public static int findMaxSum(List<Integer> list) {





    int sum=0;
    int largestNumber= list.get(0);
    int secondLargest= list.get(0);

    for(int i=0; i<list.size(); i++) {
        if(list.get(i) > largestNumber) {
            secondLargest = largestNumber;
            largestNumber = list.get(i);
        }
        if(list.get(i) > secondLargest && list.get(i)!=largestNumber) {
            secondLargest = list.get(i);
        }
    }



    sum = largestNumber + secondLargest;

return sum;
    }

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(findMaxSum(list1));
    }
}
