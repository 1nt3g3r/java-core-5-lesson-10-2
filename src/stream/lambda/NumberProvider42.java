package stream.lambda;

public class NumberProvider42 implements NumberProvider {
    @Override
    public int generateNext() {
        return 42;
    }
}
