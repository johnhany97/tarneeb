/*
 * (c) Copyright 2022 John H. Ayad. All rights reserved.
 */
package com.johnhayad.tarneeb.types;

import com.johnhayad.tarneeb.types.ImmutableCard.SuitBuildStage;
import com.johnhayad.tarneeb.utils.ImmutablesOpinion;
import org.immutables.value.Value;

@Value.Immutable
@ImmutablesOpinion
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

    static SuitBuildStage builder() {
        return ImmutableCard.builder();
    }
}
