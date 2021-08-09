package com.zc;

import org.pf4j.ExtensionFactory;
import org.pf4j.SingletonExtensionFactory;
import org.pf4j.ZipPluginManager;

public class MyPluginManager extends ZipPluginManager {


    @Override
    protected ExtensionFactory createExtensionFactory() {
        return new SingletonExtensionFactory();
    }
}
