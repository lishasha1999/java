package day08;

/**
 * @author rustle
 * @date 2021-09-05 8:30
 * @Description
 * @return
 */
public class IllegalAgeException extends Exception {

    private static final long serialVersionUID=1L;

    public IllegalAgeException(){
    }
    public IllegalAgeException(String message){
        super(message);
    }
    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
