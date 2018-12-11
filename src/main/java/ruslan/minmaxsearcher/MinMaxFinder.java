package ruslan.minmaxsearcher;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MinMaxFinder {

    public static <SomeClass, SomeProperty> MinMaxResult<SomeProperty> find(List<SomeClass> list,
                                                                            Function<SomeClass, SomeProperty> paramExtractor,
                                                                            Comparator<SomeProperty> propertyComparator) {

        SomeProperty min = null;
        SomeProperty max = null;

        for (SomeClass t : list) {
            SomeProperty property = paramExtractor.apply(t);

            if (property == null) {
                continue;
            }

            if (min == null || propertyComparator.compare(property, min) <= 0) {
                min = property;
            }
            if (max == null || propertyComparator.compare(property, max) >= 0) {
                max = property;
            }
        }
        return new MinMaxResult<>(min, max);
    }
}