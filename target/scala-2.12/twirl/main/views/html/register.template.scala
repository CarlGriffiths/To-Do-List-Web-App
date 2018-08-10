
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*3.1*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

            
        <title>title</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
         <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
    </head>
    <body></body>

         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                            """),_display_(/*27.30*/if(flash.containsKey("emailError"))/*27.65*/ {_display_(Seq[Any](format.raw/*27.67*/("""
                                """),format.raw/*28.33*/("""<div class="alert alert-warning">
                                  """),_display_(/*29.36*/flash/*29.41*/.get("emailError")),format.raw/*29.59*/(""";
                                </div>
                              """)))}),format.raw/*31.32*/("""
                            """),format.raw/*32.29*/("""<br>
                            """),_display_(/*33.30*/form(action=routes.HomeController.submitRegister(), 'class -> "form-hotizontal", 'role -> "form")/*33.127*/ {_display_(Seq[Any](format.raw/*33.129*/("""
                                """),_display_(/*34.34*/CSRF/*34.38*/.formField),format.raw/*34.48*/("""
                                """),format.raw/*35.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                <div class="form-group">
                               
                                """),_display_(/*38.34*/inputText(userForm("email"),'_label -> "email", 'size -> 40, 'placeholder -> "email")),format.raw/*38.119*/("""
                                """),_display_(/*39.34*/inputPassword(userForm("pass"),'_label -> "password", 'size -> 40, 'placeholder -> "password")),format.raw/*39.128*/("""

                    
                                """),format.raw/*42.33*/("""<input type="submit" value="Register" class="btn btn-secondary">

                            """)))}),format.raw/*44.30*/("""
                    
                           
    """),format.raw/*47.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 10 19:11:27 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/register.scala.html
                  HASH: df15b1f06ae7795f57ce759886e3d2fdf9cdc6fa
                  MATRIX: 955->2|1050->29|1094->25|1123->45|1150->46|1317->186|1332->192|1395->233|1483->294|1498->300|1559->339|2067->820|2082->826|2144->867|2381->1077|2425->1112|2465->1114|2526->1147|2622->1216|2636->1221|2675->1239|2778->1311|2835->1340|2896->1374|3003->1471|3044->1473|3105->1507|3118->1511|3149->1521|3210->1554|3424->1741|3531->1826|3592->1860|3708->1954|3791->2009|3917->2104|3998->2158
                  LINES: 28->2|31->6|34->3|37->7|38->8|44->14|44->14|44->14|45->15|45->15|45->15|49->19|49->19|49->19|57->27|57->27|57->27|58->28|59->29|59->29|59->29|61->31|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|68->38|68->38|69->39|69->39|72->42|74->44|77->47
                  -- GENERATED --
              */
          