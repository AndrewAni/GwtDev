package foo.bar.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class ClientView {
    interface ClientViewUiBinder extends UiBinder<HTMLPanel, ClientView> {
    }

    private static ClientViewUiBinder uiBinder = GWT.create(ClientViewUiBinder.class);

    @UiField
    Label label;
    @UiField
    Button button;

    HTMLPanel getView() {
        return uiBinder.createAndBindUi(this);
    }

    @UiHandler("button")
    public void buttonClick(ClickEvent event) {
        ClientEntryPoint.getRequestFactory().sampleServiceRequestContext().getString().fire(new Receiver<String>() {
            @Override
            public void onSuccess(String response) {
                label.setText(response);
            }
        });
    }

}