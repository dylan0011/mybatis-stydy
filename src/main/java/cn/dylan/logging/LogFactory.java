package cn.dylan.logging;

import java.lang.reflect.Constructor;

/**
 * Created by yuhp@terminus.io on 2017/6/30.
 * Desc:
 */
public final class LogFactory {

    public static final String MARKER = "MYBATIS";

    private static Constructor<? extends Log> logConstructor;

    private LogFactory() {
        // disable constructor
    }

    

    private static void setImplementation(Class<? extends Log> implClass) {
        try {
            Constructor<? extends Log> candidate = implClass.getConstructor(String.class);
            Log log = candidate.newInstance(LogFactory.class.getName());
            if (log.isDebugEnabled()) {
                log.debug("Logging initialized using '" + implClass + "' adapter.");
            }
            logConstructor = candidate;
        } catch (Throwable t) {
            throw new LogException("Error setting Log implementation.  Cause: " + t, t);
        }
    }

}
