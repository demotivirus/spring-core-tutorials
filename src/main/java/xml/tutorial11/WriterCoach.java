package xml.tutorial11;

public class WriterCoach implements Coach {

    private FortuneService fortuneService;

    public WriterCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Write 10k words";
    }

    @Override
    public String getDailyFortune() {
        return "Lets do it! : " + fortuneService.getFortune();
    }
}
