package uk.ac.rgu.topic6;

public class AntiqueTable implements Table {
    
    String type;

    public AntiqueTable() {
        this.type = "Antique Table";
    }

    @Override
    public String getType() {
        return this.type;
    }

}
