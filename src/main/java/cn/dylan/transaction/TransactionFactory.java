package cn.dylan.transaction;

import cn.dylan.session.TransactionIsolationLevel;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created by yuhp@terminus.io on 2017/6/29.
 * Desc: create {@link Transaction} instance
 */
public interface TransactionFactory {

    /**
     * 设置自定义配置
     * @param props
     */
    void setProperties(Properties props);

    /**
     * 从现有连接中创建一个事务
     * @param conn Existing database connection 已存在的数据库连接
     * @return transaction
     */
    Transaction newTransaction(Connection conn);

    /**
     *
     * @param dataSource DataSource to take the connection from 获取连接的数据源
     * @param level 事务隔离级别
     * @param autoCommit autoCommit
     * @return transaction
     */
    Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit);

}
