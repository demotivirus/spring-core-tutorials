package xml.tutorial13;

public class BadFortuneService implements FortuneService {

    @Override
    public void printDailyFortune() {
        System.out.println("Is you bad day!");
    }
}
