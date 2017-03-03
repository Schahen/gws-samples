package jetbrains.jetpad.samples.dynview.mappers;

import jetbrains.jetpad.mapper.Mapper;
import jetbrains.jetpad.mapper.Synchronizers;
import jetbrains.jetpad.model.property.WritableProperty;
import jetbrains.jetpad.samples.dynview.models.SomeModel;
import jetbrains.jetpad.samples.dynview.views.SomeOtherView;
import jetbrains.jetpad.samples.dynview.views.SomeView;
import jetbrains.jetpad.samples.dynview.views.SomeViewInterface;

import static jetbrains.jetpad.mapper.gwt.DomUtil.innerTextOf;

public class SomeViewMapper extends Mapper<SomeModel, SomeViewInterface> {

    public SomeViewMapper(SomeModel source, SomeViewInterface view) {
        super(source, view);
    }

    public SomeViewMapper remapWithView(SomeViewInterface view) {
        return new SomeViewMapper(getSource(), view);
    }

    @Override
    protected void registerSynchronizers(SynchronizersConfiguration conf) {
        super.registerSynchronizers(conf);

        conf.add(Synchronizers.forPropsOneWay(getSource().text, innerTextOf(getTarget().getText())));
    }
}


