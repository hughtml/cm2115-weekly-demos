package uk.ac.rgu.topic4;

/**
 * Pegasus is an example of an animal (albeit mythical) that breaks standard inheritance hierarchies
 * 
 * It's a horse that can fly - but it's not a bird. So it can extend the Horse class, and implement the
 * CanFly method which allows this "functionality" to be modelled
 */
public class Pegasus extends Horse implements CanFly{

    /**
     * Same again - the Horse class, then the Animal class, expect a String parameter - so we give it here
     * and propagate using super()
     * @param name
     */
    public Pegasus(String name) {
        super(name);
    }

    /**
     * Implementation of the fly() method required by the CanFly interface
     */
    @Override
    public void fly() {
        System.out.println("Pegasus is flying"); 
    }
}
