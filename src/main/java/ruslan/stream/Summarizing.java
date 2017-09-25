package ruslan.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ruslan on 22.05.2017.
 */
public class Summarizing {

    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();
        myClassList.add(new MyClass("yarmet", 10));
        myClassList.add(new MyClass("yarmet", 20));
        myClassList.add(new MyClass("ruslan", 20));
        myClassList.add(new MyClass("ruslan", 20));

        Map<String, IntSummaryStatistics> stringIntegerMap = myClassList.stream().collect(Collectors.groupingBy(MyClass::getName, Collectors.summarizingInt(MyClass::getValue)));

        stringIntegerMap.forEach((key, value) -> System.out.println(key + " " + value.getAverage()));
//        yarmet 15.0
//        ruslan 20.0

        stringIntegerMap.forEach((key, value) -> System.out.println(key + " " + value.getCount()));
//        yarmet 2
//        ruslan 2

        stringIntegerMap.forEach((key, value) -> System.out.println(key + " " + value.getMax()));
//        yarmet 20
//        ruslan 20

        stringIntegerMap.forEach((key, value) -> System.out.println(key + " " + value.getMin()));
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
