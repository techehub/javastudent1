package staticVariableExample;

public class OrderProcessor {




    void processOrder(Order o){

        if (o.status.equals(OrderConstants.ORDER_APPROVED)){
            System.out.println("Order Can be processed");
        }
        else if (o.status.equals(OrderConstants.ORDER_RECJCTED)) {
            System.out.println(" Should not process Order");
        }
        else {
            System.out.println(" Getting some unexpected status !!!!");

        }

    }
}
