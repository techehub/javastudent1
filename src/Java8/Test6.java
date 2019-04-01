package Java8;

public class Test6 {



    public static void main(String[] args) {


        Calc c= (a,b) -> a+b;

        Calc c1= new Calc() {
            @Override
            public int calulate(int a, int b) {
                return a-b;
            }
        };

        System.out.println(doLogic(c, 10,5));



    }

    public static int doLogic (Calc c, int a, int b ){
        return c.calulate(a,b);

    }

}


interface  Calc {
    int calulate(int a, int b);
}