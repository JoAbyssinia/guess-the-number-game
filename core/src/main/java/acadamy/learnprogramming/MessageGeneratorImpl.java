package acadamy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    public static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    @Autowired
    private Game game;
    private static int guessCount = 10;


//    init
    @PostConstruct
    public void init(){
        log.info("game = {}",game);
    }

    // pubic methods
    @Override
    public String getMainMessage() {
        return "getMainMessage() method";
    }

    @Override
    public String getResultMessage() {
        return "getResultMessage() method";
    }

}
