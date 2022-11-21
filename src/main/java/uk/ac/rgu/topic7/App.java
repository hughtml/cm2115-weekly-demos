package uk.ac.rgu.topic7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Main app for Week 10/Topic 7
 */
public class App {
    
    public static void main(String[] args) {

        Person person1 = new Person("Halliwell", "Prue", 30);
        Person person2 = new Person("Halliwell", "Piper", 28);
        Person person3 = new Person("Halliwell", "Phoebe", 25);
        Person person4 = new Person("Matthews", "Paige", 24);

        List<String> powers1 = new ArrayList<>();
        powers1.add("Telekinesis");
        powers1.add("Astral Projection");
        List<String> powers2 = new ArrayList<>();
        powers2.add("Molecular Immobilisation");
        powers2.add("Molecular Acceleration");
        List<String> powers3 = new ArrayList<>();
        powers3.add("Premonition");
        powers3.add("Levitation");
        List<String> powers4 = new ArrayList<>();
        powers4.add("Orbing");
        powers4.add("Telekinetic Orbing");

        Map<Person, List<String>> people = new HashMap<>();
        people.put(person1, powers1);
        people.put(person2, powers2);
        people.put(person3, powers3);
        people.put(person4, powers4);

        for (Person person : people.keySet()) {
            List<String> powers = people.get(person);
            System.out.print(person.getFirstname() + " " + person.getSurname() + ": ");
            for (String power : powers) {
                System.out.print(power + ", ");
            }
            System.out.println();
        }

        List<Person> charmedOnes = new ArrayList<>();
        charmedOnes.add(person1);
        charmedOnes.add(person2);
        charmedOnes.add(person3);
        charmedOnes.add(person4);

        printCol(charmedOnes);

        Collections.sort(charmedOnes);
        printCol(charmedOnes);

        charmedOnes.sort(new Person.PersonComparator());
        printCol(charmedOnes);

        charmedOnes.forEach(System.out::println);
        charmedOnes.forEach((person) -> System.out.println(person.getFirstname() + " " + person.getSurname() + ", " + person.getAge()));
        List<Person> filteredCharmedOnes = charmedOnes.stream().filter((person) -> person.getAge() < 30).collect(Collectors.toList());
        filteredCharmedOnes.forEach((person) -> System.out.println(person.getFirstname() + " " + person.getSurname() + ", " + person.getAge()));

    }

    public static void printCol(List<Person> loopCollection) {
        for (Person person : loopCollection) {
            System.out.println(person.getFirstname() + " " + person.getSurname() + ", " + person.getAge());
        }
    }

}
