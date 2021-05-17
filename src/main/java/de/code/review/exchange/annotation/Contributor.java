package de.code.review.exchange.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public @interface Contributor {
    public String name();
    public String version();
    public String note() default "Improvement";
}
