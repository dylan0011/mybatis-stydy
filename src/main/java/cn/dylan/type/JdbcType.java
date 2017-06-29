package cn.dylan.type;

import com.google.common.collect.Maps;

import java.sql.Types;
import java.util.Map;

/**
 * Created by yuhp@terminus.io on 2017/6/29.
 * Desc: This is added to enable basic support for the
 * ARRAY data type - but a custom type handler is still required
 * <p>
 * 这些是为ARRAY数据类型作基础支持，但是仍然需要自定义 typeHandler
 */
public enum JdbcType {
    ARRAY(Types.ARRAY),
    BIT(Types.BIT),
    TINYINT(Types.TINYINT),
    SMALLINT(Types.SMALLINT),
    INTEGER(Types.INTEGER),
    BIGINT(Types.BIGINT),
    FLOAT(Types.FLOAT),
    REAL(Types.REAL),
    DOUBLE(Types.DOUBLE),
    NUMERIC(Types.NUMERIC),
    DECIMAL(Types.DECIMAL),
    CHAR(Types.CHAR),
    VARCHAR(Types.VARCHAR),
    LONGVARCHAR(Types.LONGVARCHAR),
    DATE(Types.DATE),
    TIME(Types.TIME),
    TIMESTAMP(Types.TIMESTAMP),
    BINARY(Types.BINARY),
    VARBINARY(Types.VARBINARY),
    LONGVARBINARY(Types.LONGVARBINARY),
    NULL(Types.NULL),
    OTHER(Types.OTHER),
    BLOB(Types.BLOB),
    CLOB(Types.CLOB),
    BOOLEAN(Types.BOOLEAN),
    CURSOR(-10), // Oracle
    UNDEFINED(Integer.MIN_VALUE + 1000),
    NVARCHAR(Types.NVARCHAR), // JDK6
    NCHAR(Types.NCHAR), // JDK6
    NCLOB(Types.NCLOB), // JDK6
    STRUCT(Types.STRUCT),
    JAVA_OBJECT(Types.JAVA_OBJECT),
    DISTINCT(Types.DISTINCT),
    REF(Types.REF),
    DATALINK(Types.DATALINK),
    ROWID(Types.ROWID), // JDK6
    LONGNVARCHAR(Types.LONGNVARCHAR), // JDK6
    SQLXML(Types.SQLXML), // JDK6
    DATETIMEOFFSET(-155),; // SQL Server 2008

    public final int TYPE_CODE;

    JdbcType(int code) {
        this.TYPE_CODE = code;
    }

    //add cache
    private static Map<Integer, JdbcType> codeLookup = Maps.newHashMap();

    static {
        for (JdbcType type : JdbcType.values()) {
            codeLookup.put(type.TYPE_CODE, type);
        }
    }

    public static JdbcType forCode(int code) {
        return codeLookup.get(code);
    }
}
