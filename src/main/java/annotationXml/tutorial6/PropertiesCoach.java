package annotationXml.tutorial6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesCoach implements Coach {

    //@Autowired
    //@Qualifier("happyFortune6")
    private Fortune fortune;

    @Value("${coach.email}")
    private String email;

    @Value("${coach.team}")
    private String team;

    public PropertiesCoach(){}

    @Autowired
    public PropertiesCoach(@Qualifier("randomFortune6") Fortune fortune){
        this.fortune = fortune;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("Coach added properties");
        fortune.printDailyFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
