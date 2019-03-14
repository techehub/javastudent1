package oops.objectcreation.equalexample;

import java.util.Objects;

public class Student {
    String rollNo;
    String name;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {

       if ( this ==obj){
           return true;
       }

        System.out.println(this.getClass());
        System.out.println(obj.getClass());

        if (obj == null || getClass() != obj.getClass()) return false;

       if (this.rollNo.equals(((Student)obj).rollNo)){
           return true;
       }

       return false;

    }


}
