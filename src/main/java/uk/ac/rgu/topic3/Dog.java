package uk.ac.rgu.topic3;

/**
 * See the Cat class for comments describing how inheritance works
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return this.name + ": woof";
    }
    
}
