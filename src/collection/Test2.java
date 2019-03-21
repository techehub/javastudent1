package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> marks = new LinkedList ();
        marks. add (23);
        marks. add (33);
        marks. add (43);
        marks. add (53);
        marks. add (63);
        calculateTotal(marks);
    }

    static int calculateTotal(List<Integer> list){
        int total= 0;
        for ( Integer m: list){
            total = total + m;
        }
        return  total;
    }
}
