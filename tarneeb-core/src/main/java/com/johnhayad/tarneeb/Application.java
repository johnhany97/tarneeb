/*
 * (c) Copyright 2022 John H. Ayad. All rights reserved.
 */
package com.johnhayad.tarneeb;

import com.johnhayad.tarneeb.types.Card;
import com.johnhayad.tarneeb.types.Card.Rank;
import com.johnhayad.tarneeb.types.Card.Suit;
import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.logger.SafeLogger;
import com.palantir.logsafe.logger.SafeLoggerFactory;

public final class Application {
    private static final SafeLogger log = SafeLoggerFactory.get(Application.class);

    public static void main(String[] _args) {
        log.info("Hello world!");
        Card test = Card.builder().suit(Suit.CLUBS).rank(Rank.EIGHT).build();
        log.info("My Card {}", SafeArg.of("card", test));
    }

    private Application() {}
}
