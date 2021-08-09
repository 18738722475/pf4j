package com.zc;

import com.zc.config.SpringConfiguration;
import com.zc.plugin.Greetings;
import org.pf4j.PluginManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // retrieves the Spring application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Greetings greetings = applicationContext.getBean(Greetings.class);
        greetings.printGreetings();
        PluginManager pluginManager = applicationContext.getBean(PluginManager.class);
        pluginManager.stopPlugins();
    }

}
