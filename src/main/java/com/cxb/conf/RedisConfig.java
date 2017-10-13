package com.cxb.conf;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MyPC on 2017/10/13.
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

}
