package uk.ac.rgu.topic6;

public class ModernTable implements Table {
    
    String type;

    public ModernTable() {
        this.type = "Modern Table";
    }

    @Override
    public String getType() {
        return this.type;
    }

}
