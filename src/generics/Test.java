package generics;


import java.util.ArrayList;

class Fruit {
    void peel(){
        System.out.println("Peeling fruit");
    }
}

class Apple{
    void peel(){
        System.out.println("Peeling Apple fruit");
    }

}

class Orange {
    void peel(){
        System.out.println("Peeling Orange fruit");
    }

}

public class Test {

    public static void main(String[] args) {
        Bag<Apple> h= new Bag <Apple>(2);
        h.keepItems(new Apple(),0);
        h.keepItems(new Apple(),1);
        //h.keepItems(new String(),3);

        peal(h);

        ArrayList<String> l= new ArrayList<>();
        l.add("sadasd");

       // display(l);
    }

    public static void display(ArrayList<String> l){
        for ( String x : l){
            System.out.println(x);
        }
    }

    public  static void peal (Bag <Apple> fruits) {




        for ( Object x : fruits.getItems()){

            System.out.println(x);
        }
    }

}
