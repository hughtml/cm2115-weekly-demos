package uk.ac.rgu.topic5;

/**
 * Class to model a Laptop, as a way of demonstrating inner classes
 * The demo in class showed the creation of the LaptopScreen inner class
 * which is private; this code expands on this by adding a LaptopBattery inner class,
 * which is public and static - see each class for an explanation as to why
 */
public class Laptop {

    /* Two fields representing the screen and the battery */
    private LaptopScreen screen;
    private LaptopBattery battery;
    
    /* A field representing the operating system, whose type is the OperatingSystem enum */
    private final OperatingSystem os;

    /**
     * The constructor accepts a screen size and screen resolution and creates a corresponding LaptopScreen object
     * The battery object is passed directly because this is something that can be defined outside the Laptop class
     * We also accept an OperatingSystem enum
     */
    public Laptop(int screenSize, String screenResolution, LaptopBattery battery, OperatingSystem os){
        this.screen = new LaptopScreen(screenSize, screenResolution);
        this.battery = battery;
        this.os = os;
    }

    /**
     * Getter for the battery - any other class can get the current battery in this laptop
     * @return
     */
    public LaptopBattery getBattery(){
        return this.battery;
    }

    /**
     * Setter for the battery - even though a laptop battery is intrinsically linked to the concept of a "laptop",
     * it's something that can be changed (i.e., you can take a battery out and replace it with another one)
     * @param battery
     */
    public void setBattery(LaptopBattery battery){
        this.battery = battery;
    }

    /**
     * Getter for the operating system
     * @return
     */
    public OperatingSystem getOS(){
        return this.os;
    }

    /**
     * The LaptopScreen inner class is private, so there's no direct access to it from outside
     * However, knowing the screen size and resolution is still important
     * We therefore define a getter method that returns the size from the screen object
     * @return
     */
    public int getScreenSize(){
        return screen.getSize();
    }

    /**
     * Same as above but for resolution
     * @return
     */
    public String getScreenResolution(){
        return screen.getResolution();
    }

    /**
     * Including this method to demonstrate how private inner classes can't be seen outside the outer class
     * See the App class (in this package) for more details
     * @return
     */
    public LaptopScreen getScreen(){
        return this.screen;
    }
    
    /**
     * Private class representing a laptop screen
     * A screen is a core part of a laptop, and it doesn't make sense to be able to create or interact with one
     * independently of a laptop - so we make the class private. This means it can only be seen by the Laptop class, and
     * as a consequence cannot be instantiated or otherwise referenced outside Laptop
     */
    private class LaptopScreen{

        private int size;
        public int getSize() {
            return size;
        }

        private String resolution;

        public String getResolution() {
            return resolution;
        }

        public LaptopScreen(int size, String resolution){
            this.size = size;
            this.resolution = resolution;            
        }
    }

    /**
     * The LaptopBattery class is declared as public and static because, conceptually, a laptop battery can exist
     * independently of a laptop. However, it remains an inner class because it's still intrinsically connected to a laptop
     * (i.e., no other classes will need to use it)
     */
    public static class LaptopBattery{
        private int capacity;
        private String type;

        public LaptopBattery(int capacity, String type){
            this.capacity = capacity;
            this.type = type;
        }

        @Override
        public String toString(){
            return this.capacity + "mAH " + type + " battery";
        }
    }
    
}
