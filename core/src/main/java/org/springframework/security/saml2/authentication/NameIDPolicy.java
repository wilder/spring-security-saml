/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.authentication;

import org.springframework.security.saml2.metadata.NameId;

public class NameIDPolicy<T extends NameIDPolicy> {

    private NameId format;
    private String spNameQualifier;
    private Boolean allowCreate;

    @SuppressWarnings("checked")
    protected T _this() {
        return (T)this;
    }

    public NameIDPolicy() {
    }

    public NameIDPolicy(NameId format, String spNameQualifier, Boolean allowCreate) {
        this.format = format;
        this.spNameQualifier = spNameQualifier;
        this.allowCreate = allowCreate;
    }

    public String getSpNameQualifier() {
        return spNameQualifier;
    }

    public T setSpNameQualifier(String spNameQualifier) {
        this.spNameQualifier = spNameQualifier;
        return _this();
    }

    public Boolean getAllowCreate() {
        return allowCreate;
    }

    public T setAllowCreate(Boolean allowCreate) {
        this.allowCreate = allowCreate;
        return _this();
    }

    public NameId getFormat() {
        return format;
    }

    public T setFormat(NameId format) {
        this.format = format;
        return _this();
    }
}
