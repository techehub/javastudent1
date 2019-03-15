package staticVariableExample;

/**
 * static variables kept in a separate class files - OrderStatus
 *
 */
public class Test {


    public static void main(String[] args) {

        Order o1= new Order("1111", 222.22, "APP");

        OrderProcessor p = new OrderProcessor();
                p.processOrder(o1);

     }




}
