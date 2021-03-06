/*
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
package com.github.zregvart.emojilator;

import java.io.IOException;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmojilateActionTest {

    EmojilateAction action;

    public EmojilateActionTest() throws IOException {
        action = new EmojilateAction();
    }

    @Test
    public void shouldEmojilate() {
        assertThat(action.emojilate("The Face of happiness!")).isEqualTo("The 😨 of ☺️!");
        assertThat(action.emojilate("Wait! There might be dragons here")).isEqualTo("🚏! There might be 🐉 📌");
    }
}
