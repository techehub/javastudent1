package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {

    public static void main(String[] args) {


        /**
        Set<String> names= new TreeSet<>();
        names.add ("Anoop");
        names.add ("Kumar");
        names.add ("Santhosh");
        names.add ("Anoop");
        names.add ("Kumar");
        System.out.println(names);
        **/

        Set <Student> students= new HashSet<>();
        students.add(new Student("Anoop","1111", 77));
        students.add(new Student("Kumar","1111", 55));
        students.add(new Student("Praveen","1111", 66));

        System.out.println(students);
    }





}
