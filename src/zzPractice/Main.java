package zzPractice;

import java.util.LinkedHashMap;
import java.util.Collection;

import java.util.Set;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> fruit=new LinkedHashMap<>();
        fruit.put(1,"apple");
        fruit.put(2,"banana");
        fruit.put(3,"pear");
        fruit.put(4,"tomato");
        fruit.put(5,"mango");
        fruit.put(6,"kiwi");

        Set<Integer> getKeys=fruit.keySet();
        for(Integer keys:getKeys) {
            String values=fruit.get(keys);

            System.out.println("Key is "+ keys+ " item and values is "+values);

        }









    }}
