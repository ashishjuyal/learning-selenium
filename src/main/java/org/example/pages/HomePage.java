package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

  WebDriver driver;

  @FindBy(id = "checkboxLink")
  WebElement checkboxLink;

  @FindBy(id = "radioLink")
  WebElement radioLink;

  @FindBy(id = "selectLink")
  WebElement selectLink;

  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void gotoHome() {
    driver.get("http://localhost:8082");
  }

  public void navigateToCheckboxPage() {
    checkboxLink.click();
  }

  public void navigateToRadioPage() {
    radioLink.click();
  }

}
