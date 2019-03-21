package collection;

import generics.Bag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add(22);
        l.add(33);

        ArrayList list = new ArrayList(10);



        list.add(new Integer(10));
        list.add(10);
        list.add (new String ("Manoj"));
        list.add(2, "Hello");
        list.addAll(0, l);



        /**
        for (int i = 0 ; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
        */


        /**
        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Object x= itr.next();
            if ( x instanceof  String ) {
                itr.remove();
            }
        }
    **/

        Iterator itr= list.listIterator();
        while (itr.hasNext()){
            System.out.println( itr.next());

        }

        System.out.println("-----------");
        Iterator itr1= list.listIterator(2);
        while (itr1.hasNext()){
            System.out.println( itr1.next());
        }



    }





}
