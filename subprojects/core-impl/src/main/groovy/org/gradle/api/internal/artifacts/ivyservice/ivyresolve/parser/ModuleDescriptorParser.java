/*
 * Copyright 2013 the original author or authors.
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

package org.gradle.api.internal.artifacts.ivyservice.ivyresolve.parser;

import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.repository.Resource;
import org.gradle.internal.resource.local.LocallyAvailableResource;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public interface ModuleDescriptorParser {
    public ModuleDescriptor parseDescriptor(ParserSettings ivySettings, File descriptorFile, boolean validate) throws ParseException, IOException;

    public ModuleDescriptor parseDescriptor(ParserSettings ivySettings, LocallyAvailableResource localResource, Resource resource, boolean validate) throws ParseException, IOException;

    public boolean accept(Resource res);
}
