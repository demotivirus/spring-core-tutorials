package annotationXml.tutorial3;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune {

    @Override
    public void printDailyWorkout() {
        System.out.println("It's you baddest day");
    }
}
