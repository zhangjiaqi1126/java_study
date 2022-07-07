import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.SpringConfig;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App1 {
    public static void main(String[] args) {
        //ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext act = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as = (AccountService) act.getBean("accountService");
        Account ac = as.findById(1);
        System.out.println(ac);
    }
}

