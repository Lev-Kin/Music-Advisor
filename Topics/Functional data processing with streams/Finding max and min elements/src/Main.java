import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> listOfElements = stream.collect(Collectors.toList());
        Optional<T> max = listOfElements.stream().max(order);
        Optional<T> min = listOfElements.stream().min(order);

        minMaxConsumer.accept(min.orElse(null), max.orElse(null));
    }
}