package xml.tutorial6;

public class SlayDragonQuest implements Quest{

    public void embark(){
        System.out.println("Go to the dragon head!");
    }

    @Override
    public void embarkOnQuest() {
        embark();
    }
}
