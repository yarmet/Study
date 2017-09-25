package ruslan.multithreads.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ruslan on 26.05.2017.
 */
public class Item {

    private int MIN_THRESHOLD = 8;
    private int MAX_THRESHOLD = 12;

    private int count = 10;
    private Lock lock = new ReentrantLock();
    private Condition condition;

    public Item() {
        condition = lock.newCondition();
    }


    void getItem() {
        lock.lock();
        try {
            while (count < MIN_THRESHOLD) {
                condition.await();
            }
            count--;
            System.out.printf("забрали предмет, теперь их %d\n", count);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void putItem() {
        lock.lock();
        try {
            while (count > MAX_THRESHOLD) {
                condition.await();
            }
            count++;
            System.out.printf("положили предмет, теперь их %d\n", count);
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}