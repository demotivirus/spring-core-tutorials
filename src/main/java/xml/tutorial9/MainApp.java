package xml.tutorial9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        Instrumentalist kenny = (Instrumentalist) context.getBean("kenny");
        kenny.perform();
    }
}
