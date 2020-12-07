package ru.kotadmi.Laba1.Pr_23.Ex1;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Robinson", "Vinette");
        dictionary.put("Aris", "Jonathan");
        dictionary.put("Graves", "Rupert");
        dictionary.put("Brealey", "Louise");
        dictionary.put("Gatiss", "Mark");
        dictionary.put("Scott", "Andrew");
        dictionary.put("Freeman", "Martin ");
        dictionary.put("Stubbs", "Una");
        dictionary.put("Abbington", "Amanda");

        Map<String, String> dic = new HashMap<>();
        for (Iterator<String> iterator = dictionary.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = dictionary.get(key);
            if (!dic.containsValue(value))
                dic.put(key, value);
        }
        System.out.println(dic);
    }
}
