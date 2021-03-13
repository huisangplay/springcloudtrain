package com.huisang.cloud_demo_make_starter.config;

import com.huisang.cloud_demo_make_starter.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/9 10:32
 */
public class LogFilterRegistrationBean extends FilterRegistrationBean<LogFilter> {
    public LogFilterRegistrationBean(){
        super();
        //添加LogFilter过滤器
        this.setFilter(new LogFilter());
        // 匹配所有路径
        this.addUrlPatterns("/*");
        // 定义过滤器名
        this.setName("LogFilter");
        // 设置优先级
        this.setOrder(1);
    }
}
