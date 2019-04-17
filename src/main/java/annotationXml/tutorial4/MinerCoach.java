package annotationXml.tutorial4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("minerCoach4")
public class MinerCoach implements Coach {

    private Fortune fortune;

    @Autowired
    @Qualifier("randomFortune")
    public void setFortune(Fortune fortune){
        this.fortune = fortune;
    }

    @Override
    public void printDailyWorkout() {

    }
}
