import net.datafaker.Faker;
import net.datafaker.providers.base.Options;
import java.util.Locale;

// https://www.datafaker.net/documentation/getting-started/

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class DataFakerUsage {
    private static final Faker faker = new Faker();
    private static final Options opt = faker.options();

    public static void main(String[] args) {

        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String streetAddress = faker.address().streetAddress();

        System.out.println("Full Name: " + name);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);

        Day randomDay = opt.option(Day.class);
        System.out.println("Random Day: " + randomDay);


        Faker faker2 = new Faker(new Locale("ar"));
        Faker faker3= new Faker(new Locale.Builder().setLanguage("ar").setRegion("EG").build());
        Faker faker4= new Faker(new Locale.Builder().setLanguage("tr").setRegion("TR").build());


        String fname = faker2.name().fullName();
        System.out.println("Full Name in Arabic: " + fname);

        String isim = faker4.name().fullName();
        System.out.println("Full Name in Turkish: " + isim);

    }
}
