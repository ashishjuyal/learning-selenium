package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

  public static void main(String[] args) {

    WebDriver driver = chromeDriver();

    driver.get("http://google.com");

    // document.getElementsByName("q")[0]
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.click();
    // document.getElementsByName("q")[0].value = "Selenium Testing"
    searchBox.sendKeys("Selenium Testing");
    searchBox.sendKeys(Keys.ENTER);
  }

  public static WebDriver firefoxDriver() {
    WebDriverManager.firefoxdriver().setup();
    return new FirefoxDriver();
  }

  public static WebDriver chromeDriver() {
    ChromeOptions options = new ChromeOptions();
    options.setBinary("/usr/bin/brave-browser");

    WebDriverManager.chromedriver().setup();
    return new ChromeDriver(options);
  }

}
