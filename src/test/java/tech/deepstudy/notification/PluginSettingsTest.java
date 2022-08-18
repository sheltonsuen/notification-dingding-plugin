/*
 * Copyright 2018 ThoughtWorks, Inc.
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

package tech.deepstudy.notification;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PluginSettingsTest {
    @Test
    public void shouldDeserializeFromJSON() throws Exception {
        PluginSettings pluginSettings = PluginSettings.fromJSON("{" +
                "\"users\": \"sheltonsuen@163.com/bcx_8h10aurb9|shexx@163.com/xxx\", " +
                "\"webhook\": \"https://webhook\", " +
                "\"keyword\": \"foobar\"" +
                "}");

        assertThat(pluginSettings.getUsers(), is("sheltonsuen@163.com/bcx_8h10aurb9|shexx@163.com/xxx"));
        assertThat(pluginSettings.getKeyword(), is("foobar"));
        assertThat(pluginSettings.getWebhook(), is("https://webhook"));
    }
}
