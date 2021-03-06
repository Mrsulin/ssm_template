package club.sulinxx.mapper;

import club.sulinxx.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Title: UserMapperTest
 *
 * @author sulin
 * @date 2019-07-17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectOne() {
        User user = userMapper.selectOne();
        System.out.println(user);
    }
}