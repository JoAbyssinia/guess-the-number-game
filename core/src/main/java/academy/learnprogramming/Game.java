package academy.learnprogramming;

import org.springframework.stereotype.Component;

@Component
public interface Game {
    int getNumber();
    int getGuess();
    void setGuess(int guess);
    int getSmallest();
    int getBiggest();
    int getRemainingGuess();
    int getGuessCount();
    void reset();
    void check();
    boolean isValidNumberRange();
    boolean isGameWon();
    boolean isGameLoss();
}
