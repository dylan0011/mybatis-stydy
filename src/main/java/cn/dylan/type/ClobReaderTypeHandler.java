package cn.dylan.type;

import java.io.Reader;
import java.sql.*;

/**
 * Created by yuhp@terminus.io on 2017/7/13.
 * Desc:
 */
public class ClobReaderTypeHandler extends BaseTypeHandler<Reader> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Reader parameter, JdbcType jdbcType) throws SQLException {
        ps.setClob(i, parameter);
    }

    @Override
    public Reader getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return toReader(rs.getClob(columnName));
    }

    @Override
    public Reader getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return toReader(rs.getClob(columnIndex));
    }

    @Override
    public Reader getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return toReader(cs.getClob(columnIndex));
    }

    private Reader toReader(Clob clob) throws SQLException {
        if (clob == null) {
            return null;
        } else {
            return clob.getCharacterStream();
        }
    }
}
