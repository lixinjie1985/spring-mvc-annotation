package org.eop.spring.mvc.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2017-10-04
 */
@Configuration
@ComponentScan(basePackages = {}, excludeFilters = @Filter(value = EnableWebMvc.class))
public class RootConfig {

}
