package uk.ac.rgu.topic3;

/**
 * This example demonstrates concepts behind inheritance, abstract classes, and polymorphism
 * Run the examples by having this class open when you click the Run button, or click Run
 * where it has "Run | Debug" above the main() method.
 * 
 * Suggested exercises to deepen your understanding:
 * 
 * 1) Create a class representing a new type of Animal. Create an instance of this and pass it to the 
 *      acceptAnimal() method. This will illustrate how polymorphism allows existing methods to accept
 *      previously unknown types of object.
 * 
 * 2) Add some extra (non-abstract) methods to Animal. Then experiment with overriding these methods in
 *      some sub-classes but not in others.
 * 
 * 3) Extend the inheritance hierarchy further downwards by extending the Cat and/or Dog class
 *      (e.g., a Lion is a type of Cat). Explore what happens if make Cat an abstract class, and
 *      delete the implementation of makeSound().
 */

public class App {
    
    public static void main(String[] args){

        Cat cat = new Cat("Felix");
        Dog dog = new Dog("Fido");

        /**
         * Polymorphism allows us to use a sub-class in place of a super class (i.e., the class that is extended)
         * So in this case, because the Cat and Dog classes both extend Animal, we can provide a Cat or Dog object
         * whenever an Animal is expected
         */
        acceptAnimal(cat);
        acceptAnimal(dog);

        /**
         * Polymorphism also allows us to assign variables declared as a super class (so in this case Animal) to
         * objects of a sub-type (so in this case, Cat or Dog). We can re-assign the variable to any of the sub-types.
         */
        Animal animal = new Cat("Garfield");
        animal = new Dog("Odie");

        /**
         * The main use of polymorphism in this way is to be able to store multiple related objects
         * in a single array
         */
         Animal[] animals = new Animal[2];
         animals[0] = new Cat("Crookshanks");
         animals[1] = new Dog("Gnasher");

         /* However, as also explained in the acceptAnimal() method below, we lose the ability to call
          * methods only defined in the sub-class, i.e.
                animals[0].useLitterTray()
            is not allowed, because we only know we have an animal; we don't know that it's a Cat
            We can only call methods declared in the Animal class
          */

          System.out.println(animals[0].makeSound());
          System.out.println(animals[1].makeSound());

    }

    public static void acceptAnimal(Animal animal){
        /*
         * No matter what type of animal we receive, we know it has a makeSound() method
         * However, we can't access methods that are only part of sub classes, beause we don't know exactly what
         * Animal we're getting - it could be a Cat, Dog, or someone we've not even seen yet
         */
        animal.makeSound();

    }

}
