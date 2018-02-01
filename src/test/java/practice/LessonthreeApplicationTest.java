package practice;

import com.paul.entity.TableUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/11/2018
 * Time: 10:58 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test
@RunWith(SpringRunner.class)
@SpringBootTest
public class LessonthreeApplicationTest {

   /* @Autowired
    private UserMapper userMapper;

    //创建测试单元
    @Test
    public  void test(){


        userMapper.insert("FengZhi","123456","12345678910");
        TableUser  tableUser = userMapper.findUserByPhone("123456789");
        Assert.assertEquals("FengZhi", tableUser.getName());
    }

    //事务管理
    @Test
    @Transactional
    public  void test1(){

        userMapper.insert("张三", "123456", "18600000000");
        int a = 1/0;
        userMapper.insert("李四", "123456", "13500000000");
        TableUser u = userMapper.findUserByPhone("12345678910");
        Assert.assertEquals("FengZhi", u.getName());
    }*/


}
