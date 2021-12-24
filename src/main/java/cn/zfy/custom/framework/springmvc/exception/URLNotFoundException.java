package cn.zfy.custom.framework.springmvc.exception;

/**
 * @Classname URLNotFoundException
 * @Description
 * @Date 2021/12/23 16:37
 * @Created by zfy
 */
public class URLNotFoundException extends RuntimeException {
    public URLNotFoundException() {
        super();
    }

    public URLNotFoundException(String message) {
        super(message);
    }

    public URLNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public URLNotFoundException(Throwable cause) {
        super(cause);
    }

}
