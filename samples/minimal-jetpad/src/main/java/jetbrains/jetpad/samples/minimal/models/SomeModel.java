package jetbrains.jetpad.samples.minimal.models;

import jetbrains.jetpad.model.property.Property;
import jetbrains.jetpad.model.property.ValueProperty;


public class SomeModel {
    final public Property<String> text = new ValueProperty<>("HEY!");
}
