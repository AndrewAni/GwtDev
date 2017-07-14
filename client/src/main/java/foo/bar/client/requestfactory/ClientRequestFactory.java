package foo.bar.client.requestfactory;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface ClientRequestFactory extends RequestFactory {
    SampleServiceRequestContext sampleServiceRequestContext();
}
