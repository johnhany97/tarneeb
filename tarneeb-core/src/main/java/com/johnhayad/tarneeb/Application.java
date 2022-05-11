/*
 * (c) Copyright 2022 John H. Ayad. All rights reserved.
 */
package com.johnhayad.tarneeb;

import com.palantir.logsafe.logger.SafeLogger;
import com.palantir.logsafe.logger.SafeLoggerFactory;

public final class Application {
    private static final SafeLogger log = SafeLoggerFactory.get(Application.class);

    public static void main(String[] _args) {
        log.info("Hello world!");
    }

    private Application() {}
}
