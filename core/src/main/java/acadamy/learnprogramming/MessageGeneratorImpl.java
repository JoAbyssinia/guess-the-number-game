package acadamy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    public static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    @Autowired
    private Game game;


    //    init
    @PostConstruct
    public void init() {
        log.info("game = {}", game);
    }

    // pubic methods
    @Override
    public String getMainMessage() {
        return "Number is between " + game.getSmallest() + " and " +
                game.getBiggest() + ". can you guess it?";
    }

    @Override
    public String getResultMessage() {

        if (game.isGameWon()) {
            return "you Guessed it! the number was " + game.getNumber();
        } else if (game.isGameLoss()) {
            return "you Lost. The number was " + game.getNumber();
        } else if (!game.isValidNumberRange()) {
            return " Invalid number range";
        } else if (game.getRemainingGuess() == game.getGuessCount()) {
            return "What is your first guess?";
        } else {
            String direction = "Lower";
            if (game.getGuess() < game.getNumber()) {
                direction = "higher";
            }
            return direction + "! You have " + game.getRemainingGuess() + " guess left";
        }
    }

}
