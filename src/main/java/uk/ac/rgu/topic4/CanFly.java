package uk.ac.rgu.topic4;

/**
 * An interface that describes the functionality for "things that can fly"
 */
public interface CanFly {
    
    /**
     * The fly() method is provided as a signature only (i.e., no body) because it needs to be implemented
     * by any classes that implement this interface. 
     */
    public void fly();

    /**
     * The getFlyingDistance() method is defined as default which means that classes implementing this interface
     * don't need to provide their own implementation - but can do if required. The main use of default methods
     * is when adding a new method to an interface. It stops existing implementing classes (of which there may be many)
     * from breaking. But in general it should be seen as a stopgap - if you're updating an interface, chances are
     * you want to consider updating your codebase in the near future :)
     * @return
     */
    default int getFlyingDistance(){
        return -1;
    }
}
