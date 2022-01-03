package acadamy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION= "beans.xml";

    public static void main(String[] args) {
        log.info("Log Info");
        log.debug("Log debug");

        //create context (container)
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
//        get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        //call method next() to get a random number;
        int number = numberGenerator.next();
        int maxNumber = numberGenerator.getMaxNumber();

        //log generated number
        log.info("number = {}",number);
        log.info("max Number = {}",maxNumber);

        // get game bean from context (container)
        Game game = context.getBean(Game.class);


        //close context (container)
        context.close();
    }
}
