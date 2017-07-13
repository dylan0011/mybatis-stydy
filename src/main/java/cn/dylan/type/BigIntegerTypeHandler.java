package cn.dylan.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yuhp@terminus.io on 2017/7/13.
 * Desc:
 */
public class BigIntegerTypeHandler extends BaseTypeHandler<BigInteger> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, BigInteger parameter, JdbcType jdbcType) throws SQLException {
        ps.setBigDecimal(i, new BigDecimal(parameter));
    }

    @Override
    public BigInteger getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return toBigInteger(rs.getBigDecimal(columnName));
    }

    @Override
    public BigInteger getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return toBigInteger(rs.getBigDecimal(columnIndex));
    }

    @Override
    public BigInteger getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return toBigInteger(cs.getBigDecimal(columnIndex));
    }

    private BigInteger toBigInteger(BigDecimal bigDecimal) {
        return bigDecimal == null ? null : bigDecimal.toBigInteger();
    }

}
