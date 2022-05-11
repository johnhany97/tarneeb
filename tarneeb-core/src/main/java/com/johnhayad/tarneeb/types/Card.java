/*
 * (c) Copyright 2022 John H. Ayad. All rights reserved.
 */
package com.johnhayad.tarneeb.types;

import org.immutables.value.Value;

@Value.Immutable
public interface Card extends Comparable<Card> {
    Suit suit();

    Rank rank();

    enum Suit {
        SPADE,
        HEART,
        DIAMOND,
        CLUBS
    }

    enum Rank {
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

    @Override
    default int compareTo(Card otherCard) {
        // TODO(jayad): implement me
        return -1;
    }

    static Builder builder() {
        return new Builder();
    }

    final class Builder extends ImmutableCard.Builder {}
}
