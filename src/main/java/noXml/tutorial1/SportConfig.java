package noXml.tutorial1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("noXml")
public class SportConfig {

    @Bean
    public Fortune randomFortune(){
        return new RandomFortune();
    }

    @Bean
    public Fortune happyFortune(){
        return new HappyFortune();
    }

    @Bean
    public Coach sellerCoachRandomFortune(){
        return new SellerCoach(randomFortune());
    }

    @Bean
    public Coach sellerCoachHappyFortune(){
        return new SellerCoach(happyFortune());
    }
}
