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
public class Mapping {

    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();

        myClassList.add(new MyClass("yarmet", "khamedov", "rirt"));
        myClassList.add(new MyClass("ruslan", "yaverovich", "rirt"));
        myClassList.add(new MyClass("petya", "nosorogov", "company X"));

        Map<String, List<String>> stringListMap = myClassList.stream().collect(Collectors.groupingBy(MyClass::getCompany, Collectors.mapping(MyClass::getName, Collectors.toList())));
        stringListMap.forEach((key, value) -> System.out.println(key + " " + value));

//        rirt [yarmet, ruslan]
//        company X [petya]

    }

    @Data
    @AllArgsConstructor
    private static class MyClass {
        private String name;
        private String surname;
        private String company;
    }


}
