package uk.ac.rgu.topic4.functionalinterfaces;

/**
 * A full class implementation of the StringFormatter interface
 */
public class RandomFormatter implements StringFormatter{

    @Override
    public String format(String input) {
        return "From RandomFormatter class: " + input;
    }
    
}
