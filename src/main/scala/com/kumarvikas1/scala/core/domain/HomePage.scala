package com.kumarvikas1.scala.core.domain

import com.kumarvikas1.scala.CoreLocators._
import com.kumarvikas1.scala.core.driver.DriverManager
import org.openqa.selenium.By

/**
  * Created by vikakumar on 12/5/16.
  */
class HomePage {
  val search: By = By.id("qf-0q-destination");

  def is_shown: Boolean = {
    return search.isDisplayed
  }

  def open: HomePage = {
    DriverManager.get().get("http://uk.hotels.com")
    return this;
  }
}
