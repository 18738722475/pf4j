package com.zc;

import org.pf4j.Extension;
import org.springframework.stereotype.Service;

@Extension()
public class ChineseGreeting1 implements Greeting {

    private ClassLoader classLoader;

    @Override
    public Object init(Object... objects) {
        return null;
    }

    @Override
    public Object read(Object... objects) {
        return null;
    }

    @Override
    public Object save(Object... objects) {
        return null;
    }
}