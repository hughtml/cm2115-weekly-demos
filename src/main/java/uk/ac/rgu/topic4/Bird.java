package uk.ac.rgu.topic4;

/**
 * A Bird extends an Animal - but doesn't implement CanFly, because not all birds can fly
 */
public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    /**
     * All birds can peck, so we can encapsulate this functionality in a final method
     */
    public final void peck(){
        System.out.println(this.name + " is pecking");
    }
}