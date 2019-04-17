package xml.tutorial11;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is a good day for you";
    }
}
