package uk.ac.rgu.topic6;

public class CarServiceVisitor implements CarVisitor {

    @Override
    public void visit(Ford car) {
        car.fordMethod();
    }

    @Override
    public void visit(Ferrari car) {
        car.ferrariMethod();
    }
    

    
}
