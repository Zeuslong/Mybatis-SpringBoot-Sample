package cn.com.hanyuxiao.sample.mybatis.springboot.user;

/**
 * 实体类。
 */
public class User {

    /**
     * 用户的用户名。
     */
    private String userName;

    /**
     * 用户的 id。
     */
    private long id;

    /**
     * 用户状态枚举。
     */
    private UserStatusEnum status;

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

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }
}
