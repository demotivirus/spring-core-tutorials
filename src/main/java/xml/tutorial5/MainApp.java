package xml.tutorial5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        //PoeticJuggler poeticJuggler = (PoeticJuggler) context.getBean("sonnet29");
        Performer performer = (Performer) context.getBean("poeticJuggler");
        performer.perform();
    }
}
