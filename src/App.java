import com.example.builderpattern.PersonBuilder;
import com.example.builderpattern.PersonConcreteBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        PersonBuilder personBuilder1 = new PersonConcreteBuilder()
                .withFirstName("Hai")
                .withLastName("Pham");
        System.out.println(personBuilder1.build());
        System.out.println();

        PersonBuilder personBuilder2 = new PersonConcreteBuilder()
                .withFirstName("Hai")
                .withLastName("Pham")
                .withAge(21)
                .withAddress("Hanoi")
                .withPhone("0123456789");
        System.out.println(personBuilder2.build());
    }
}
