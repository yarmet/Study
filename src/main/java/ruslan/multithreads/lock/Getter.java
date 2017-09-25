package ruslan.multithreads.lock;

import lombok.AllArgsConstructor;

/**
 * Created by ruslan on 26.05.2017.
 */
@AllArgsConstructor
public class Getter {
    private Item item;

    public void getItem() {
        for (int i = 0; i < 10; i++) {
            item.getItem();
        }
    }
}
