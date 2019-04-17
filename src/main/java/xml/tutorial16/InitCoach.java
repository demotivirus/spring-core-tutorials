package xml.tutorial16;

public class InitCoach implements Coach {

    private HappyFortune happyFortune;

    public InitCoach(){}

    public InitCoach(HappyFortune happyFortune){
        this.happyFortune = happyFortune;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("====================================");
        System.out.println("Coach init/destroy methods in Spring");
        System.out.println("====================================");
    }

    public void initMethod(){
        System.out.println("This init method in InitCoach");
    }

    public void destroyMethod(){
        System.out.println("This destroy method in InitCoach");
    }
}
