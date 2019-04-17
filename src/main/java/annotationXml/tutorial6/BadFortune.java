package annotationXml.tutorial6;

import org.springframework.stereotype.Component;

@Component("badFortune6")
public class BadFortune implements Fortune {
    @Override
    public void printDailyFortune() {

    }
}
