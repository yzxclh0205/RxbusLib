package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2017/9/9 0009.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface DIView {
    int value();
}
