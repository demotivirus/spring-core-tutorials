package xml.tutorial4;

import xml.tutorial3.Perforrmer;

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
