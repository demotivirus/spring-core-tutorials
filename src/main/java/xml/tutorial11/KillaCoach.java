package xml.tutorial11;

public class KillaCoach implements Coach{

    private FortuneService fortuneService;

    public KillaCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "To fire a gun";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
