package annotationXml.tutorial2;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements Fortune{

    @Override
    public void printDailyWorkout() {
        System.out.println("It's your lucky day");
    }
}
