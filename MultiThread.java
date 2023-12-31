 class MultiThread {

    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnable implements Runnable {
    private String th_nm;

    public MyRunnable(String name) {
        this.th_nm = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(th_nm + ": Count " + i);

            try {
                
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(th_nm + " has completed.");
    }
}

