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
public class Grouping {


    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();

        myClassList.add(new MyClass("yarmet", "khamedov", "rirt"));
        myClassList.add(new MyClass("ruslan", "yaverovich", "rirt"));
        myClassList.add(new MyClass("petya", "nosorogov", "company X"));

        Map<String, List<MyClass>> stringListMap = myClassList.stream().collect(Collectors.groupingBy(MyClass::getCompany));
        stringListMap.forEach((key, value) -> System.out.println(key + " " + value));

//        rirt [Grouping.MyClass(name=yarmet, surname=khamedov, company=rirt), Grouping.MyClass(name=ruslan, surname=yaverovich, company=rirt)]
//        company X [Grouping.MyClass(name=petya, surname=nosorogov, company=company X)]

    }

    @Data
    @AllArgsConstructor
    private static class MyClass {
        private String name;
        private String surname;
        private String company;
    }

}



