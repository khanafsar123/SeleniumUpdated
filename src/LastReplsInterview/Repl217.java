package LastReplsInterview;

import java.util.ArrayList;
import java.util.List;

public class Repl217 {
    public static void main(String[] args) {


    List<Integer> numbers=new ArrayList<>();
  numbers.add(12);
  numbers.add(12);
  numbers.add(7);
  numbers.add(7);
  numbers.add(7);
    numbers.add(7);
    numbers.add(7);

        System.out.println(countDuplicates(numbers));

}
    static int countDuplicates(List<Integer> numbers){
        int firstNumber=numbers.get(0);
        int count=0;

        for(var i=0; i<numbers.size(); i++) {

            if(numbers.get(i) == firstNumber) {
                count++;
            }

        }

        return count;
    }
}
