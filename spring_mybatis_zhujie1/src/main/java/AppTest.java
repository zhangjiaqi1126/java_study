import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    public static void main(String[] args) {
        ApplicationContext acc = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = (AccountService) acc.getBean("accountService");
        Account a = accountService.findById(1);
        System.out.println(a);
    }
}
