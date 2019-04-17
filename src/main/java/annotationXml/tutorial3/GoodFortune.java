package annotationXml.tutorial3;

import org.springframework.stereotype.Component;

@Component("goodFortune3")
public class GoodFortune implements Fortune {

    @Override
    public void printDailyWorkout() {
        System.out.println("Good day for the start");
    }
}
