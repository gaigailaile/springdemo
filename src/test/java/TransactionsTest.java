import com.gai.service.HomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionsTest {
    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("transactions.xml");
        HomeService service = (HomeService) classPathXmlApplicationContext.getBean("homeService");
//        service.add("gaidongxu","853农场",2);
//        service.add("gaidongxu","853农场");
        service.addTry("gaidongxu","853农场");
    }
}
