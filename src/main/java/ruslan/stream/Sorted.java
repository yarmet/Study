package ruslan.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ruslan on 22.05.2017.
 */
public class Sorted {

    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();

        myClassList.add(new MyClass("yarmet", "khamedov", "rirt"));
        myClassList.add(new MyClass("ruslan", "yaverovich", "rirt"));
        myClassList.add(new MyClass("petya", "nosorogov", "company X"));

        List<MyClass> myClasses = myClassList.stream().sorted(Comparator.comparing(MyClass::getName)).collect(Collectors.toList());

        myClasses.forEach(System.out::println );

//        Sorted.MyClass(name=petya, surname=nosorogov, company=company X)
//        Sorted.MyClass(name=ruslan, surname=yaverovich, company=rirt)
//        Sorted.MyClass(name=yarmet, surname=khamedov, company=rirt)
    }

    @Data
    @AllArgsConstructor
    private static class MyClass {
        private String name;
        private String surname;
        private String company;
    }

}
