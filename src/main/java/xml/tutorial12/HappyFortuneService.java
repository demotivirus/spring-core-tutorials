package xml.tutorial12;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You are so lucky today";
    }
}
