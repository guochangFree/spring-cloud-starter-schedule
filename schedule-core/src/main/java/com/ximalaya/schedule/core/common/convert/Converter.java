/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ximalaya.schedule.core.common.convert;


/**
 * A class to convert the source-typed value to the target-typed value
 * TODO 未有任何是实现
 *
 * @param <S> The source type
 * @param <T> The target type
 * @since 2.7.6
 */
@FunctionalInterface
public interface Converter<S, T> {

    /**
     * Convert the source-typed value to the target-typed value
     *
     * @param source the source-typed value
     * @return the target-typed value
     */
    T convert(S source);


    /**
     * Get the Converter instance from {@link } with the specified source and target type
     *
     * @param sourceType the source type
     * @param targetType the target type
     * @return
     */
    static Converter<?, ?> getConverter(Class<?> sourceType, Class<?> targetType) {
        return (Converter<Object, Object>) source -> null;
    }

    /**
     * Convert the value of source to target-type value if possible
     *
     * @param source     the value of source
     * @param targetType the target type
     * @param <T>        the target type
     * @return <code>null</code> if can't be converted
     * @since 2.7.8
     */
    static <T> T convertIfPossible(Object source, Class<T> targetType) {
        Converter converter = getConverter(source.getClass(), targetType);
        if (converter != null) {
            return (T) converter.convert(source);
        }
        return null;
    }
}
