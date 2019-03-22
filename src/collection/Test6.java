package collection;

import java.util.*;

public class Test6 extends  Object {

    public static void main(String[] args) {

        Map <String,Student>addressMap = new LinkedHashMap<>();
        addressMap.put("aaaa", new Student("Anoop","123",55));
        addressMap.put("xxxx", new Student("Anoop","124",55));
        addressMap.put("wwww", new Student("Sundhar","125",55));
        addressMap.put("dddd", new Student("Anoop","126",55));


        Map <String,Student>addressMap1 = new LinkedHashMap<>();
        addressMap.put("aaaa", new Student("Anoop","123",55));
        addressMap.put("xxxx", new Student("Anoop","124",55));
        addressMap.put("wwww", new Student("Sundhar","125",55));
        addressMap.put("dddd", new Student("Anoop","126",55));

        addressMap.putAll(addressMap1);

        /**
        System.out.println("123".hashCode());
        System.out.println(addressMap);
        Student s= addressMap.get(2);
        Set keys= addressMap.keySet();
        System.out.println(keys);
        Collection c = addressMap.values();
        System.out.println(c);
        **/

        for ( Map.Entry e  : addressMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }








    }


}
