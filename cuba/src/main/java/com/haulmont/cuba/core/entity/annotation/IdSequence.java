/*
 * Copyright 2020 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.cuba.core.entity.annotation;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.MetaAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines sequence name in the database for id generation for {@link com.haulmont.cuba.core.entity.BaseLongIdEntity}
 * and {@link com.haulmont.cuba.core.entity.BaseIntegerIdEntity}
 *
 * @deprecated use only in legacy CUBA code. In new code, use {@link JmixGeneratedValue#sequenceName()}
 * and {@link JmixGeneratedValue#sequenceCache()} annotation parameters.
 */
@Deprecated
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@MetaAnnotation
public @interface IdSequence {
    String name();

    /**
     * If true, the sequence will be incremented by cuba.numberIdCacheSize to cache intermediate values in memory.
     */
    boolean cached() default false;
}
