package LastReplsInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class countWordsInArrayList {
    public static void main(String[] args) {
        List<String> newList=new ArrayList<>();
        newList.add("switch");
        newList.add("switch");
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");

      //  System.out.println(countDeviceNames(newList));

        countDeviceNames(newList);



    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        List<String> newList=new ArrayList<>();
        int count=0;

        Iterator<String> iterator= deviceNames.iterator();

        while (iterator.hasNext()) {
            String list= iterator.next();
            newList.add(list);
        }
        
      for(int i=0; i<newList.size(); i++) {
            if(newList.get(i)== deviceNames.get(i)) {
                count++;
            }
          if(newList.get(i)==deviceNames.get(i)) {
              System.out.println(newList.get(i)+count);

          }
          }



        return newList;
    }
}
