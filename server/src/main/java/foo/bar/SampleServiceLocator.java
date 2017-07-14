package foo.bar;

import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;
import com.google.web.bindery.requestfactory.shared.ServiceLocator;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SampleServiceLocator implements ServiceLocator {

    @Override
    public Object getInstance(Class<?> clazz) {
        WebApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(
                RequestFactoryServlet.getThreadLocalServletContext());
        return applicationContext.getBean(clazz);
    }
}
