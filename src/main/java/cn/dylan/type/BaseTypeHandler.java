package cn.dylan.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yuhp@terminus.io on 2017/6/29.
 * Desc:
 */
public class BaseTypeHandler<T> extends TypeReference<T> implements TypeHandler<T> {
    @Override
    public void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public T getResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public T getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public T getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
