/*
* Copyright 2015 Stormpath, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.stormpath.sdk.impl.mail;

import com.stormpath.sdk.impl.ds.*;
import com.stormpath.sdk.impl.resource.*;
import com.stormpath.sdk.mail.*;

import java.util.*;

/**
 * @since 1.0.RC4.5
 */
public class DefaultUnmodeledEmailTemplateList extends AbstractCollectionResource<UnmodeledEmailTemplate> implements UnmodeledEmailTemplateList {

    private static final ArrayProperty<UnmodeledEmailTemplate> ITEMS = new ArrayProperty<UnmodeledEmailTemplate>("items", UnmodeledEmailTemplate.class);

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(OFFSET, LIMIT, ITEMS);

    public DefaultUnmodeledEmailTemplateList(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultUnmodeledEmailTemplateList(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    public DefaultUnmodeledEmailTemplateList(InternalDataStore dataStore, Map<String, Object> properties, Map<String, Object> queryParams) {
        super(dataStore, properties, queryParams);
    }

    @Override
    protected Class<UnmodeledEmailTemplate> getItemType() {
        return UnmodeledEmailTemplate.class;
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }
}
