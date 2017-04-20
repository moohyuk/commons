package com.ryan.commons.version;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ApiVersion({1}) 과 같이 사용하여 URI path 가장 앞에 version 을 명시할 수 있다
 * @author lmhyuks
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiVersion {
	int[] value();
}
