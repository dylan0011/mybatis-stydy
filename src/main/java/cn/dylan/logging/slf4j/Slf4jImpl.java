package cn.dylan.logging.slf4j;

import cn.dylan.logging.Log;
import org.slf4j.Logger;

/**
 * Created by yuhp@terminus.io on 2017/6/30.
 * Desc:
 */
public class Slf4jImpl implements Log{

    private Logger logger;

    public Slf4jImpl(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public void error(String s, Throwable e) {
        logger.error(s, e);
    }

    @Override
    public void error(String s) {
        logger.error(s);
    }

    @Override
    public void debug(String s) {
        logger.debug(s);
    }

    @Override
    public void trace(String s) {
        logger.trace(s);
    }

    @Override
    public void warn(String s) {
        logger.warn(s);
    }
}
