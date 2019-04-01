package enumtest;

enum Grade {

    A (90, 900, " A Grade") , B (80,800, "B Grade"), C(70, 700, "C-Grdae"), D (60,600, "D- Grade");
    private int p;
    private int mark;
    private String  desc;


    public int getP() {
        return p;
    }

    public int getMark() {
        return mark;
    }

    public String getDesc() {
        return desc;
    }


    Grade (int p, int mark, String desc){
        this.p =p;
        this.mark=mark;
        this.desc= desc;
    }


}


class Student {

    String name;
    Grade  grade ;

}

public class EnumTest1 {
    enum Day {SUN, MON, TUE, WED, THU, FRI,SAT};
    enum OrderStatus {PENDING, REJECTED,APPROVED};



    public static final int SUN=1;
    public static final int MON=2;
    public static final int TUE=3;
    public static final int WED=4;
    public static final int THU=5;
    public static final int FRI=6;
    public static final int SAT=7;


    public static void test(){

        Student s1= new Student ();
        s1.grade = Grade.D;



            System.out.println( s1.name);
            System.out.println( s1.grade.getP());
            System.out.println( s1.grade.getMark());
            System.out.println( s1.grade.getDesc());



    }

    public static void main(String[] args) {

        test();

        OrderStatus status= OrderStatus.APPROVED;

        switch ( status){
            case APPROVED:
                break;


            case REJECTED:
                break;




        }
       /**
        int d=23213;
        //int day= 3;
        Day day= Day.SUN;

        for (Day x : Day.values())
            System.out.println(x);


        System.out.println(
                day.ordinal());

        if (day==Day.SUN || day==Day.SAT){
            System.out.println("Not working day");
        }
        else {
            System.out.println("Working day");
        }

        **/
    }

}
