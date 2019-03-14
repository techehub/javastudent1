package oops.objectcreation.equalexample;

public class Test {
    public static void main(String[] args) {

        Student s1= new Student("1111", "Anoop");
        Student s2= new Student("1111", "Anoop");

        Student s3=null;



        if (s1==s2){
            System.out.println(" both are pointing to same object in memory");
        }
        else {
            System.out.println(" both are pointing to differnt object");
        }

        if (s1.equals(s2)){
            System.out.println(" both are logically equal object");
        }
        else {
            System.out.println(" both are logically NOT equal object");
    }


    }
}
