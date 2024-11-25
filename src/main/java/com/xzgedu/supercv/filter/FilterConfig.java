package com.xzgedu.supercv.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean addLogTraceIdFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new LogTraceIdFilter());
        bean.addUrlPatterns("/v1/*");
        bean.setOrder(1);
        return bean;
    }

    @Bean
    public FilterRegistrationBean addAccessLogFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new AccessLogFilter());
        bean.addUrlPatterns("/v1/*");
        bean.setOrder(2);
        return bean;
    }
}