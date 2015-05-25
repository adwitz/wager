package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is awesome."))
  }
  
  def testPage = Action {
  	Ok(views.html.test("This is the test html page."))
  }

  def dynamic(id: Long) = Action {
    Ok(views.html.test("This is the number " + id + " test page."))
  }

}