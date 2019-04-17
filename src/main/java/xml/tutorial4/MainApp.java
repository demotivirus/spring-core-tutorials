package xml.tutorial4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.tutorial3.Perforrmer;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        Perforrmer performer = (Perforrmer) context.getBean("sam");
        performer.perform();
    }
}
