package stream.lambda.message;

public class MessengerTests {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        messenger.addListener(
                (message) -> System.out.println("Message received in listener A: " + message)
        );

        messenger.addListener(message -> System.out.println(
                "Message in listener B received: " + message
        ));

        messenger.onMessage("Test");
        messenger.onMessage("hello");
    }
}
