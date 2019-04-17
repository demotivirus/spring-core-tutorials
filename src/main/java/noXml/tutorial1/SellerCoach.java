package noXml.tutorial1;

public class SellerCoach implements Coach {

    private Fortune fortune;

    public SellerCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("Seller courses today");
        fortune.printDailyFortune();
    }
}
