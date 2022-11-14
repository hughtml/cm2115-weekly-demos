package uk.ac.rgu.topic6;

public class ModernChair implements Chair {
    
    String type;

    public ModernChair() {
        this.type = "Modern Chair";
    }

    @Override
    public String getType() {
        return this.type;
    }

}
