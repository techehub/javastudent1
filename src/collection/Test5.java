package collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Test5 {

    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("ww");


        LinkedList l = new LinkedList();
        l.push("S1");
        l.push("S2");
        l.push("S3");
        l.push("S4");

        System.out.println(l);

        l.pop();
        l.pop();

        System.out.println(l);





        Stack s= new Stack();
        s.push("S1");
        s.push("S2");
        s.push("S3");
        s.push("S4");

        System.out.println(s);

        s.pop();
        s.pop();

        System.out.println(s);



    }

}
