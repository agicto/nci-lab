package com.test.product.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis 配置类
 *
 * @author hanjixin
 */
@EnableTransactionManagement
@Configuration
@MapperScan({"com.test.product.mapper"})
public class MyBatisConfig {

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // 开启 count 的 join 优化,只针对部分 left join
        page.setCountSqlParser(new JsqlParserCountOptimize(true));
        return page;
    }

    /**
     * mybatis-plus乐观锁插件
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    /**
     * 打印 sql，性能分析拦截器，不建议生产使用
     * 设置 dev test 环境开启
     */
    @Bean
    @Profile({"dev", "test"})
    public PerformanceMonitorInterceptor performanceInterceptor() {
        return new PerformanceMonitorInterceptor();
    }
}
