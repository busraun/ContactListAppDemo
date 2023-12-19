package utilities;


import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataGenerator {

    private static final Faker faker = new Faker();

    public static String generateRandomFirstName() {
        return faker.name().firstName();
    }
    public static String generateRandomLastName() {
        return faker.name().lastName();
    }
    public static String generateRandomDate() {

        Date randomDate = faker.date().birthday();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(randomDate);
    }

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateRandomAddress() {
        return faker.address().fullAddress();
    }

    public static String generateRandomPhoneNumber(){
        return faker.phoneNumber().cellPhone();
    }
    public static String generateRandomStreetAdress1(){
        return faker.address().streetAddress();
    }

    public static String generateRandomStreetAdress2(){
        return faker.address().streetAddress();
    }

    public static String generateRandomCity(){
        return faker.address().city();
    }

    public static String generateRandomState(){
        return faker.address().state();
    }

    public static String generateRandomPostalCode(){
        return faker.address().zipCode();
    }
    public static String generateRandomCountry(){
        return faker.address().country();
    }
}
