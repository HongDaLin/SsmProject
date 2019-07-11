import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
@Test
    public void run1() throws Exception {
       InputStream in= Resources.getResourceAsStream("applicationContext.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        IProductDao dao=session.getMapper(IProductDao.class);
        List<Product> products= dao.findAll();
        for (Product product:products) {
            System.out.println(product);
        }

    }
}
