package com.zc.config;

import com.zc.plugin.Greetings;
import org.pf4j.spring.SpringPluginManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zc.*")
public class SpringConfiguration {

    @Bean
    public SpringPluginManager pluginManager() {
        return new SpringPluginManager();
    }


}
