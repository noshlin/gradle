/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.tooling;

import org.gradle.api.Incubating;

import java.util.List;

/**
 * Thrown whenever a listener failed with an exception, which in general implies that
 * the build completed like it should, but that one of the listeners failed with an
 * exception.
 *
 * @since 2.5
 */
@Incubating
public class ListenerFailedException extends GradleConnectionException {
    private final List<? extends Throwable> listenerFailures;

    public ListenerFailedException(List<? extends Throwable> failures) {
        super("One or more progress listeners failed with an exception.");
        listenerFailures = failures;
        if (!failures.isEmpty()) {
            initCause(failures.get(0));
        }
    }

    public List<? extends Throwable> getCauses() {
        return listenerFailures;
    }
}
