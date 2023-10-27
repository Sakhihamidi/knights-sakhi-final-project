package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CreateAccount;
import utility.SeleniumUtility;

import java.util.Random;

public class GeneralSteps {
    public static String email;
    // Rando email
    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String domain = "tekschool.us";
        int usernameLength = 10;

        StringBuilder randomEmail = new StringBuilder();

        Random random = new Random();

        // Generate the username part
        for (int i = 0; i < usernameLength; i++) {
            int index = random.nextInt(allowedChars.length());
            randomEmail.append(allowedChars.charAt(index));
        }

        // Append the domain
        randomEmail.append("@").append(domain);
        email = randomEmail.toString();
        return email;

    }

    }





