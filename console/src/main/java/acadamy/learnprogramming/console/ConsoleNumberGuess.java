package acadamy.learnprogramming.console;

import acadamy.learnprogramming.Game;
import acadamy.learnprogramming.MessageGenerator;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Slf4j
@Component
public class ConsoleNumberGuess {

//    == constant section ==

//    private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    //    fields

    private final Game game;
    private final MessageGenerator messageGenerator;

    // constructor
    public ConsoleNumberGuess(Game game, MessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    //    event
    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        log.info("start() --> Container ready for use");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(messageGenerator.getMainMessage());
            System.out.println(messageGenerator.getResultMessage());

            int guess = scanner.nextInt();
            scanner.nextLine();
            game.setGuess(guess);
            game.check();

            if (game.isGameWon() || game.isGameLoss()) {
                System.out.println(messageGenerator.getResultMessage());
                System.out.println("play again y/n?");

                String playAgainString = scanner.nextLine().trim();
                if (!playAgainString.equalsIgnoreCase("y")) {
                    break;
                }
                game.reset();
            }
        }


    }
}
