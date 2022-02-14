package academy.learnprogramming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
