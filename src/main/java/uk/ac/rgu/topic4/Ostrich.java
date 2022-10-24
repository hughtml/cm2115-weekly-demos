package uk.ac.rgu.topic4;
/**
 * An Ostrich is a bird that cannot fly - so it only extends the Bird abstract class, and doesn't implement
 * the CanFly interface. 
 * 
 * This illustrates why our Bird class doesn't directly implement CanFly, but instead it is left to specific
 * types of Bird
 */
public class Ostrich extends Bird {

    /**
     * Same principle as the other classes - the Bird class, then the Animal class, are expecting a String passed
     * to their constructors
     * @param name
     */
    public Ostrich(String name) {
        super(name);
    }

    /**
     * Implementation of the abstract makeSound() method in the Animal class
     */
    @Override
    public String makeSound() {
        return "Ostrich sound";
    }
    
}
