/*
 * (c) Copyright 2022 Palantir Technologies Inc. All rights reserved.
 */

package com.johnhayad.tarneeb.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

// Inspired from
// https://github.com/palantir/auth-tokens/blob/develop/auth-tokens/src/main/java/com/palantir/tokens/auth/ImmutablesStyle.java
// but also enables staged builder
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Value.Style(visibility = ImplementationVisibility.PACKAGE, jdkOnly = true, stagedBuilder = true)
public @interface ImmutablesOpinion {}
