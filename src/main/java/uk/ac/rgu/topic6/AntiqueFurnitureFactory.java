package uk.ac.rgu.topic6;

public class AntiqueFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new AntiqueChair();
    }

    @Override
    public Table getTable() {
        return new AntiqueTable();
    }
    
    
    
}
