
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
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
                            """),_display_(/*33.30*/form(action=routes.HomeController.submitLogin(), 'class -> "form-hotizontal", 'role -> "form")/*33.124*/ {_display_(Seq[Any](format.raw/*33.126*/("""
                                """),_display_(/*34.34*/CSRF/*34.38*/.formField),format.raw/*34.48*/("""
                                """),format.raw/*35.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                <div class="form-group">
                               
                                """),_display_(/*38.34*/inputText(userForm("email"),'_label -> "email", 'size -> 40, 'placeholder -> "email")),format.raw/*38.119*/("""
                                """),_display_(/*39.34*/inputPassword(userForm("pass"),'_label -> "password", 'size -> 40, 'placeholder -> "password")),format.raw/*39.128*/("""

                    
                                """),format.raw/*42.33*/("""<input type="submit" value="Login" class="btn btn-secondary">

                            """)))}),format.raw/*44.30*/("""
                    
                           
    """),format.raw/*47.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(userForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Aug 12 20:34:27 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/login.scala.html
                  HASH: 078ceba72743f9131cc8aafda2527aaeeb606665
                  MATRIX: 953->2|1049->30|1093->26|1122->46|1149->47|1316->187|1331->193|1394->234|1482->295|1497->301|1558->340|2066->821|2081->827|2143->868|2380->1078|2424->1113|2464->1115|2525->1148|2621->1217|2635->1222|2674->1240|2777->1312|2834->1341|2895->1375|2999->1469|3040->1471|3101->1505|3114->1509|3145->1519|3206->1552|3420->1739|3527->1824|3588->1858|3704->1952|3787->2007|3910->2099|3991->2153
                  LINES: 28->2|31->6|34->3|37->7|38->8|44->14|44->14|44->14|45->15|45->15|45->15|49->19|49->19|49->19|57->27|57->27|57->27|58->28|59->29|59->29|59->29|61->31|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|68->38|68->38|69->39|69->39|72->42|74->44|77->47
                  -- GENERATED --
              */
          