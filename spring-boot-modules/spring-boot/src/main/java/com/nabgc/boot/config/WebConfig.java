package com.nabgc.boot.config;

import com.nabgc.boot.converter.StringToEmployeeConverter;
import com.nabgc.boot.converter.StringToEnumConverterFactory;
import com.nabgc.boot.converter.GenericBigDecimalConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	 
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToEmployeeConverter());
        registry.addConverterFactory(new StringToEnumConverterFactory());
        registry.addConverter(new GenericBigDecimalConverter());
    }
}

