package com.kyd.core.utils;

import com.kyd.core.exception.AnnotationNotFoundException;
import com.kyd.core.exception.ClazzNotFoundException;

import java.lang.annotation.Annotation;

public class AnnotationUtils {

    private AnnotationUtils() {
    }

    public static Annotation annotation(Class clazz , Class annotationClass) throws ClassNotFoundException, AnnotationNotFoundException, ClazzNotFoundException {
        if (clazz==null) {
            throw new ClazzNotFoundException();
        }

        if (annotationClass ==null) {
            throw new AnnotationNotFoundException() ;
        }

        return clazz.getAnnotation(annotationClass);
    }

    public static Annotation annotation(String className ,Class annotationClass) throws ClassNotFoundException, ClazzNotFoundException, AnnotationNotFoundException {
        Class clazz = Class.forName(className);
        return annotation(clazz,annotationClass);
    }
}
