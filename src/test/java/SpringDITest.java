import com.gai.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("di.xml");
        System.out.println("spring 容器被加载");
        UserService service = (UserService) classPathXmlApplicationContext.getBean("userService");
        service.add();
    }
}
