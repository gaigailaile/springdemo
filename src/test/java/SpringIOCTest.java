import com.gai.entity.Users;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCTest {
    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("spring 容器被加载");
//        Users users = (Users) classPathXmlApplicationContext.getBean("userFactory");
//        Users users2 = (Users) classPathXmlApplicationContext.getBean("users");
//        System.out.println(users == users2);
    }
}
