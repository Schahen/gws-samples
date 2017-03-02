package jetbrains.jetpad.samples.minimal.models;

import jetbrains.jetpad.model.property.Property;
import jetbrains.jetpad.model.property.ValueProperty;
import jetbrains.jetpad.model.property.WritableProperty;


public class SomeModel {
    final public Property<String> text = new ValueProperty<>("HEY!");
}
