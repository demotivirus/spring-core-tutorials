package xml.tutorial8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/tutorial8.xml");
        Auditorium auditorium = (Auditorium) context.getBean("auditorium");
    }
}
