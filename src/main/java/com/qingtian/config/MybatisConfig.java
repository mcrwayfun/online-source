package com.qingtian.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/08/20
 * @description mybatis分页插件配置
 */
@Configuration
public class MybatisConfig {

    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();

        // 设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用
        p.setProperty("offsetAsPageNum","true");

        //设置为true时，使用RowBounds分页会进行count查询
        p.setProperty("rowBoundsWithCount","true");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
