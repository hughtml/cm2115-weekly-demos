package uk.ac.rgu.topic4;

/**
 * An Eagle is an example of a bird that can fly, and is considered a predator
 * This means is extends the Bird abstract class (i.e. it is a concrete type of a general concept),
 * and implements both the CanFly and IsPredator interfaces
 * 
 * This means an Eagle can be seen as type CanFly (and so be grouped with other "flying things")
 * and type IsPredator (and so can be grouped with other "predators")
 */
public class Eagle extends Bird implements CanFly, IsPredator {

    /**
     * We need a constructor that passes a String up to the Bird constructor, which in turn 
     * passes it up to the Animal constructor
     * @param name
     */
    public Eagle(String name) {
        super(name);
    }

    /**
     * The makeSound() method is abstract in Animal and not implemented in Bird, so we need to
     * implement it here
     */
    @Override
    public String makeSound() {
        return "Eagle cry";
        
    }

    /**
     * Implementation of the eat() method required by the IsPredator interface
     * 
     * This method is necessary for Eagle to be a valid implementation of IsPredator - 
     * IsPredator provides a contract that all "predators" must adhere to. That contract requires
     * an implementation of eat()
     */
    @Override
    public void eat() {
        System.out.println("I'm eating");
    }

    /**
     * Same here, but the fly() method is required by the CanFly interface
     * 
     * Again - it's a contract that all "flying things" must adhere to
     */
    @Override
    public void fly() {
        System.out.println("Eagle is flying");       
    }
}
