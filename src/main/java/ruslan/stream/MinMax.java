package ruslan.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ruslan on 22.05.2017.
 */
public class MinMax {

    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();
        myClassList.add(new MyClass("yarmet", 10));
        myClassList.add(new MyClass("yarmet", 20));
        myClassList.add(new MyClass("ruslan", 20));
        myClassList.add(new MyClass("ruslan", 30));

        Map<String, Optional<MyClass>> stringIntegerMapMax = myClassList.stream().collect(Collectors.groupingBy(MyClass::getName, Collectors.maxBy(Comparator.comparing(MyClass::getValue))));
        stringIntegerMapMax.forEach((key, value) -> System.out.println(key + " " + value.get().getValue()));
//        yarmet 20
//        ruslan 30

        Map<String, Optional<MyClass>> stringIntegerMapMin = myClassList.stream().collect(Collectors.groupingBy(MyClass::getName, Collectors.minBy(Comparator.comparing(MyClass::getValue))));
        stringIntegerMapMin.forEach((key, value) -> System.out.println(key + " " + value.get().getValue()));
//        yarmet 10
//        ruslan 20
    }


    @Data
    @AllArgsConstructor
    private static class MyClass {
        private String name;
        private int value;
    }
}
