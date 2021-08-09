package com.zc;

import org.pf4j.Extension;
import org.springframework.stereotype.Service;

@Extension(plugins = "chineseGreeting2")
public class ChineseGreeting implements Greeting {
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