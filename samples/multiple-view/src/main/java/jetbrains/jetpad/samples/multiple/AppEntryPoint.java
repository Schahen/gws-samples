/*
 * Copyright 2012-2016 JetBrains s.r.o
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
package jetbrains.jetpad.samples.multiple;

import com.google.gwt.core.client.EntryPoint;
import jetbrains.jetpad.samples.multiple.mappers.SomeViewMapper;
import jetbrains.jetpad.samples.multiple.models.SomeModel;
import jetbrains.jetpad.samples.multiple.views.SomeOtherView;
import jetbrains.jetpad.samples.multiple.views.SomeView;

import static com.google.gwt.query.client.GQuery.$;

public class AppEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        SomeModel model = new SomeModel();

        SomeViewMapper someViewMapper = new SomeViewMapper(model, new SomeView());
        someViewMapper.attachRoot();
        $("#wrapper").append(someViewMapper.getTarget().getElement());

        SomeViewMapper someViewMapper2 = new SomeViewMapper(model, new SomeOtherView());
        someViewMapper2.attachRoot();
        $("#wrapper").append(someViewMapper2.getTarget().getElement());

        someViewMapper.getSource().text.set("The same property in multiple views!!!!");
    }


}