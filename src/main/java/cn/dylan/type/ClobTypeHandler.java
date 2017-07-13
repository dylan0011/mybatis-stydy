package cn.dylan.type;

import java.io.StringReader;
import java.sql.*;

/**
 * Created by yuhp@terminus.io on 2017/7/13.
 * Desc:
 */
public class ClobTypeHandler extends BaseTypeHandler<String> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        StringReader reader = new StringReader(parameter);
        ps.setCharacterStream(i, reader, parameter.length());
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return clob2String(rs.getClob(columnName));
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return clob2String(rs.getClob(columnIndex));
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return clob2String(cs.getClob(columnIndex));
    }

    private String clob2String(Clob clob) throws SQLException {
        String value = "";
        if (clob != null) {
            int size = (int) clob.length();
            value = clob.getSubString(1, size);
        }
        return value;
    }

}
