package annotationXml.tutorial7;

import org.springframework.stereotype.Component;

@Component("happyFortune7")
public class HappyFortune implements Fortune {

    @Override
    public void printDailyFortune() {
        System.out.println("It's a lucky day");
    }
}
