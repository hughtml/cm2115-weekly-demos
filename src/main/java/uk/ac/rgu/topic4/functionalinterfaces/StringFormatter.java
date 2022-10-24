package uk.ac.rgu.topic4.functionalinterfaces;

/**
 * This is a Functional Interface - it has only one (non-default) method to be implemented by implementing classes
 * Being a functional interface, it can be implemented in different ways - this week looks at Lambda Expressions
 * and Method References
 */
public interface StringFormatter {
    public String format(String input);
}
