package thread;

public class Test2 {


    public static void main(String[] args) {

        Printer myPrinter = new Printer();

        MyThread t1 = new MyThread(myPrinter);
        MyThread5 t2 = new MyThread5(myPrinter);

        t1.start();
        t2.start();

    }
}


class Printer {

     public synchronized void write (String msg){

        for (int i =0 ; i < 100 ; i ++){
            try {
                System.out.println(msg + "-"+i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyThread extends  Thread {

    Printer printer;
    MyThread(Printer p){
        this.printer = p;
    }

    public void run () {

        printer.write("Hello");
    }

}

class MyThread5 extends Thread {

    Printer printer;
    MyThread5(Printer p){
        this.printer = p;
    }

    public void run () {
        printer.write("Hai");
    }

}