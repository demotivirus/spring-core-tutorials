package annotationXml.tutorial2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TerroristCoach implements Coach {

    private Fortune fortune;

    @Autowired
    public TerroristCoach(Fortune fortune){
        this.fortune = fortune;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("Bombs drop");
        fortune.printDailyWorkout();
    }
}
