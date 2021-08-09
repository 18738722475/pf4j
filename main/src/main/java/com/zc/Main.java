package com.zc;

import org.pf4j.PluginManager;
import org.pf4j.PluginWrapper;
import org.pf4j.ZipPluginManager;

import java.net.URL;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //使用默认的插件管理器
        PluginManager  pluginManager = new MyPluginManager();

        //加载插件
        pluginManager.loadPlugins();


        //启动插件
        pluginManager.startPlugins();

        PluginWrapper plugin1 = pluginManager.getPlugin("plugin1");
        Path pluginPath = plugin1.getPluginPath();
        System.out.println(pluginPath);

        String pluginClass = plugin1.getDescriptor().getPluginClass();
        System.out.println(pluginClass);

        ClassLoader pluginClassLoader = plugin1.getPluginClassLoader();
        URL resource = pluginClassLoader.getResource("");
        System.out.println(resource.getPath()+"lib");

        //获取所有的Greeting的扩展实现
        List<Greeting> greetings = pluginManager.getExtensions(Greeting.class);
        List<Greeting> greetings1 = pluginManager.getExtensions(Greeting.class);
        System.out.println(greetings.get(0).equals(greetings1.get(0)));
        for (Greeting greeting : greetings) {
            System.out.println(greeting.init());
        }
        pluginManager.stopPlugins();
    }
}
