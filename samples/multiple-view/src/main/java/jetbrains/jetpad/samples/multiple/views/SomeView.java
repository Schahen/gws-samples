package jetbrains.jetpad.samples.multiple.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import jetbrains.jetpad.mapper.gwt.BaseWithElement;



public class SomeView extends BaseWithElement implements SomeViewInterface {
    private static final SomeViewUiInterface UI_BINDER = GWT.create(SomeViewUiInterface.class);

    public SomeView() {
        setElement(UI_BINDER.createAndBindUi(this));
    }

    @UiField
    public Element text;

    @Override
    public Element getText() {
        return text;
    }

    interface SomeViewUiInterface extends UiBinder<Element, SomeView> {}
}


