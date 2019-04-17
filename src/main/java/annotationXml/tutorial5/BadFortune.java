package annotationXml.tutorial5;

import org.springframework.stereotype.Component;

@Component("badFortune5")
public class BadFortune implements Fortune {
    @Override
    public void printDailyFortune() {

    }
}
