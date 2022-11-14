package uk.ac.rgu.topic6;

public class App {
    
    public static void main(String[] args) {
        
        // FurnitureFactory antiqueFactory = new AntiqueFurnitureFactory();
        // FurnitureFactory modernFactory = new ModernFurnitureFactory();

        // Chair newChair = antiqueFactory.getChair();
        // Table newTable = modernFactory.getTable();

        // System.out.println(newChair.getType());
        // System.out.println(newTable.getType());

        Car[] cars = {new Ford(), new Ferrari()};
        CarVisitor carVisitor = new CarServiceVisitor();

        for (Car car : cars) {
            car.accept(carVisitor);
        }

    }

}
