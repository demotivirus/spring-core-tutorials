package annotationXml.tutorial4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FortuneTellerCoach implements Coach {

    public FortuneTellerCoach(){}

    @Autowired
    @Qualifier("randomFortune")
    private Fortune fortune;

    @Override
    public void printDailyWorkout() {
        fortune.printDailyFortune();
    }
}
