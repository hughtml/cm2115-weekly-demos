package uk.ac.rgu.topic4.functionalinterfaces;

public class App {
    
    public static void main(String[] args){

        String inputString = "THIS IS A STRING";

        /* An example using a full class implementation - see the RandomFormatter class */
        StringFormatter random = new RandomFormatter();
        String randomResult = random.format(inputString);
        System.out.println(randomResult);

        /* An example using a Lambda expression.
         * 
         * A Lambda Expression effectively creates a hidden class that implements the interface (in this case, StringFormatter)
         * then uses the provided expression as the implementation of the method (in this case, format(String input);)
         * That is, the statement below this comment effectively produces:
         * 
         * class StringFormatterImplementation implements StringFormatter{
         *      public String format(String input){
         *          return "The bespoke string is: " + input;
         *      }
         * }
         * 
         * and then implicitly does:
         * 
         * StringFormatter bespoke = new StringFormatterImplementation();
         * 
         * Which means we ned up with an object of type StringFormatter, with an implemented format(String input) method
         * 
         * However, this class never exists as a usable concept - this is just to illustrate what this expression
         * is the equivalent of.
         * 
         * Lambda Expressions also have the same scope as any other variable - so the ones below can only be
         * used inside this main() method. But you can have them as fields in a class, meaning they're accessible
         * elsewhere after being defined.
         */
        StringFormatter bespoke = (input) -> {
            return "From Lambda Expression: " + input;
        };

        String bespokeResult = bespoke.format(inputString);
        System.out.println(bespokeResult);

        /* When your Lambda expression contains only a return statement, the same can be achieved on a single line
         * without curly braces or a return statement. Functionally, this is the same as the expression above,
         * and the same explanation as to how it works still applies.
         */

        StringFormatter bespoke2 = (input) -> "From single line Lambda Expression " + input;
        String bespoke2Result = bespoke2.format(inputString);
        System.out.println(bespoke2Result);

        /**
         * Another way of implementing Functional Interfaces is through method references.
         * 
         * A method reference makes use of an existing method to provide the implementation of the
         * required method in the Functional Interface. As with Lambda expressions, this effectively produces a hidden class.
         * For instance, the statement below this comment is equivalent to:
         * 
         * class StringFormatterImplementation implements StringFormatter{
         *      public String format(String input){
         *          return "From fancyFormat method in the App class: " + input;
         *      }
         * }
         * 
         * and then implicitly does:
         * 
         * StringFormatter fancy = new StringFormatterImplementation();
         * 
         * Which again means we end up with an object of type StringFormatter, upon which we can call the .format(String input)
         * method.
         * 
         * Method references can either be static methods in a class (so accessed directly via the class name) or
         * instance methods, accessed through an object. Both ways are shown below.
         */

         StringFormatter fancy = App::fancyFormat; // :: is the syntax for method references
         String fancyResult = fancy.format(inputString);
         System.out.println(fancyResult);
         
         App instance = new App();

         StringFormatter plain = instance::plainFormat;
         String plainResult = plain.format(inputString);
         System.out.println(plainResult);

    }

    public static String fancyFormat(String input){
        return "From fancyFormat method in the App class: " + input;
    }

    public String plainFormat(String input){
        return "From plainFormat method in an instance of the App class: " + input;
    }


}
