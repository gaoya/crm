package com.kyd.core.exception;

/**
 * 注解类没有发现
 */
public class AnnotationNotFoundException extends Exception {
    public AnnotationNotFoundException() {
    }

    public AnnotationNotFoundException(String message) {
        super(message);
    }

    public AnnotationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnnotationNotFoundException(Throwable cause) {
        super(cause);
    }

    public AnnotationNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
