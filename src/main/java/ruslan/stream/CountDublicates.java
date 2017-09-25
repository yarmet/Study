package ruslan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDublicates {


    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);

        integers.add(2);
        integers.add(2);

        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        Map<Integer, Long> collect =  integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //    or  

        Map<Integer, Integer> counts = integers.stream().collect(Collectors.groupingBy(e -> e, Collectors.summingInt(x -> 1)));
        System.out.println(collect);

        //  out  {1=2, 2=2, 3=1, 4=1, 5=1, 6=1}

    }

}
