package ruslan.multithreads.lock;



/**
 * Created by ruslan on 26.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        Item item = new Item();

        Putter putter = new Putter(item);
        Getter getter = new Getter(item);

        new Thread(() -> putter.putItem()).start();
        new Thread(() -> getter.getItem()).start();

    }
}


