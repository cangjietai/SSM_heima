import com.lisitao.dao.IAccountDao;
import com.lisitao.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 11:03
 * @Description:
 */
public class TestMyBatis {

    @Test
    public void run1() throws IOException {
        Account account = new Account();
        account.setName("uuuuu");
        account.setMoney(100d);
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);
        dao.saveAccount(account);
        session.commit();
        session.close();
        in.close();

    }


    @Test
    public void findAll() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        IAccountDao dao = session.getMapper(IAccountDao.class);
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        session.commit();
        session.close();
        in.close();

    }
}
