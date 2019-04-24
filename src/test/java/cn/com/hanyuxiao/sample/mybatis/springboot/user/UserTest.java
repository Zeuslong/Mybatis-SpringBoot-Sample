package cn.com.hanyuxiao.sample.mybatis.springboot.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Transactional
    public void selectByIdTest() {
        Assert.assertNotNull(userMapper);
        long id = 1;
        User user = userMapper.selectById(id);
        Assert.assertNotNull(user);
        Assert.assertEquals("test", user.getUserName());
        Assert.assertEquals(UserStatusEnum.NORMAL, user.getStatus());
    }

    @Test
    @Transactional
    @Rollback
    public void insertTest() {
        User userExcepted = new User();
        userExcepted.setId(2);
        userExcepted.setUserName("hanyuxiao");
        userExcepted.setStatus(UserStatusEnum.NORMAL);
        userMapper.insert(userExcepted);
        User user = userMapper.selectById(userExcepted.getId());
        Assert.assertEquals(userExcepted.getStatus(), user.getStatus());
        Assert.assertEquals(userExcepted.getUserName(), user.getUserName());
    }
}