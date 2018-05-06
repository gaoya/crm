package com.kyd.core.exception;

/**
 *  类没有发现使用
 */
public class ClazzNotFoundException extends Exception {
    public ClazzNotFoundException() {
    }

    public ClazzNotFoundException(String message) {
        super(message);
    }

    public ClazzNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClazzNotFoundException(Throwable cause) {
        super(cause);
    }

    public ClazzNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
