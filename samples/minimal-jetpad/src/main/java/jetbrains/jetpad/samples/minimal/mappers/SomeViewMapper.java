package jetbrains.jetpad.samples.minimal.mappers;

import jetbrains.jetpad.mapper.Mapper;
import jetbrains.jetpad.mapper.Synchronizers;
import jetbrains.jetpad.samples.minimal.models.SomeModel;
import jetbrains.jetpad.samples.minimal.views.SomeView;

import static jetbrains.jetpad.mapper.gwt.DomUtil.innerTextOf;

public class SomeViewMapper extends Mapper<SomeModel, SomeView> {

    public SomeViewMapper(SomeModel source) {
        super(source, new SomeView());
    }


    @Override
    protected void registerSynchronizers(SynchronizersConfiguration conf) {
        super.registerSynchronizers(conf);
        //conf.add(Synchronizers.forPropsTwoWay(getSource().text, innerTextOf(getTarget().text)))
    }
}


//class TodoListItemMapper extends Mapper<TodoListItem, TodoListItemView> {