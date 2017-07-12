package cn.dylan.executor.result;

import cn.dylan.exceptions.PersistenceException;

/**
 * Created by yuhp@terminus.io on 2017/7/12.
 * Desc:
 */
public class ResultMapException extends PersistenceException {
    private static final long serialVersionUID = -729339423878652722L;

    public ResultMapException() {
    }

    public ResultMapException(String message) {
        super(message);
    }

    public ResultMapException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResultMapException(Throwable cause) {
        super(cause);
    }
}
