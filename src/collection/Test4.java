package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test4 {

    public static void main(String[] args) {

        PriorityQueue<String> q= new PriorityQueue<>();
        q.add("P1");
        q.add("A2");
        q.add("P3");
        q.add("B4");

        System.out.println(q);

        String x= q.poll();
        String y= q.poll();

        System.out.println(q);





    }

}
