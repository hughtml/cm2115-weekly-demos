package uk.ac.rgu.topic6;

public class AntiqueChair implements Chair {
    
    String type;

    public AntiqueChair() {
        this.type = "Antique Chair";
    }

    @Override
    public String getType() {
        return this.type;
    }

}
