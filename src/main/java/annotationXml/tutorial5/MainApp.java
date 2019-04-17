package annotationXml.tutorial5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationXml/spring-annotation.xml");
        Coach coach = context.getBean("minerCoach5", Coach.class);
        coach.printDailyWorkout();
        context.close();
    }
}
