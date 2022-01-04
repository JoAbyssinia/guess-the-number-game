package acadamy.learnprogramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    //== faileds ==
    private final Random random = new Random();

    @Autowired
    private int maxNumber;

    //== public method ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
