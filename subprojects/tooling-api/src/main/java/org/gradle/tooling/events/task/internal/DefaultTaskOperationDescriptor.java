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

package org.gradle.tooling.events.task.internal;

import org.gradle.tooling.events.OperationDescriptor;
import org.gradle.tooling.events.internal.DefaultOperationDescriptor;
import org.gradle.tooling.events.task.TaskOperationDescriptor;

/**
 * Implementation of the {@code TaskOperationDescriptor} interface.
 */
public final class DefaultTaskOperationDescriptor extends DefaultOperationDescriptor implements TaskOperationDescriptor {

    private final String taskPath;

    public DefaultTaskOperationDescriptor(String name, String displayName, String taskPath, OperationDescriptor parent) {
        super(name, displayName, parent);
        this.taskPath = taskPath;
    }

    @Override
    public String getTaskPath() {
        return taskPath;
    }

}
