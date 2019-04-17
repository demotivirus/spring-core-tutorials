package noXml.tutorial1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("sellerCoachRandomFortune", Coach.class);
        coach.printDailyWorkout();

        coach = context.getBean("sellerCoachHappyFortune", Coach.class);
        coach.printDailyWorkout();

        context.close();
    }
}
