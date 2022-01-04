package acadamy.learnprogramming.console;

import acadamy.learnprogramming.config.AppConfig;
import acadamy.learnprogramming.Game;
import acadamy.learnprogramming.MessageGenerator;
import acadamy.learnprogramming.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Log Info");
        log.debug("Log debug");

        //create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        //call method next() to get a random number;
        int number = numberGenerator.next();
        int maxNumber = numberGenerator.getMaxNumber();

        //log generated number
        log.info("number = {}", number);
        log.info("max Number = {}", maxNumber);

        // get game bean from context (container)
        Game game = context.getBean(Game.class);

//        get message generator context from bean
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());

        //close context (container)
        context.close();
    }
}
