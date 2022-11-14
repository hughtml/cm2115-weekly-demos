package uk.ac.rgu.topic6;

public class Ferrari implements Car {
    
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }

    public void ferrariMethod() {
        System.out.println("This method is specific to Ferrari");
    }

}
