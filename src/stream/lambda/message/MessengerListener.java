package stream.lambda.message;

public interface MessengerListener {
    void onMessageReceived(String message);
}
