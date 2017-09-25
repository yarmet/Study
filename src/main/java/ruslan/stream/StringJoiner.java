package ruslan.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ruslan on 22.05.2017.
 */
public class StringJoiner {

    public static void main(String[] args) {

        List<MyClass> myClassList = new ArrayList<>();
        myClassList.add(new MyClass("Petya", "Nosorogov"));
        myClassList.add(new MyClass("ignat", "Ignatov"));
        myClassList.add(new MyClass("yaya", "yaverovich"));

        String str = myClassList.stream().map(e -> e.getName().concat(":").concat(e.getSurname())).collect(Collectors.joining(",", "{", "}"));
        System.out.println(str);

//        {Petya:Nosorogov,ignat:Ignatov,yaya:yaverovich}

    }


    @Data
    @AllArgsConstructor
    private static class MyClass {
        private String name;
        private String surname;
    }

}

