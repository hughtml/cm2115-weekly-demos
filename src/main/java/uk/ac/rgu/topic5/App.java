package uk.ac.rgu.topic5;

import java.util.jar.Manifest;

import uk.ac.rgu.topic5.Laptop.LaptopBattery;


public class App {

    
    //----- Lab -----

    private Logger logger;
    private static Command[] commands = new Command[10];
    private String[] words = {"These", "are", "some", "defined", "words"};

    public void printWords (PrintStrategy printing) {
        printing.print(words);
    }   

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        // if (this.logger != null) {
        //     logger.log("I'm doing something!");
        // }
        System.out.println("Doing something!");
    }

    public static void main(String[] args){

        // App app = new App();
        // VerboseLogger vLogger = VerboseLogger.getInstance();
        // app.setLogger(vLogger);
        // app.doSomething();

        // App app2 = new App();
        // VerboseLogger vLogger2 = VerboseLogger.getInstance();
        // app2.setLogger(vLogger2);
        // app2.doSomething();

        App app = new App();
        Computer computer = new Computer();
        Command doSomethingCommand = new AppCommand(app);
        commands[0] = doSomethingCommand;
        commands[1] = computer::turnOn;

        for (Command command : commands) {
            command.execute();
        }

        ForwardsPrintStrategy printForwards = new ForwardsPrintStrategy();
        PrintStrategy printBackwards = (values) -> {
            for (int i = values.length; i > 0; i--) {
                System.out.println(values[i]);
            }
        };
        


        /* The LaptopBattery inner class is public and static in Laptop - so we can create an instance directly */
        LaptopBattery battery = new LaptopBattery(2000, "Li-ion");

        /* Creating a new laptop object */
        Laptop laptop = new Laptop(15, "2560x1440", battery, OperatingSystem.MACOS);

        /* The method below tries to use the getLaptopScreen() method in Laptop
         * While we can call the method, we can't do anything with the object it returns
         * because LaptopScreen isn't visible outside of Laptop
         */
        //LaptopScreen test1 = laptop.getScreen(); // this doesn't work - uncomment the start of the line to see
        var test2 = laptop.getScreen(); // this does work - we'll cover "var" later
        //int size = test2.getSize(); // even though we've found a way to get the LaptopScreen object, this doesn't work, because the methods are also not visible

        OperatingSystem os = laptop.getOS();
        System.out.println(os.toString() + " " + os.getVersion());

        /* Now if we update the version field for MACOS... */
        OperatingSystem.MACOS.setVersion(13);
        System.out.println(os.toString() + " " + os.getVersion()); // this will now be 13

        /* But the version fields for the other enum values will be their default values */
        System.out.println(OperatingSystem.WINDOWS.getVersion()); // 11
        System.out.println(OperatingSystem.UBUNTU.getVersion()); // 20

    }


}
