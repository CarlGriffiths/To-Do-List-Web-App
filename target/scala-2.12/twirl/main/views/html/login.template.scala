
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[Login], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*3.1*/("""


"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("home", user)/*8.20*/ {_display_(Seq[Any](format.raw/*8.22*/("""

         
        """),format.raw/*11.9*/("""<div class="row">
                <div class="col-12 center-block">
                    <center>
                            """),_display_(/*14.30*/if(flash.containsKey("emailError"))/*14.65*/ {_display_(Seq[Any](format.raw/*14.67*/("""
                                """),format.raw/*15.33*/("""<div class="alert alert-warning">
                                  """),_display_(/*16.36*/flash/*16.41*/.get("emailError")),format.raw/*16.59*/(""";
                                </div>
                              """)))}),format.raw/*18.32*/("""
                            """),format.raw/*19.29*/("""<br>
                            <h2>Login or <a href=""""),_display_(/*20.52*/routes/*20.58*/.HomeController.register),format.raw/*20.82*/("""">Register</a></h2> 
                            """),_display_(/*21.30*/form(action=routes.HomeController.submitLogin(), 'class -> "form-hotizontal", 'role -> "form")/*21.124*/ {_display_(Seq[Any](format.raw/*21.126*/("""
                                """),_display_(/*22.34*/CSRF/*22.38*/.formField),format.raw/*22.48*/("""
                                """),format.raw/*23.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                <div class="form-group">
                               
                                """),_display_(/*26.34*/inputText(userForm("email"),'_label -> "email", 'size -> 40, 'placeholder -> "email")),format.raw/*26.119*/("""
                                """),_display_(/*27.34*/inputPassword(userForm("pass"),'_label -> "password", 'size -> 40, 'placeholder -> "password")),format.raw/*27.128*/("""

                    
                                """),format.raw/*30.33*/("""<input type="submit" value="Login" class="btn btn-secondary">

                            """)))}),format.raw/*32.30*/("""
                    
   
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(userForm:Form[Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[Login],User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Sep 19 17:33:41 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/login.scala.html
                  HASH: d469a047bff1bc0cb812c919866a4eeb5c8f8c5b
                  MATRIX: 958->2|1066->42|1110->38|1139->58|1166->60|1192->78|1231->80|1278->100|1431->226|1475->261|1515->263|1576->296|1672->365|1686->370|1725->388|1828->460|1885->489|1968->545|1983->551|2028->575|2105->625|2209->719|2250->721|2311->755|2324->759|2355->769|2416->802|2630->989|2737->1074|2798->1108|2914->1202|2997->1257|3120->1349|3177->1376
                  LINES: 28->2|31->6|34->3|37->7|38->8|38->8|38->8|41->11|44->14|44->14|44->14|45->15|46->16|46->16|46->16|48->18|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|56->26|56->26|57->27|57->27|60->30|62->32|65->35
                  -- GENERATED --
              */
          