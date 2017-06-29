package cn.dylan.exceptions;

/**
 * @author Clinton Begin
 */
public class TooManyResultsException extends PersistenceException {

  private static final long serialVersionUID = 282465692003330892L;

  public TooManyResultsException() {
    super();
  }

  public TooManyResultsException(String message) {
    super(message);
  }

  public TooManyResultsException(String message, Throwable cause) {
    super(message, cause);
  }

  public TooManyResultsException(Throwable cause) {
    super(cause);
  }
}
