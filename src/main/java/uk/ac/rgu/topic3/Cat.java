package uk.ac.rgu.topic3;

/**
 * The extends keyword shows that Cat inherits from (extends) Animal
 */
public class Cat extends Animal {

    /**
     * 
     * @param name
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * The @Override tag tells the compiler that this method overrides one of the same name in the base class
     * This is used even when the method in the base class is abstract
     * While not essential, it is good practice:
     *  1) It ensures you are indeed overriding a method from the base class (try changing the name or return type here and see what happens)
     *  2) It's good for documentation -- someone coming along and looking at your code will see that this method overrides one in a super class
     */
    @Override
    public String makeSound() {
        return this.name + ": Meow"; //the name field here comes from the Animal class
    }

    /**
     * Sub-classes can also have their own methods - but see the App class for some caveats here
     */
    public void useLitterTray(){
        System.out.println(this.name + " is using the litter tray");
    }
}
