package noXml.tutorial2;

import org.springframework.beans.factory.annotation.Value;

public class PropertyCoach implements Coach {

    private Fortune fortune;

    @Value("${coach.email}")
    private String email;

    @Value("${coach.team}")
    private String team;

    public PropertyCoach(Fortune fortune){this.fortune = fortune;}

    @Override
    public void printDailyWorkout() {
        System.out.println("Coach to spring properties");
        fortune.printDailyFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
