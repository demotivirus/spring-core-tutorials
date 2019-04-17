package noXml.tutorial2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("propertyCoach", Coach.class);
        coach.printDailyWorkout();
        PropertyCoach coach1 = (PropertyCoach) context.getBean("propertyCoach", PropertyCoach.class);
        System.out.println(coach1.getEmail());
        System.out.println(coach1.getTeam());
        context.close();
    }
}
