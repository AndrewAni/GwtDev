package foo.bar;

import java.util.UUID;

public class SampleServiceImpl implements SampleService {
    @Override
    public String getString() {
        return UUID.randomUUID().toString();
    }
}
