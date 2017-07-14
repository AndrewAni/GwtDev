package foo.bar.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.RootPanel;
import foo.bar.client.requestfactory.ClientRequestFactory;

public class ClientEntryPoint implements EntryPoint {
    private static final ClientRequestFactory REQUEST_FACTORY = createClientRequestFactory();

    private static ClientRequestFactory createClientRequestFactory() {
        ClientRequestFactory requestFactory = GWT.create(ClientRequestFactory.class);
        requestFactory.initialize(new SimpleEventBus());
        return requestFactory;
    }

    public void onModuleLoad() {
        RootPanel container = RootPanel.get();
        container.add(new ClientView().getView());
    }

    public static ClientRequestFactory getRequestFactory() {
        return REQUEST_FACTORY;
    }
}
