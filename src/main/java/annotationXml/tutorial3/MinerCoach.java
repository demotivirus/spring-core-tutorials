package annotationXml.tutorial3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MinerCoach implements Coach {


    private Fortune fortune;

    @Override
    public void printDailyWorkout() {
        System.out.println("Blow up mines");
        fortune.printDailyWorkout();
    }

    @Autowired
    @Qualifier("goodFortune3")
    public void setFortune(Fortune fortune) {
        this.fortune = fortune;
    }
}
