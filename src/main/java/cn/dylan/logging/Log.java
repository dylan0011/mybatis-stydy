package cn.dylan.logging;

/**
 * Created by yuhp@terminus.io on 2017/6/30.
 * Desc:
 */
public interface Log {

    boolean isDebugEnabled();

    boolean isTraceEnabled();

    void error(String s, Throwable e);

    void error(String s);

    void debug(String s);

    void trace(String s);

    void warn(String s);

}
