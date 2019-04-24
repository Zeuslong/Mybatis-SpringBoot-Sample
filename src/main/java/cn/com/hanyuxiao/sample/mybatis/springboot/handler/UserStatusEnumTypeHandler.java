package cn.com.hanyuxiao.sample.mybatis.springboot.handler;

import cn.com.hanyuxiao.sample.mybatis.springboot.user.UserStatusEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义 TypeHandler 的示例。
 * 参考类：{@link org.apache.ibatis.type.EnumOrdinalTypeHandler}。
 * 参考资料：http://www.mybatis.org/mybatis-3/configuration.html#typeHandlers
 */
@MappedJdbcTypes(JdbcType.INTEGER)
public class UserStatusEnumTypeHandler extends BaseTypeHandler<UserStatusEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, UserStatusEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getStatusCode());
    }

    @Override
    public UserStatusEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int statusCode = rs.getInt(columnName);
        if (rs.wasNull()) {
            return null;
        }
        else {
            return getUserStatusEnum(statusCode);
        }
    }

    @Override
    public UserStatusEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int statusCode = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        else {
            return getUserStatusEnum(statusCode);
        }
    }

    @Override
    public UserStatusEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int statusCode = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        }
        else {
            return getUserStatusEnum(statusCode);
        }
    }

    private UserStatusEnum getUserStatusEnum(int statusCode) {
        for (UserStatusEnum status : UserStatusEnum.values()) {
            if (status.getStatusCode() == statusCode) {
                return status;
            }
        }
        return null;
    }
}
