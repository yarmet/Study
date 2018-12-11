package ruslan.minmaxsearcher;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Usage {

    @Getter
    @AllArgsConstructor
    static class MyClass {
        private float property;
    }

    public static void main(String[] args) {

        List<MyClass> classList = new ArrayList<>();
        classList.add(new MyClass(1f));
        classList.add(new MyClass(2f));
        classList.add(new MyClass(2.5f));
        classList.add(new MyClass(5.8f));

        MinMaxResult<Float> floatMinMaxResult = MinMaxFinder.find(classList, MyClass::getProperty, Float::compareTo);

        System.out.println(floatMinMaxResult.getMin());
        System.out.println(floatMinMaxResult.getMax());

    }

}
