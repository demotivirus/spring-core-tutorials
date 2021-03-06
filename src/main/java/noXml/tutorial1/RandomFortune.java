package noXml.tutorial1;

import java.util.Random;

public class RandomFortune implements Fortune {

    private String[] fortunes = {"It's you lucky day",
            "Dont forget 8 may",
            "Fear blue color",
            "Don't make mistakes",
            "You will be pleasantly surprised today"};

    @Override
    public void printDailyFortune() {
        System.out.println(getRandom());
    }

    private Random random = new Random();

    private String getRandom(){
        int initRand = random.nextInt(fortunes.length);
        String answer = fortunes[initRand];
        return answer;
    }
}
