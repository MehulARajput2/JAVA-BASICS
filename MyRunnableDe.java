class MyRunnable implements Runnable {
    int start;

    MyRunnable(int start) {
        this.start = start;
    }

    public void run() {
        for (int i = 0; i < +200; i++) {
            System.out.println(i + " ");
        }
    }
}

class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable(1);
        MyRunnable mr2 = new MyRunnable(2);

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();

    }
}