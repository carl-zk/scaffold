import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/spring-context.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        System.out.println(sessionFactory.getClass().getName());
    }
}
