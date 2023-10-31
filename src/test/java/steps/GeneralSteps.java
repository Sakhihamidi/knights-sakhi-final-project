package steps;

import base.BaseSetup;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CreateAccount;
import utility.SeleniumUtility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;

public class GeneralSteps {
    public static String email;

    public static String todayDate;
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

        public static String CreateTomorrowDate() {
            // Get the current date
            LocalDate today = LocalDate.now();

            // Calculate tomorrow's date
            LocalDate tomorrow = today.plusDays(1);

            // Define a date format (optional)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

            // Convert tomorrow's date to a string using the defined format
            String tomorrowAsString = tomorrow.format(formatter);
            // Print tomorrow's date as a string
            System.out.println();
            return tomorrowAsString;
        }

    public static String todayDate(){
        LocalDate currentDate = LocalDate.now();
        // Define a custom date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        // Format the current date as a string
        todayDate = currentDate.format(formatter).trim();
        return todayDate;
    }

    }





