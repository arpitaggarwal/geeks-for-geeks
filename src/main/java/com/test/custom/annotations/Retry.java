package com.test.custom.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Retry {

	int retryCount() default 2;

	String stringValue() default "";

	Class<?>[] value();
	

	public enum Priority {
	   LOW, MEDIUM, HIGH
	}

	Priority priority() default Priority.MEDIUM;
}
