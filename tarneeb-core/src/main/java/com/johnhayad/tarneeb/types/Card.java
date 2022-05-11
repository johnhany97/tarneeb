/*
 * (c) Copyright 2022 John H. Ayad. All rights reserved.
 */
package com.johnhayad.tarneeb.types;

import org.immutables.value.Value;

@Value.Immutable
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

    static Builder builder() {
        return new Builder();
    }

    final class Builder extends ImmutableCard.Builder {}
}
