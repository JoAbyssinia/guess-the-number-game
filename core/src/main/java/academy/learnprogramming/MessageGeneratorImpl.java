package academy.learnprogramming;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Slf4j
@AllArgsConstructor
@Component
public class MessageGeneratorImpl implements MessageGenerator {

    private final Game game;

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
