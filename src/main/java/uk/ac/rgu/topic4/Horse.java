package uk.ac.rgu.topic4;

/**
 * Horst extends Animal - this is the same as Cats and Dogs in Topic3, so check the notes
 * there for more details
 */
public class Horse extends Animal{

    public Horse(String name){
        super(name);
    }

    /**
     * All horses trot - so this is a method available to all horses
     */
    public final void trot(){
        System.out.println(this.name + " is trotting");
    }

    @Override
    public String makeSound() {
        return "neigh";
    }
  
}
