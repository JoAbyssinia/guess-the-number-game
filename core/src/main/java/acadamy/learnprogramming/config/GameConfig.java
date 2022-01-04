package acadamy.learnprogramming.config;

import acadamy.learnprogramming.GuessCount;
import acadamy.learnprogramming.MaxNumber;
import acadamy.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    //    ==fields
//    can put a default value :20
    @Value("${game.maxNumber:20}")
    private int maxNumber;
//can put a default values
    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:0}")
    private int minNumber;

    //    ==  bean method
    @Bean
    @MaxNumber
    public int maxNumberValue() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCountValue() {
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
}
