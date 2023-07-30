package cn.itcast.mp.simple;

import cn.itcast.mp.simple.mapper.UserMapper;
import cn.itcast.mp.simple.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: TestMybatisSpring
 * Package: cn.itcast.mp.simple
 * Description：
 *
 * @Author :zyp
 * @Create 2023/07/30 23:43
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestMybatisSpring {
    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);

        }
    }
}
