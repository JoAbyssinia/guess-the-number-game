package acadamy.learnprogramming.config;

import acadamy.learnprogramming.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "acadamy.learnprogramming")
public class AppConfig {
//    this is a bean methods
}
