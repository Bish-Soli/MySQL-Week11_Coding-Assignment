import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstname;



    public Person(String name)
    {
        this.firstname = name;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return firstname + " Person";

    }

    public static int compare(Person p1,Person p2){
        return p1.firstname.compareTo(p2.firstname);
    }



    static List<Person> people = new ArrayList<Person>(List.of( new Person("Bishoy"),
            new Person("Rubio"),
            new Person("Kieth"),
            new Person("Nick")));

    public static List<Person> getPeople() {
        return people;
    }



}
