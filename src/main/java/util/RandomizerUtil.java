package util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.github.javafaker.Faker;

import constant.Constant;
import util.config.Config;

public class RandomizerUtil {
    static Faker userDataGenerate = new Faker(new Locale(Constant.LOCALE_RU));
    
    private RandomizerUtil() {
    }
    
    public static String getEmail() {
        return new Date().getTime() + "@hackathon.by";
    }
    
    public static String getPassword() {
        String password;
        do {
            password = RandomStringUtils.randomAlphabetic(8) + RandomStringUtils.randomAscii(2);
        } while (!RegexpCompare.matches(password, Config.getValue("password.regexp")));
        
        return password;
    }
    
    public static String getText(int length) {
        return RandomStringUtils.random(length, true, false);
    }
    
    public static int getInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        
        return new Random().nextInt((max - min) + 1) + min;
    }
    
    public static double getDouble(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        
        return Double.parseDouble(new DecimalFormat("#0.0000")
                .format(min + (max - min) * new Random().nextDouble()));
    }
    
    public static String getPhoneNumberSignUp() {
        String phoneNumber;
        do {
            phoneNumber = RandomStringUtils.randomNumeric(10);
        } while (!RegexpCompare.matches(phoneNumber, Config.getValue("phoneNumberSignUp.regexp")));
        
        return phoneNumber;
    }
    
    public static String getDateForAPI(int minYear, int maxYear) {
        return new SimpleDateFormat("dd/MM/yyyy").format(userDataGenerate.date().birthday(minYear, maxYear));
    }
    
    public static String getFirstName() {
        return userDataGenerate.name().firstName();
    }
    
    public static String getLastName() {
        return userDataGenerate.name().lastName();
    }
    
    public static String getAddress() {
        return userDataGenerate.address().streetAddress();
    }
    
    public static String getCity() {
        return userDataGenerate.address().city();
    }
    
    public static String getCreditCardNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() <= 16) {
            stringBuilder.append(new Random().nextInt(9));
        }
        return stringBuilder.toString();
    }
}
