package xml.tutorial13;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(){}

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("Play cricket with bombs");
    }

    @Override
    public void printDailyFortune() {
        fortuneService.printDailyFortune();
    }
}
