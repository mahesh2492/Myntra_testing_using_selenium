package Selenium

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait


trait TestSetUp {

  val BASE_URL = "http://www.myntra.com/"
  val EMAIl = "mahesh.kndpl@gmail.com"
  val password = "myntra"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/application/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)



}