package xml.tutorial14;

public class MinerCoach implements Coach{

    private String email;
    private String team;
    private FortuneService fortuneService;

    public MinerCoach(){}

    @Override
    public void printDailyWorkout() {
        System.out.println("I mine rude every day");
        System.out.println("Write me on email " + email);
    }

    @Override
    public void printDailyFortune() {
        fortuneService.printDailyFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
