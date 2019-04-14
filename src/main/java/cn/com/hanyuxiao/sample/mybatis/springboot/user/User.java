package cn.com.hanyuxiao.sample.mybatis.springboot.user;

/**
 * 实体类，含有用户名称与用户 id 两个属性。
 */
public class User {

    private String userName;

    private long id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
