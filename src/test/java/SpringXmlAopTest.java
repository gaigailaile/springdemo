import com.gai.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlAopTest {
    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("xmlaop.xml");
        System.out.println("spring 容器被加载");
        UserService service = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println("分割线--------------------------------------------------------------");
        service.add();
        System.out.println("分割线--------------------------------------------------------------");
        service.returnBoolean();
        System.out.println("分割线--------------------------------------------------------------");
        service.edit();
        System.out.println("分割线--------------------------------------------------------------");
    }
}
