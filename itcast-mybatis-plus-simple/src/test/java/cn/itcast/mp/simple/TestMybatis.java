package cn.itcast.mp.simple;

import cn.itcast.mp.simple.mapper.UserMapper;
import cn.itcast.mp.simple.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: TestMybatis
 * Package: cn.itcast.mp.simple
 * Description：
 *
 * @Author :zyp
 * @Create 2023/07/29 14:34
 * @Version 1.0
 */
public class TestMybatis {
    @Test
    public void test1() throws IOException {
//        String config = "/Users/dreamtank177/Documents/04_mycode/IDEA/itcast-mybatis-plus/src/main/resources/mybatis-config.xml";
        String config= "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);

        }


    }
}
