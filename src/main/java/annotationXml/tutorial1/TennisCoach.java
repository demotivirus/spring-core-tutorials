package annotationXml.tutorial1;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    //public TennisCoach(){}

    @Override
    public void printDailyWorkout() {
        System.out.println("Rest on the nature");
    }
}
