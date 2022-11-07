package uk.ac.rgu.topic5;

public class AppCommand implements Command {
    
    //---------- FIELDS ----------

    private App instance;

    //---------- METHODS ----------

    public AppCommand(App instance) {
        this.instance = instance;
    }

    public void execute() {
        instance.doSomething();
    }

}
