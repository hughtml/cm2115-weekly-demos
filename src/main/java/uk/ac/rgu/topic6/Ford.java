package uk.ac.rgu.topic6;

public class Ford implements Car {
    
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }

    public void fordMethod() {
        System.out.println("This method is specific to Ford");
    }

}
