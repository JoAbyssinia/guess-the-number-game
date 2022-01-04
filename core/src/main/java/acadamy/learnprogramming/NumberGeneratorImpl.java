package acadamy.learnprogramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    //== faileds ==
    private final Random random = new Random();

    @Autowired
    @MinNumber
    private int minNumber;

    @Autowired
    @MaxNumber
    private int maxNumber;

    //== public method ==
    @Override
    public int next() {
        return random.nextInt(minNumber,maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
