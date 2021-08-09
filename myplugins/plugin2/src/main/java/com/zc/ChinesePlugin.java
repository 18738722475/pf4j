package com.zc;

import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class ChinesePlugin extends Plugin {
 

    public ChinesePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }
 
    @Override
    public void start(){
        System.out.println("Chinese plugin start.");
        super.start();
    }
 
    @Override
    public void stop(){
        System.out.println("Chinese plugin stop.");
        super.stop();
    }


}