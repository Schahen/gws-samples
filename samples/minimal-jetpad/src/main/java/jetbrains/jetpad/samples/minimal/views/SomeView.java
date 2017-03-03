package jetbrains.jetpad.samples.minimal.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import jetbrains.jetpad.mapper.gwt.BaseWithElement;



public class SomeView extends BaseWithElement{
    private static final SomeViewUiInterface UI_BINDER = GWT.create(SomeViewUiInterface.class);

    public SomeView() {
        setElement(UI_BINDER.createAndBindUi(this));
    }

    @UiField
    public Element text;

    @UiField
    public InputElement flag;

    @UiField
    public  Element flagDescription;

    interface SomeViewUiInterface extends UiBinder<Element, SomeView> {}
}


