package annotationXml.tutorial7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InitCoach implements Coach {

    private Fortune fortune;

    @Autowired
    public InitCoach(@Qualifier("randomFortune7") Fortune fortune){
        this.fortune = fortune;
    }

    @Override
    public void printDailyWorkout() {
        System.out.println("Init/destroy method with annotation");
        fortune.printDailyFortune();
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("This init method in " + InitCoach.class);
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("This destroy method in " + InitCoach.class);
    }
}
