package user;

import java.util.Optional;

public class UserTests {
    public static void main(String[] args) {
        UserService userService = new UserService();

        Optional<User> userOptional =
                userService.findByEmail("john-1.doe@gmail.com");

//        User user = userOptional
//                .orElse(new User("default@gmail", "Default user"));

//        User user = userOptional
//                .orElseGet(() -> new User("default@gmail", "Default user"));


//        userOptional.ifPresentOrElse(
//                (u) -> System.out.println("User found: " + u),
//                () -> System.out.println("No user found")
//        );

        //Antipattern
//        User u = null;
//
//        try {
//            u.toString();
//        } catch (Exception ex) {
//            //TODO fix NPE
//        }
//
//        System.out.println(u.toString());

    }
}
