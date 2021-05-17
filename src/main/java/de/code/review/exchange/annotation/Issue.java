package de.code.review.exchange.annotation;

import de.code.review.exchange.type.IssueType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.SOURCE)
public @interface Issue {
    IssueType[] value();
}
