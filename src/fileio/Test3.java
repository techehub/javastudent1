package fileio;

import java.io.*;

public class Test3 {

    public static void main(String[] args)  throws Exception{
        Student s1= new Student("AAAAA", "123", 456 , new Address ("aaaa", "bbb", "cccc"));
        ObjectOutputStream dstream= new ObjectOutputStream(new FileOutputStream("/Users/vijesh/markexample/test.data"));
        dstream.writeObject(s1);

        ObjectInputStream instream = new ObjectInputStream(new FileInputStream("/Users/vijesh/markexample/test.data"));
        Student s2 = (Student)instream.readObject();
        System.out.println( s2);
    }

}

class Student implements Externalizable {
    String name;
    String rollNo;
    int  mark;
    Address address;

    public static long serialVersionUID = 2121212L;

    public Student(String name, String rollNo, int mark, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", mark=" + mark +
                '}';
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}


class Address  implements  Serializable{

    String street;
    String city;
    String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}