package ruslan.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ruslan on 22.05.2017.
 */
public class Summing {

    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();
        myClassList.add(new MyClass("yarmet", 10));
        myClassList.add(new MyClass("yarmet", 20));
        myClassList.add(new MyClass("ruslan", 20));
        myClassList.add(new MyClass("ruslan", 20));

        Map<String, Integer> stringIntegerMap = myClassList.stream().collect(Collectors.groupingBy(MyClass::getName, Collectors.summingInt(MyClass::getValue)));
        stringIntegerMap.forEach((key, value) -> System.out.println(key + " " + value));

//        yarmet 30
//        ruslan 40
    }


    @Data
    @AllArgsConstructor
    private static class MyClass {
        private String name;
        private int value;
    }
}


