package Framework.Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FakerGeneration {

    private Faker faker;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String university;
    private String profile;
    private String gender;
    private String age;

    public FakerGeneration(WebDriver driver){
        faker = new Faker(new Locale("pt-BR"));
    }

    public String getFirstName() {
        firstName = faker.name().firstName();
        return firstName;
    }

    public String getLastName() {
        lastName = faker.name().lastName();
        return lastName;
    }

    public String getEmail() {
        email = faker.internet().emailAddress();
        return email;
    }

    public String getAddress() {
        address = faker.address().streetAddress();
        return address;
    }

    public String getUniversity() {
        university = faker.university().name();
        return university;
    }

    public String getProfile() {
        profile = faker.job().title();
        return profile;
    }

    public String getGender() {
        gender = faker.demographic().sex();
        return gender;
    }

    public String getAge() {
        age = faker.number().digit();
        return age;
    }
}
