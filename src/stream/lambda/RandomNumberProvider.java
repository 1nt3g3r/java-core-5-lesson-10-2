package stream.lambda;

import java.util.Random;

public class RandomNumberProvider implements NumberProvider {
    @Override
    public int generateNext() {
        return new Random().nextInt();
    }
}
