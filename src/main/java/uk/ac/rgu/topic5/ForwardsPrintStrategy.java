package uk.ac.rgu.topic5;

public class ForwardsPrintStrategy implements PrintStrategy {

    public void print(String[] values) {

        for (String value : values) {
            System.out.println(value);
        }

    }

}
