package annotationXml.tutorial6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationXml/tutoral6.xml");
        PropertiesCoach coach = context.getBean("propertiesCoach", PropertiesCoach.class);
        coach.printDailyWorkout();
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
    }
}
