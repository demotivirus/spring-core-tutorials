package noXml.tutorial2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("noXml")
@PropertySource("classpath:noXml/sport.properties")
public class SportConfig {

    @Bean
    public Fortune happyFortune(){
        return new HappyFortune();
    }

    @Bean
    public Coach propertyCoach(){
        return new PropertyCoach(happyFortune());
    }
}
