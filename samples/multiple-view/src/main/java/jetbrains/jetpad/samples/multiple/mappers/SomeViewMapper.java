package jetbrains.jetpad.samples.multiple.mappers;

import jetbrains.jetpad.mapper.Mapper;
import jetbrains.jetpad.mapper.Synchronizers;
import jetbrains.jetpad.samples.multiple.models.SomeModel;
import jetbrains.jetpad.samples.multiple.views.SomeViewInterface;

import static jetbrains.jetpad.mapper.gwt.DomUtil.innerTextOf;

public class SomeViewMapper extends Mapper<SomeModel, SomeViewInterface> {

    public SomeViewMapper(SomeModel source, SomeViewInterface target) {
        super(source, target);
    }

    @Override
    protected void registerSynchronizers(SynchronizersConfiguration conf) {
        super.registerSynchronizers(conf);
        conf.add(Synchronizers.forPropsOneWay(getSource().text, innerTextOf(getTarget().getText())));
    }
}


