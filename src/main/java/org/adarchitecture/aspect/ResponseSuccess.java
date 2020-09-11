package org.adarchitecture.aspect;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.adarchitecture.http.SuccessCode;

@Retention(RUNTIME)
@Target(METHOD)
public @interface ResponseSuccess {
	
	SuccessCode value() default SuccessCode.OK_DEFAULT;

}
