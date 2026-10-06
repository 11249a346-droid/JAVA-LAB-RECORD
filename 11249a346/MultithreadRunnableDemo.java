class CookingTask implements Runnable {
    private String dishName;

    public CookingTask(String dishName) {
        this.dishName = dishName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is preparing " + dishName + " (Step " + i + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(dishName + " was interrupted.");
            }
        }
        System.out.println(dishName + " is ready! ");
    }
}

public class MultithreadRunnableDemo {
    public static void main(String[] args) {

        CookingTask task1 = new CookingTask("Pizza");
        CookingTask task2 = new CookingTask("Pasta");

        Thread thread1 = new Thread(task1, "Chef-1");
        Thread thread2 = new Thread(task2, "Chef-2");

        thread1.start();
        thread2.start();
    }
}
