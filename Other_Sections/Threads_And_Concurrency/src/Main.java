import java.util.concurrent.*;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " ");
        }

        System.out.println("Task1 Done \n");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 101; i <= 199; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n Task2 Done\n");
    }
}

class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(100);
        return "Hello " + name;
    }
}

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        NEW - WHEN THREAD IS READY TO RUN
//        RUNNABLE - READY TO RUN BUT OTHER THREADS ARE BEING EXECUTED
//        RUNNING - THREAD IS EXECUTING
//        BLOCKED/WAITING - THREAD IS WAITING FOR AN EXTERNAL SERVICE OR ANOTHER THREAD NEEDS
//                          TO PROVIDE DATA TO RUN CURRENT THREAD
//        TERMINATED/DEAD - WHEN THREAD HAS COMPLETED EXECUTION

//        System.out.println("\nTask1 Kicked Off");
//        Task1 task1 = new Task1();
//        task1.start();
//
//        System.out.println("\nTask2 Kicked Off");
//        Task2 task2 = new Task2();
//        Thread task2Thread = new Thread(task2);
//        task2Thread.start();
//
//        System.out.println("\nTask3 Kicked Off");
//
//        for (int i = 201; i <= 299; i++) {
//            System.out.println(i + " ");
//        }
//
//        System.out.println("\n Task3 Done \n ");

        ExecutorService execService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = execService.submit(new CallableTask("in28Minutes"));
        System.out.println("\nTask Callable Completed");

        String welcomeMessage = welcomeFuture.get();

        System.out.println(welcomeMessage);

        System.out.println("\nMain Completed");

        execService.shutdown();
    }

}

