package annotationXml.tutorial5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("minerCoach5")
public class MinerCoach implements Coach {

    private Fortune fortune;

    @Autowired
    public MinerCoach(@Qualifier("randomFortune5") Fortune fortune){
        this.fortune = fortune;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("undermine mines");
        fortune.printDailyFortune();
    }
}
