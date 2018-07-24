package com.robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Main {

    public static void main(String... args) {

        System.setProperty("webdriver.gecko.driver", "/Users/ivofreitas/Projects/JavaWorkspace/myrobot/src/main/resources/geckodriver");

        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile ffprofile = profile.getProfile("ROBOT");

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(ffprofile);

        WebDriver driver = new FirefoxDriver(options);

        driver.navigate().to("https://www.google.com");

    }
}
