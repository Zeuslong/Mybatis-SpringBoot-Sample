package cn.com.hanyuxiao.sample.mybatis.springboot.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    /**
     * 根据用户的 id 来获取到一个用户实体。
     * @param id 用户的 id。
     *           不能为空，必须要大于 0
     */
    User selectById(@Param(value = "id") long id);

    /**
     * 插入用户记录。
     */
    void insert(User user);
}
