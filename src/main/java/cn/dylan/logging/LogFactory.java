package cn.dylan.logging;

import cn.dylan.logging.slf4j.Slf4jImpl;

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

    static {
        tryImplementation(LogFactory::useSlf4jLogging);
    }

    public static Log getLog(Class<?> aClass) {
        return getLog(aClass.getName());
    }

    public static Log getLog(String logger) {
        try {
            return logConstructor.newInstance(logger);
        } catch (Throwable t) {
            throw new LogException("Error creating logger for logger " + logger + ".  Cause: " + t, t);
        }
    }

    public static synchronized void useSlf4jLogging() {
        setImplementation(Slf4jImpl.class);
    }

    private static void tryImplementation(Runnable runnable) {
        if (logConstructor == null) {
            try {
                runnable.run();
            } catch (Throwable t) {
                // ignore
            }
        }
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
