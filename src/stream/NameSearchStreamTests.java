package stream;

import java.util.List;
import java.util.stream.Collectors;

public class NameSearchStreamTests {
    public static void main(String[] args) {
        List<String> names = new HumanGenerator()
                .generate(10)
                .stream()
                .filter(NameSearchStreamTests::isValidHumanName)
                .map(Human::getName)
                .collect(Collectors.toList());

        System.out.println("names = " + names);
    }

    private static boolean isValidHumanName(Human human) {
        String[] nameParts = human.getName().split(" ");
        String lastName = nameParts[1];
        return lastName.contains("a");
    }
}
