package com.alibaba.taobao.configuration;


import com.alibaba.taobao.filiter.UserFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserFilterConfig {

    @Bean
    public UserFilter userFilter(){
        return new UserFilter();
    }


    @Bean(name = "UserFilterConf")
    public FilterRegistrationBean UserFilterConfig(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(userFilter());
        filterRegistrationBean.addUrlPatterns("/car/*");
        filterRegistrationBean.addUrlPatterns("/order/*");
        filterRegistrationBean.setName("UserFilterConf");
        return filterRegistrationBean;
    }

}
