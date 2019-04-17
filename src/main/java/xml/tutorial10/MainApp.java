package xml.tutorial10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        coach = context.getBean("maniacCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
