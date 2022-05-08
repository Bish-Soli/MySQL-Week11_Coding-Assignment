import java.util.NoSuchElementException;
import java.util.Optional;

public class optionalclass {
    public static void main(String[] args) {

        personMethodb();

    }
    public static Person personMethoda(Optional<Person> optionalperson){
        return optionalperson.stream().findAny().orElseThrow(()->
                new NoSuchElementException("Person isnot found"));
    }

    public static void personMethodb(){
        try{
            Person P = new Person("Bishoy");
            System.out.println(personMethoda(Optional.of(P)));
            personMethoda(Optional.empty());

        }catch (Exception e )
        {
            System.out.println(e.getMessage());
        }
    }
}
