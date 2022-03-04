package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RadioPageTest {
  private WebDriver driver;

  @BeforeClass
  public static void init() {
    WebDriverManager.firefoxdriver().setup();
  }

  @Before
  public void setup() {
    driver = new FirefoxDriver();
    driver.get("http://localhost:8082");
    WebElement radioLink = driver.findElement(By.id("radioLink"));
    radioLink.click();
  }

  @After
  public void closeBrowser() {
    driver.quit();
  }

  @Test
  public void test_radio_button_blue() {
    List<WebElement> color = driver.findElements(By.name("color"));
    for(WebElement element: color) {
      if(element.getAttribute("value").equals("blue")) {
        element.click();
      }
    }
//    color.get(2).click();


//    assertEquals("blue", color.get(2).getAttribute("value"));
    assertTrue(color.get(2).isSelected());
  }
}
