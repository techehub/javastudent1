package thread;

public class Test {

    public static void main(String[] args) throws  Exception {

        System.out.println( Thread.currentThread().getName() );

        MyThread1 t1= new MyThread1();
        MyThread2 t2 = new MyThread2();


        t1.start();
        t2.start();


        System.out.println("Before joining Thread !!!");

        t1.join();
        t2.join();

        System.out.println("String Thread C !!!");

        Thread t3 = new Thread(new MyThread3());
        t3.start();
        t3.join();
        System.out.println("Work Completed !!!!!!");

    }

}


class MyThread1 extends Thread{

    @Override
    public void run (){

        for (long l = 1; l < 100 ; l++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AAAAAAA"+l);
        }


    }


    void test (){

    }


}


class MyThread2 extends Thread{
    public void run (){
        for (long l = 1; l < 100 ; l++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("BBBBBBBB"+l);
        }
    }
}

class  MyThread3  implements Runnable{
    @Override
    public void run() {
        for (long l = 1; l < 100 ; l++){
            System.out.println("CCCCCCC"+l);
        }
    }
}
