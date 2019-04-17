package xml.tutorial15;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        Coach coach = context.getBean("scopeCoach", Coach.class);
        Coach coach1 = context.getBean("scopeCoach", Coach.class);

        boolean equals = (coach == coach1);

        System.out.println(equals);
        System.out.println(coach);
        System.out.println(coach1);

        coach.printDailyWorkout();
        context.close();
    }
}
