package sandbox;

public abstract class AbstractMan {

    private AbstractMan communicator;
    
    public abstract String say();
    
    public String communicate() {
        System.out.println(this.say());
        return communicator.say();
    }
}
