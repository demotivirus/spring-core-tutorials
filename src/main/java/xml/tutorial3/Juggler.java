package xml.tutorial3;

public class Juggler implements Perforrmer{
    private int beanBags = 8;

    Juggler(){}

    Juggler(int beanBags){
        this.beanBags = beanBags;
    }


    @Override
    public void perform() {
        System.out.println("Juggling " + beanBags + " beanbags");
    }
}
