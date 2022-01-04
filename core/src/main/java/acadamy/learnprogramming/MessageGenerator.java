package acadamy.learnprogramming;

import org.springframework.stereotype.Component;

@Component
public interface MessageGenerator {
    String getMainMessage();

    String getResultMessage();
}
