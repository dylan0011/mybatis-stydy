package cn.dylan.logging;

import cn.dylan.exceptions.PersistenceException;

/**
 * Created by yuhp@terminus.io on 2017/6/30.
 * Desc:
 */
public class LogException extends PersistenceException {
    private static final long serialVersionUID = 4257873174723827855L;

    public LogException() {
        super();
    }

    public LogException(String message) {
        super(message);
    }

    public LogException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogException(Throwable cause) {
        super(cause);
    }

}
