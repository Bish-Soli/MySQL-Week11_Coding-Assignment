import java.util.List;
import java.util.stream.Collectors;

public class Streaming {

    public static void main(String[] args) {
        String s = Person.getPeople().stream().map(Person::getFirstname).
                sorted().collect(Collectors.joining(", "));

        System.out.println(s);
    }
}
