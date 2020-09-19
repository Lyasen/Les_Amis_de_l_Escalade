package fr.lyasen.climbing.todo;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Inherited
public @interface Todo {
    String author() default "Rémi";
    String commentary();
}
