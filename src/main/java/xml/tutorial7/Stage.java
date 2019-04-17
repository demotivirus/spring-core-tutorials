package xml.tutorial7;

public class Stage {

    private Stage(){}

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

    public void statusIsOk(){
        System.out.println("Stage status is OK");
    }
}
