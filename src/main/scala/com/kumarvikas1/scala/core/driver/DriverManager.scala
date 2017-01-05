package com.kumarvikas1.scala.core.driver

import com.google.common.base.Joiner
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
  * Created by vikakumar on 12/4/16.
  */
object DriverManager {
  val chrome_path = Joiner.on("/").join(System.getProperty("user.dir"), "src/main/resources/chrome/chromedriver");
  var registry = new ThreadLocal[WebDriver];

  def get(): WebDriver = {
    def toOption(value: WebDriver): Option[WebDriver] = Option(value);
    return toOption(registry.get()).orElse(create()).get;
  }

  def create(): Option[WebDriver] = {
    System.setProperty("webdriver.chrome.driver", chrome_path);
    val driver = new ChromeDriver();
    registry.set(driver);
    return Some(driver);
  }


  def remove(): Unit = {
    registry.get().quit();
    registry.remove();
  }

}
