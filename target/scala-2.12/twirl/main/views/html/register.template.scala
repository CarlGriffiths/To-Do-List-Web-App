
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
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

            
        <title>title</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
         <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    </head>
    <body></body>

         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                            <br>
                            <h2>Register</h2>
                            """),_display_(/*27.30*/form(action=routes.HomeController.submitRegister(), 'class -> "form-hotizontal", 'role -> "form")/*27.127*/ {_display_(Seq[Any](format.raw/*27.129*/("""
                                """),_display_(/*28.34*/CSRF/*28.38*/.formField),format.raw/*28.48*/("""
                                """),format.raw/*29.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                <div class="form-group">
                               
                                """),_display_(/*32.34*/inputText(userForm("email"),'_label -> "email", 'size -> 40, 'placeholder -> "email")),format.raw/*32.119*/("""
                                """),_display_(/*33.34*/inputPassword(userForm("pass"),'_label -> "password", 'size -> 40, 'placeholder -> "password")),format.raw/*33.128*/("""
                                """),_display_(/*34.34*/inputText(userForm("city"),'_label -> "enter your city", 'size -> 40, 'placeholder -> "city")),format.raw/*34.127*/("""
                    
                                """),format.raw/*36.33*/("""<input type="submit" value="Register" class="btn btn-secondary">

                            """)))}),format.raw/*38.30*/("""
                    
                           
    """),format.raw/*41.5*/("""</body>
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
                  DATE: Tue Oct 02 00:26:54 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/register.scala.html
                  HASH: b8464d18af75fa3e6dfb9c03266068358d7a0110
                  MATRIX: 955->2|1050->27|1094->25|1121->43|1148->44|1315->184|1330->190|1393->231|1481->292|1496->298|1557->337|2065->818|2080->824|2142->865|2458->1154|2565->1251|2606->1253|2667->1287|2680->1291|2711->1301|2772->1334|2986->1521|3093->1606|3154->1640|3270->1734|3331->1768|3446->1861|3528->1915|3654->2010|3735->2064
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|57->27|57->27|57->27|58->28|58->28|58->28|59->29|62->32|62->32|63->33|63->33|64->34|64->34|66->36|68->38|71->41
                  -- GENERATED --
              */
          