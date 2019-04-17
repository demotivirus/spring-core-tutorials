package xml.tutorial13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        Coach coach = context.getBean("cricketCoach", Coach.class);
        coach.printDailyWorkout();
        coach.printDailyWorkout();
        context.close();
    }
}
