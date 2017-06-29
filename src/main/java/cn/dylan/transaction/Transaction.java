package cn.dylan.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by yuhp@terminus.io on 2017/6/29.
 * Desc:
 */
public interface Transaction {

    Connection getConnection() throws SQLException;

    void commit() throws SQLException;

    void rollback() throws SQLException;

    void close() throws SQLException;

    /**
     * Get transaction timeout if set
     * @throws SQLException
     */
    Integer getTimeout() throws SQLException;

}
