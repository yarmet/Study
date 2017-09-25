package ruslan.multithreads.lock;

import lombok.AllArgsConstructor;

/**
 * Created by ruslan on 26.05.2017.
 */
@AllArgsConstructor
public class Putter {
    private Item item;

    public void putItem() {
        for (int i = 0; i < 10; i++) {
            item.putItem();
        }
    }

}
