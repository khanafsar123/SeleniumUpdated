package LastReplsInterview;

import java.util.ArrayList;
import java.util.List;

public class Repl219 {
    /*
    ["steve","stevens","danny","steves","dan","john","johny" ,"joe"
        ,"alex"
        ,"alexander"]

Query Word List ["steve","alex","joe","john","dan"]

output

[2, 1, 0, 1, 1]

     */
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");
        List<String> query=new ArrayList<>();
       query.add("steve");
       query.add("alex");
       query.add("joe");
       query.add("john");
       query.add("dan");


        countOnlyPrefixes(names, query);
    }
    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        List<Integer> prefix = null;





        return prefix;
    }
}


   /* public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        List<Integer> num = null;

        int count=0;
        boolean isPresent=false;
        for(int i=0; i<names.size(); i++) {
           for(int j=0; j<query.size(); j++) {
              if (query.get(j).length()<=3) {
                  if(query.contains(j)== names.contains(i)){
                      isPresent = true;
                      break;
                  }
              }
              if(isPresent == true) {
                  count++;
                  System.out.print(count + " ");
              }

           }

        }
        System.out.print(count);
return num;
        }
}
*/