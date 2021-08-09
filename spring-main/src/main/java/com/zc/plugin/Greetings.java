package com.zc.plugin;

import com.zc.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Decebal Suiu
 */
@Component
@DependsOn("pluginManager")
public class Greetings {

    @Autowired
    private List<Greeting> greetings;

    public void printGreetings() {
        System.out.println(String.format("Found %d extensions for extension point '%s'", greetings.size(), Greeting.class.getName()));
        for (Greeting greeting : greetings) {
            System.out.println(">>> " + greeting.init());
        }
    }

}
