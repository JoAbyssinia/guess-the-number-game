package acadamy.learnprogramming;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
@Getter
public class NumberGeneratorImpl implements NumberGenerator {

    //== faileds ==
    @Getter(AccessLevel.NONE)
    private final Random random = new Random();

    private final int minNumber;
    private final int maxNumber;

//    constructor

    @Autowired
    public NumberGeneratorImpl(@MinNumber int minNumber,@MaxNumber int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    //== public method ==
    @Override
    public int next() {
// example: min= 5 max=20 -> max-min=15 range 0 - 15 + min -> 5 - 20
        return random.nextInt(maxNumber-minNumber) +minNumber;
    }



}
