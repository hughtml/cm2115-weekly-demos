package uk.ac.rgu.topic4;

/**
 * A Plane is an example of something that can fly...but conceptually isn't all that similar to birds or 
 * Pegasuses (Pegasi?). 
 * 
 * This illustrates how interfaces differ from (abstract) classes. Rather than trying to encapsulate a concept,
 * they describe some kind of functionality without any regard for what it actually means, or how it's actually
 * achieved.
 */
public class Plane implements CanFly{

    /**
     * Required implementation of the fly() method from the CanFly interface
     */
    @Override
    public void fly() {
        System.out.println("The plane is flying"); 
    }

    /**
     * Implementation of the default getFlyingDistance() method from the CanFly interface.
     * This isn't required for the class to compile (try commenting the method out), but this
     * provides a concrete implementation relevant to the Plane
     */
    @Override
    public int getFlyingDistance(){
        return 10;
    }
    
}
