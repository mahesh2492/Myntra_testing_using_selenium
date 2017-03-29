package Selenium

import java.util.concurrent.TimeUnit
import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.scalatest.FlatSpec
import org.openqa.selenium.support.ui.Select

class CreateCustomTest extends FlatSpec with TestSetUp {

  "A user" should "visit on myntra.com" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)
    val title = driver.getTitle()
    val page_source = driver.getPageSource().length
    if (driver.getCurrentUrl == BASE_URL) {
      println("WELCOME TO Myntra.com with title : " + title)
      println("the lenght of the pagesource is: " + page_source)
    } else {
      println("something went wrong")
    }
  }



  "user" should "fail to login with invalid credentials" in {

    driver.manage().window().maximize()
    driver.get(BASE_URL)

    val dropDown = driver.findElementByCssSelector("div.desktop-user")
    val mouseHover = new Actions(driver)
    mouseHover.moveToElement(dropDown)
    mouseHover.build().perform()

    driver.findElementByCssSelector("div.desktop-getUserInLinks.desktop-getInLinks a:nth-child(2)").click()

    driver.findElementByCssSelector("input.login-user-input-email.login-user-input").sendKeys("a123@gmail.com")

    driver.findElementByCssSelector("input.login-user-input-password.login-user-input").sendKeys("123456")

    driver.findElementByCssSelector("button.login-login-button").click()
  }

  "user" should "logged in " in {

    val dropDown = driver.findElementByCssSelector("div.desktop-user")
    val mouseHover = new Actions(driver)
    mouseHover.moveToElement(dropDown)
    mouseHover.build().perform()

    driver.findElementByCssSelector("div.desktop-getUserInLinks.desktop-getInLinks a:nth-child(2)").click()

    driver.findElementByCssSelector("input.login-user-input-email.login-user-input").sendKeys(EMAIl)

    driver.findElementByCssSelector("input.login-user-input-password.login-user-input").sendKeys(password)

    driver.findElementByCssSelector("button.login-login-button").click()
  }

  "user" should "select a Casual Shoes category" in {

    webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.navi-base  a.navi-link.navi-pad ")))

    driver.findElementByCssSelector("li.navi-base  a.navi-link.navi-pad ").click()
  }



}