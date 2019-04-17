package xml.tutorial7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-tutorials.xml");
        Stage stage = (Stage) context.getBean("stage");
        stage.statusIsOk();
    }
}
