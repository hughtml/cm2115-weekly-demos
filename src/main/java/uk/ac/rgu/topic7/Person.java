package uk.ac.rgu.topic7;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    
    //---------- FIELDS ----------

    private String surname, firstname;
    private int age;

    //---------- CONSTRUCTORS ----------

    public Person(String surname, String firstname, int age) {
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
    }

    //---------- METHODS ----------

    //--- GETTERS ---

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    //--- SETTERS ---

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //--- OTHER METHODS ---

    /**
     * Method to compare a Person's first name with another Person's first name
     * @param other The other Person
     * @return The result of the comparison
     */
    @Override
    public int compareTo(Person other) {
        if (this.getFirstname().compareTo(other.getFirstname()) == 1) {
            return 1;
        } else if (this.getFirstname().compareTo(other.getFirstname()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    //---------- INNER CLASSES ----------

    public static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            if (p1.getAge() > p2.getAge()) {
                return 1;
            } else if (p1.getAge() == p2.getAge()) {
                return 0;
            } else {
                return 1;
            }
        }

    }

}
