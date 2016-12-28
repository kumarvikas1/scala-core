package com.kumarvikas1.scala.core.domain

import com.kumarvikas1.scala.core.driver.DriverManager
import org.openqa.selenium.By;

/**
  * Created by vikakumar on 12/5/16.
  */
class HomePage {

  def is_shown: Boolean = {
    return DriverManager.get().findElement(By.id("qf-0q-destination")).isDisplayed;
  }

  def open: HomePage = {
    DriverManager.get().get("http://uk.hotels.com")
    return this;
  }
}
