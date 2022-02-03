package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSupplierTests {
    public static void main(String[] args) {
        /*
        "Supplier Stream:
List<Integer> list = Arrays.asList(1,2,3,4,5,6);
Supplier<Stream<Object>> streamSupplier = () -> Stream.of(list);

этот код не делает стрим чисел (1,2,3,4,5,6), а только стрим с одного масива [1,2,3,4,5,6] - а как  мжно сделать streamSupplier из элементов массива, а не самого массива?"
         */

        Supplier<Stream<Long>> streamSupplier =
                () -> {
                    System.out.println("Very expensive CPU operation");
                    return Arrays.asList(1L, 2L, 3L).stream();
                };

        //1) Если класс имеет

//        System.out.println(
//                "streamSupplier.get().collect(Collectors.toList()) = " +
//                streamSupplier.get().collect(Collectors.toList()));

    }
}
