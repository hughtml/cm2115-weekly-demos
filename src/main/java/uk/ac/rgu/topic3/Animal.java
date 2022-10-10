package uk.ac.rgu.topic3;

/**
 * Declaring a class as 'abstract' means that it can't be instantiated, i.e.
 *      Animal animal = new Animal();
 * is invalid. Abstract classes are used when you want to encapsulate aspects
 * of a concept, but that concept can't/shouldn't exist on its own. 
 * So here, the 'Animal' class encapsulates features shared by all animals, but
 * can't exist in its own right because every animal has a more specific type (Cat, Dog etc.)
 */
public abstract class Animal {
    
    /* 
     * The 'protected' visibility modifier keeps the field mostly
     * private, but allows sub-classes to access it
     */
    protected String name;

    /**
     * Abstract classes can still have constructors, with sub-classes having the responsibility
     * to ensure the correct paramters etc. are passed
     * See the Cat and Dog classes for more information
     * @param name
     */
    public Animal(String name){
        this.name = name; // this sets the name field for all classes that extend Animal
    }

    /**
     * An abstract method doesn't have an implemntation, only a method signature.
     * These are only allowed in abstract classes, and are used as a way of guaranteeing that
     * sub-classes provide an implementation. 
     * Here, we know that all animals make a sound - but we need each class to tell us what that sound is
     * @return
     */
    public abstract String makeSound();



}
