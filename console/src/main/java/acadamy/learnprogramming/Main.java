package acadamy.learnprogramming;

import acadamy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@SpringBootApplication
public class Main {
//    replaced by lobmok annotation
//    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Log Info");
        log.debug("Log debug");
        SpringApplication.run(Main.class, args);
    }
}
