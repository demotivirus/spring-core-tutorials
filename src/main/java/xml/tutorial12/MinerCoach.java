package xml.tutorial12;

public class MinerCoach implements Coach {

    private FortuneService fortuneService;

    public  MinerCoach(){}

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Blow up mines";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
