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
package jetbrains.jetpad.samples.dynview;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.Properties;
import com.google.gwt.user.client.Window;
import jetbrains.jetpad.samples.dynview.mappers.SomeViewMapper;
import jetbrains.jetpad.samples.dynview.models.SomeModel;
import jetbrains.jetpad.samples.dynview.views.SomeOtherView;
import jetbrains.jetpad.samples.dynview.views.SomeView;
import jetbrains.jetpad.samples.dynview.views.SomeViewInterface;

import static com.google.gwt.query.client.GQuery.$;
import static com.google.gwt.user.client.Window.alert;

public class AppEntryPoint implements EntryPoint {


    @Override
    public void onModuleLoad() {

        final SomeViewInterface[] view = {new SomeView()};
        final SomeViewMapper[] someViewMapper = {new SomeViewMapper(new SomeModel(), view[0])};
        someViewMapper[0].attachRoot();
        $("#content").empty().append(view[0].getElement());

        $("#view1").on("click", new Function() {
            @Override
            public void f() {
                view[0] = new SomeView();
                someViewMapper[0] = someViewMapper[0].remapWithView(view[0]);
                $("#content").empty().append(view[0].getElement());
                someViewMapper[0].attachRoot();
            }
        });

        $("#view2").on("click", new Function() {
            @Override
            public void f() {
                view[0] = new SomeOtherView();
                someViewMapper[0] = someViewMapper[0].remapWithView(view[0]);
                $("#content").empty().append(view[0].getElement());
                someViewMapper[0].attachRoot();
            }
        });

        someViewMapper[0].getSource().text.set("That is one good dynamic property");
    }


}