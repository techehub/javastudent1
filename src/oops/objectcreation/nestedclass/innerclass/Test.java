package oops.objectcreation.nestedclass.innerclass;

public class Test {

    public static void main(String[] args) {
        Customer cust= new Customer();

        //static class
        Customer.X x = new Customer.X();

        //inner class
        Customer.Account account = new Customer().new Account();



        //Method local class
        class Account {


        }

        Account a = new Account ();



        //Anonymous class

        Car benz = new Car(){

             void start (){

             }
             void stop (){

             }
             void accelarate (){

             }
        };


        Car nano = new Car(){

            void start (){

            }
            void stop (){

            }
            void accelarate (){

            }
        };
    }

}
