package xml.tutorial16;

public class HappyFortune implements FortuneService{

    @Override
    public void printDailyFortune() {
        System.out.println("It's you lucky day!");
    }

    public void initMethod(){
        System.out.println("Init HappyFortune method");
    }

    public void destroyMethod(){
        System.out.println("Destroy " + HappyFortune.class + " method");
    }
}
