package uk.ac.rgu.topic6;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
    
}
