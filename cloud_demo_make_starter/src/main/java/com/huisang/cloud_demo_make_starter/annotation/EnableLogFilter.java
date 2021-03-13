package com.huisang.cloud_demo_make_starter.annotation;

import com.huisang.cloud_demo_make_starter.config.LogFilterAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/9 10:41
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(LogFilterAutoConfiguration.class) //引入LogFilterAutoConfiguration配置类
public @interface EnableLogFilter {
}
