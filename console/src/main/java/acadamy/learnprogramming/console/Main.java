package acadamy.learnprogramming.console;

import acadamy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
//    replaced by lobmok annotation
//    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Log Info");
        log.debug("Log debug");

        //create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        //close context (container)
        context.close();
    }
}
