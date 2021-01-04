import com.gai.service.HomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotateTransactionsTest {
    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotate-transactions.xml");
        HomeService service = (HomeService) classPathXmlApplicationContext.getBean("homeService");
        service.annotateAdd("gaidongxu","853农场");
    }
}
