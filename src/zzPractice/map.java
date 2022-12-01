package zzPractice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,String> address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country","United State");

        Iterator<Map.Entry<String, String>> itr = address.entrySet().iterator();

        while (itr.hasNext()) {
            String newAd= String.valueOf(itr.next());

            System.out.println(newAd.toUpperCase());
        }
}}
