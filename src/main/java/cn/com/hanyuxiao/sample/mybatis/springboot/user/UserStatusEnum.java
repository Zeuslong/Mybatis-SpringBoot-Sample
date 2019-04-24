package cn.com.hanyuxiao.sample.mybatis.springboot.user;

/**
 * 用户状态枚举类。
 */
public enum UserStatusEnum {

    /**
     * 正常使用状态
     */
    NORMAL(1, "正常");

    private int statusCode;

    private String description;

    UserStatusEnum(int statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
