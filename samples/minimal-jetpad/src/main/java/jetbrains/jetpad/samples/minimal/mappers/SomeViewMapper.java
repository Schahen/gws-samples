package jetbrains.jetpad.samples.minimal.mappers;

import com.google.gwt.dom.client.InputElement;
import jetbrains.jetpad.mapper.Mapper;
import jetbrains.jetpad.mapper.Synchronizers;
import jetbrains.jetpad.model.property.Property;
import jetbrains.jetpad.model.property.WritableProperty;
import jetbrains.jetpad.samples.minimal.models.SomeModel;
import jetbrains.jetpad.samples.minimal.views.SomeView;

import static jetbrains.jetpad.mapper.gwt.DomUtil.checkbox;
import static jetbrains.jetpad.mapper.gwt.DomUtil.innerTextOf;
import static jetbrains.jetpad.mapper.gwt.DomUtil.hasClass;

public class SomeViewMapper extends Mapper<SomeModel, SomeView> {

    public SomeViewMapper(SomeModel source) {
        super(source, new SomeView());
    }

    private static WritableProperty<Boolean> flagDescription(com.google.gwt.dom.client.Element el) {
        return new WritableProperty<Boolean>() {
            @Override
            public void set(Boolean flag) {
                el.setInnerText(String.valueOf(flag));
            }
        };
    }

    @Override
    protected void registerSynchronizers(SynchronizersConfiguration conf) {
        super.registerSynchronizers(conf);

        conf.add(Synchronizers.forPropsOneWay(getSource().text, innerTextOf(getTarget().text)));
        conf.add(Synchronizers.forPropsTwoWay(getSource().flag, checkbox(getTarget().flag)));
        conf.add(Synchronizers.forPropsOneWay(getSource().flag, flagDescription(getTarget().flagDescription)));
    }
}


