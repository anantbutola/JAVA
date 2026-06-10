package collections;

import java.util.*;

public class collections_maps {
    static void main() {
        Map<String,String> mp = new TreeMap<>();

        // insertion using put
        mp.put("in","India");
       // mp.put("in","India2");  // if two same keys there, most recent value is final.
        mp.put("us","USA");
        mp.put("en","England");
        mp.put("nz","New Zealand");
        System.out.println(mp);

        Map<String,String> m = new HashMap<>();
        m.put("br","Brazil");

        //putAll - insert one map in another map
        m.putAll(mp);
        System.out.println(m);

        // deletion
        m.remove("nz");

        // size
        System.out.println(m.size());

        // clear
        m.clear();
        System.out.println(m.size());

        // putIfAbsent - if key not present in map:it will add that pair in map.Otherwise, it will not do anything.
        mp.putIfAbsent("in","Australia");
        System.out.println(mp);

        // get - key corresponding value
        System.out.println(mp.get("in"));

        // getOrDefault() - if key not present there return default value otherwise return corresponding key value.
        System.out.println(mp.getOrDefault("uk","Not available"));

        // containsKey - Checks key present or not.
        System.out.println(mp.containsKey("in"));

        // containsValue - checks value present or not.
        System.out.println(mp.containsValue("India"));

        // replace - replace value of key with new specified value
        mp.replace("in","Bharat");
        System.out.println(mp);

        // keySet() - returns all the keys in set .
        Set<String> ch =mp.keySet();
        System.out.println(ch);

        // values() - returns collection of values in map.
        Collection<String> val = mp.values();
        System.out.println(val);

        // get all the entries in map using entrySet()
         Set<Map.Entry<String,String>> es= mp.entrySet();
        System.out.println(es);

        // iterating over a map
        for(Map.Entry<String,String> entry: mp.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
/*
What is Map Interface ?
In Java, elements of Map are stored in key/value pairs.
Keys are unique values associated with individual Values.
A map cannot contain duplicate keys. And, each key is associated with a single value.
 -- keys always be unique.

Implementation:
Map<String,String> mp = new HashMap<>();

Map Characteristics
Here are some key characteristics of the Map interface:

* No Duplicate Keys - Each Key can map to at most one value. However, different keys can map to the same value.
* Key-Value Association - It maintains an association of keys to values.
* Implementations - Some of the well-known classes that implement
        the Map interface are HashMap, TreeMap, LinkedHashMap, and Hashtable.
* Order - The Map interface itself doesn't guarantee any specific order of its elements.
       However, some specific implementations like TreeMap maintain a sorted order, and LinkedHashMap maintains the insertion order.
* Null Values - Maps allow null values and depending on the implantation, null kets.
       For example, HashMap allows one null key and multiple null values, but Hashtable does not allow null keys or values.

 Classes which implements map interface:
 - HashMap (Order not preserved)
 - LinkedHashMap(Order preserved)
 - Treemap (Order sorted)

 */