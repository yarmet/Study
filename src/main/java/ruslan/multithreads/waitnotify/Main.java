package ruslan.multithreads.waitnotify;

/**
 * Created by ruslan on 27.05.2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Test test = new Test();

        test.start();
        Thread.sleep(1000);

        test.suspend1();
        Thread.sleep(2000);
        test.resume1();

    }
}


class Test extends Thread {
    private boolean run = true;
    private Object monitor = new Object();


    @Override
    public void run() {
        try {
            while (true) {


                synchronized (monitor) {
                    while (!run) {
                        monitor.wait();
                    }
                }


                Thread.sleep(300);
                System.out.println("working");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public void suspend1() {
        run = false;
    }


    public void resume1() {
        synchronized (monitor) {
            run = true;
            monitor.notify();
        }
    }
}