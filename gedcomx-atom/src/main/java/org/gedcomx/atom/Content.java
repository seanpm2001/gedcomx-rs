/**
 * Copyright 2011-2012 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.atom;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.annotate.JsonTypeIdResolver;
import org.gedcomx.rt.XmlTypeIdResolver;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * @author Ryan Heaton
 */
@XmlType ( name = "Content" )
@JsonTypeInfo ( use = JsonTypeInfo.Id.CUSTOM, property = XmlTypeIdResolver.TYPE_PROPERTY_NAME)
@JsonTypeIdResolver (XmlTypeIdResolver.class)
@SuppressWarnings("gedcomx:no_id")
public class Content extends ExtensibleElement {

  private String type;

  /**
   * The type of the content.
   *
   * @return The type of the content.
   */
  @XmlAttribute
  public String getType() {
    return type;
  }

  /**
   * The type of the content.
   *
   * @param type The type of the content.
   */
  public void setType(String type) {
    this.type = type;
  }
}
