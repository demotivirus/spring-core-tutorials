package annotationXml.tutorial4;

import org.springframework.stereotype.Component;

@Component("badFortune4")
public class BadFortune implements Fortune {
    @Override
    public void printDailyFortune() {

    }
}
