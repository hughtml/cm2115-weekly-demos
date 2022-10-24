package uk.ac.rgu.topic3;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Neigh";
    }
    
}
