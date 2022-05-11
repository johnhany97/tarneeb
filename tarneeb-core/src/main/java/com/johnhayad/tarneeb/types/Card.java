/*
 * (c) Copyright 2022 Palantir Technologies Inc. All rights reserved.
 */

package com.johnhayad.tarneeb.types;

public interface Card {
    Suit suit();

    Value value();

    enum Suit {
        SPADE,
        HEART,
        DIAMOND,
        CLUBS
    }

    enum Value {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        JACK,
        QUEEN,
        KING
    }
}
