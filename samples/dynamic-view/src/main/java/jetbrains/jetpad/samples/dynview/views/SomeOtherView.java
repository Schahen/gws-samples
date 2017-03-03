package jetbrains.jetpad.samples.dynview.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import jetbrains.jetpad.mapper.gwt.BaseWithElement;



public class SomeOtherView extends BaseWithElement implements SomeViewInterface{
    private static final SomeOtherViewUiInterface UI_BINDER = GWT.create(SomeOtherViewUiInterface.class);

    public SomeOtherView() {
        setElement(UI_BINDER.createAndBindUi(this));
    }

    @UiField
    public Element text;

    @Override
    public Element getText() {
        return text;
    }

    interface SomeOtherViewUiInterface extends UiBinder<Element, SomeOtherView> {}
}


