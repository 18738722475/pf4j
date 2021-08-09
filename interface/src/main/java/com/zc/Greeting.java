package com.zc;

import org.pf4j.ExtensionPoint;

public interface Greeting extends ExtensionPoint {

    Object init(Object... objects);

    Object read(Object... objects);

    Object save(Object... objects);
}