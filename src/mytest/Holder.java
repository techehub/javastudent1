package mytest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Fruit  extends Veg{
    void peal(){}
}
class Veg {}


class Vegitable extends Veg{

}

class Carent extends  Vegitable{

}
class Melon extends Fruit{}

class Apple extends Fruit{}

class Mango extends Fruit{}

class WaterMelon extends Melon{}

public class Holder <W>  {

    W[] items;
    int index;

    public Holder(int size) {
        items = (W[]) new Object[size];
    }

    public void add(W content) {
        items[index] = content;
    }

    public W get(int index) {
        return items[index];
    }

    public static void main(String[] args) {

        Holder h1 = new Holder(10);
        h1.add(new StringBuffer());
        h1.add(new Integer(10));
        System.out.println(h1.get(0));

        Holder<Integer> h2 = new Holder <>(10);
        //h2.add(new StringBuffer());
        h2.add(new Integer(10));
        System.out.println(h1.get(0));

        Holder <? super Number> h3 = new Holder <>(10);
        h3.add(new Integer(10));
        h3.add(new Float(10));

        Holder < Melon> h4 = new Holder <>(10);
        h4.add(new WaterMelon());
        //h4.add(new Apple());
        //h4.add(new Mango());

        Holder <Vegitable> h5 = new Holder <>(10);
        h5.add(new Carent());

        System.out.println(h1.get(0));

        Holder <? super Fruit > fruits = new Holder<>(10);
        fruits.add (new Apple());


        Holder <? super Melon > x = h4;
        Holder <? extends Fruit > holder;

        x.add (new WaterMelon());

        peal(h4);
    }




    public  static void peal (Holder <Melon > fruits) {


        for (Melon x : fruits.items){
            x.peal();
        }
    }

    public  static void peal1 (Holder <? extends Fruit > fruits) {

        for (Fruit x : fruits.items){
                x.peal();
        }

    }

}
