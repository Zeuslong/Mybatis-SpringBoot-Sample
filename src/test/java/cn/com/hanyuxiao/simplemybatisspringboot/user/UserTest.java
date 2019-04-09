package cn.com.hanyuxiao.simplemybatisspringboot.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByIdTest() {
        Assert.assertNotNull(userMapper);
        long id = 1;
        User user = userMapper.selectById(id);
        Assert.assertNotNull(user);
        Assert.assertEquals("test", user.getUserName());
    }

}