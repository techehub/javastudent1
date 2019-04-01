package fileio;

public class Test5  {

    public static void main(String[] args) throws Exception {

        Customer c1= new Customer("111", "test", new Account("1233", "SA"));
        Customer c2 = (Customer) c1.clone();


        System.out.println(c2.custNo);
        System.out.println(c2.name);
        System.out.println(c2.acc.no);
        System.out.println(c2.acc.type);
        System.out.println(c1.acc == c2.acc);

        System.out.println(c1.acc.no);

    }


}


class Customer  implements Cloneable {

    String custNo;
    String name;
    Account acc;


    public Customer(String custNo, String name, Account acc) {
        this.custNo = custNo;
        this.name = name;
        this.acc = acc;
    }

    @Override
    protected Customer clone() throws
            CloneNotSupportedException
    {
        //throw new CloneNotSupportedException();
        Customer c= (Customer) super.clone();
        c.acc =  this.acc.clone();
        return c;
    }

}


