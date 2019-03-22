package collection;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {

        List<Student> students= new ArrayList<>();
        students.add(new Student("Anoop","222", 77));
        students.add(new Student("Kumar","111", 55));
        students.add(new Student("Praveen","333", 66));


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.mark == o2.mark) {
                    return 0;

                } else if (o1.mark > o2.mark) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });


        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                 return o1.name.compareTo( o2.name) ;
            }
        });

        System.out.println(students);
        Collections.sort(students, new RollNoComparator() );
        System.out.println(students);
    }
}


class RollNoComparator  implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.rollNo.compareTo( o2.rollNo) ;
        }
}