package annotationXml.tutorial6;

import org.springframework.stereotype.Component;

@Component("happyFortune6")
public class HappyFortune implements Fortune {

    @Override
    public void printDailyFortune() {
        System.out.println("It's a lucky day");
    }
}
