package annotationXml.tutorial4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationXml/spring-annotation.xml");
        Coach coach = context.getBean("fortuneTellerCoach", Coach.class);
        coach.printDailyWorkout();
        context.close();
    }
}
