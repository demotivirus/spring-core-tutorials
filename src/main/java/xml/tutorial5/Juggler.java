package xml.tutorial5;

public class Juggler implements Performer {

    private int beanBags = 11;

    public Juggler(){}

    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Juggling " + beanBags + " beanbags");
    }
}
