import com.gai.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {
    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop.xml");
        System.out.println("spring 容器被加载");
        UserService service = (UserService) classPathXmlApplicationContext.getBean("userService");
        service.add();
//        service.returnBoolean();
//        service.edit();
    }
}
