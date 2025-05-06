class MyThread extends Thread
 {
    long sleepTime;

    MyThread(long sleepTime)
   {
        this.sleepTime = sleepTime;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        try {
            while (true) {
                System.out.println(name);
                Thread.sleep(sleepTime);
            }
        } catch (Exception e) {
            System.out.println(name + " interrupted.");
        }
    }
}

class MyThreadDemo {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread(1000);
        MyThread mt2 = new MyThread(2000);

        mt1.setName("Thread1");
        mt2.setName("Thread2");

        mt1.start();
        mt2.start();
    }
}
