package com.ryan.commons.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.ryan.commons.version.ApiVersionRequestMappingHandlerMapping;


@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

	/**
	 * versioning 사용시 prefix 매핑을 위한 method
	 * URI 에 prefix: 'v' 가 있을경우 @ApiVersion 과 조합하여 versioning path 를 만든다.
	 *    
	 */
	@Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        return new ApiVersionRequestMappingHandlerMapping("v");
    }
}
