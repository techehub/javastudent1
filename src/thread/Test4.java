package thread;

import java.util.concurrent.*;

public class Test4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);




        Callable<Integer> callable1 = new MyCallable();
        Callable<Integer> callable2 = new MyCallable();
        Callable<Integer> callable3 = new MyCallable();
        Callable<Integer> callable4 = new MyCallable();

        Future<Integer> future1 = executor.submit(callable1);
        Future<Integer> future2 = executor.submit(callable2);
        Future<Integer> future3 = executor.submit(callable3);
        Future<Integer> future4 = executor.submit(callable4);




        int result1 = future1.get();
        int result2 = future2.get();
        int result3 = future3.get();
        int result4 = future4.get();
        System.out.println(result1);


    }


}

class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 100;
    }
}
