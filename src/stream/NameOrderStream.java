package stream;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameOrderStream {
    public static void main(String[] args) {
        AtomicInteger order = new AtomicInteger(1);

        new HumanGenerator()
                .generate(10)
                .stream()
                .map(Human::getName)
                .map(name -> order.getAndIncrement() + ". " + name)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
