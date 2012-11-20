package sandbox;

import sandbox.AbstractMan;

public class HelloMan extends AbstractMan {

    public HelloMan() {
    }

    @Override
    public String say() {
        return "Hello!";
    }
}
