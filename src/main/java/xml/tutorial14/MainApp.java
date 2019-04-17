package xml.tutorial14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/tutorial14.xml");
        MinerCoach coach = context.getBean("minerCoach", MinerCoach.class);
        coach.printDailyWorkout();
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        context.close();
    }
}
