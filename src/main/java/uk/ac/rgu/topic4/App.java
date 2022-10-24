package uk.ac.rgu.topic4;

public class App {

    public static void main(String[] args) {

        /* If we create an Eagle directly, we have access to all its methods */
        Eagle eagle = new Eagle("Alice");
        eagle.fly(); // fly method, because it implements CanFly
        System.out.println(eagle.makeSound()); // makeSound method because it extends Bird, which extends Animal
        eagle.eat(); // eat method because it implements Predator
        eagle.peck(); // peck method because it extends Bird
        System.out.println(eagle.getFlyingDistance()); // getFlyingDistance method because it implements CanFly

        /*
         * But if we create an Eagle as type CanFly, we only see the fly() and
         * getFlyingDistance() methods
         */
        CanFly eagle2 = new Eagle("Bob");
        eagle2.fly();
        eagle2.getFlyingDistance();
        System.out.println(eagle.getFlyingDistance());

        /* If we create an Ostrich, we can group it with eagle, but not eagle2 */
        Bird[] birds = new Bird[2];
        birds[0] = new Ostrich("Stevie");
        birds[1] = eagle;
        //birds[1] = eagle2; //uncommenting this will be an error, because eagle2 is of type CanFly which knows nothing about Birds

        /*
         * We can pass the original Eagle object into a method that accepts type CanFly
         * But the method only sees it as type CanFly, not Eagle - so we again lose
         * access to any
         * methods not in the CanFly interface
         */
        acceptFlyingThings(eagle);

        /*
         * Eagles, Pegasuses and Planes can all fly - so can all be stored in the same
         * array
         * But - again - we lose access to class-specific methods. So we can't make
         * Jenny the Pegasus trot,
         * or Kenny the Eagle peck.
         */
        CanFly[] flyingThings = new CanFly[3];
        flyingThings[0] = new Eagle("Kenny");
        flyingThings[1] = new Pegasus("Jenny");
        flyingThings[2] = new Plane();

        for (int i = 0; i < flyingThings.length; i++) {
            flyingThings[i].fly();
            System.out.println(flyingThings[i].getFlyingDistance());
        }

    }

    public static void acceptFlyingThings(CanFly thing) {
        /*
         * The thing object is only CanFly - so we only see the fly() and
         * getFlyingDistance() methods
         */
        thing.fly();
        System.out.println(thing.getFlyingDistance());
    }

}
