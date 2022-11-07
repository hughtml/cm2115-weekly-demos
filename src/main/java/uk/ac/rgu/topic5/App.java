package uk.ac.rgu.topic5;

import uk.ac.rgu.topic5.Laptop.LaptopBattery;


public class App {
    
    //----- Lab -----

    private Logger logger;
            
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        if (this.logger != null) {
            logger.log("I'm doing something!");
        }
    }

    public static void main(String[] args){

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
