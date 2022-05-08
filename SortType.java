import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortType {


    public static List<Person> Sort_Using_Lambda(){
        return Person.people.stream().sorted((p1,p2)->Person.compare(p1,p2)).collect(Collectors.toList());
    }

    public static List<Person> Sort_Using_Method_Reference(){
        return Person.people.stream().sorted((Person::compare)).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Person> sortedPeople = Sort_Using_Lambda();
        sortedPeople.forEach(System.out::println);
        System.out.println("-------------------------------------------");
        sortedPeople=Sort_Using_Method_Reference();
        sortedPeople.forEach(System.out::println);
    }


}
