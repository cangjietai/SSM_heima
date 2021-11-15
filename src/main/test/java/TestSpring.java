import com.lisitao.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 09:33
 * @Description:
 */
public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService as=(IAccountService) ac.getBean("accountService");
        as.findAll();
    }
}
