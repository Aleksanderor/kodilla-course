package com.kodilla.testing2.google.faceBook;

import config.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class FaceBookTestingApp {

    public static final String XPATH_COOKIES_BUTTON = "//div[contains(@class, \"al64\")]/button[contains(@class,\"42ft _4jy0 _al65 _4jy3 _4jy1\" )]";
    public static final String XPATH_REGISTER_LINK = "//a[contains(@class,\"42ft _4jy0 _6lti _4jy6 _4jy2\" )]";
    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookiesButton = driver.findElement(By.xpath(XPATH_COOKIES_BUTTON));
        cookiesButton.click();

        WebElement registerLink = driver.findElement(By.xpath(XPATH_REGISTER_LINK));
        registerLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(XPATH_DAY_SELECT)));

        WebElement daySelectElement = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select daySelect = new Select(daySelectElement);
        daySelect.selectByIndex(11);

        WebElement monthSelectElement = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select monthSelect = new Select(monthSelectElement);
        monthSelect.selectByIndex(1);

        WebElement yearSelectElement = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select yearSelect = new Select(yearSelectElement);
        yearSelect.selectByValue("2021");
    }
}
