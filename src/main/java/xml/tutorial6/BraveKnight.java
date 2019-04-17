package xml.tutorial6;

public class BraveKnight implements Quest{

    private Quest quest;

    public BraveKnight(){}

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarq(){
        System.out.println("Quest embark");
    }

    @Override
    public void embarkOnQuest() {
        embarq();
    }
}
