package com.example.ditt_sdk.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DevToolController {
    String name();
    String category();
    String description() default "";
    int isPremium() default 0;
    int isEnabled() default 1;
    String files() default "";
    String pluginFolder() default "";
}