package foo.bar.client.requestfactory;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;
import foo.bar.SampleService;
import foo.bar.SampleServiceLocator;

@Service(value = SampleService.class, locator = SampleServiceLocator.class)
public interface SampleServiceRequestContext extends RequestContext {
    Request<String> getString();
}
