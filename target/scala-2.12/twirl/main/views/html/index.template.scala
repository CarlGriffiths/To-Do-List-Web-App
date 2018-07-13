
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(itemForm: Form[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
       
        <title>title</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*13.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(/*16.10*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*16.99*/ {_display_(Seq[Any](format.raw/*16.101*/("""
            """),_display_(/*17.14*/CSRF/*17.18*/.formField),format.raw/*17.28*/("""
            

           
            """),_display_(/*21.14*/inputText(itemForm("message"))),format.raw/*21.44*/("""

            

            """),format.raw/*25.13*/("""<input type="submit" value="create">


       """)))}),format.raw/*28.9*/("""
    """),format.raw/*29.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(itemForm:Form[Item]): play.twirl.api.HtmlFormat.Appendable = apply(itemForm)

  def f:((Form[Item]) => play.twirl.api.HtmlFormat.Appendable) = (itemForm) => apply(itemForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 13 15:17:29 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 20579b36b1b33961c7c0f9f0db205bd8caaa619f
                  MATRIX: 952->2|1047->27|1091->25|1118->43|1145->44|1306->178|1321->184|1384->225|1472->286|1487->292|1548->331|1600->356|1615->362|1677->403|1771->470|1869->559|1910->561|1951->575|1964->579|1995->589|2062->629|2113->659|2169->687|2246->734|2278->739
                  LINES: 28->2|31->4|34->3|35->5|36->6|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|46->16|46->16|46->16|47->17|47->17|47->17|51->21|51->21|55->25|58->28|59->29
                  -- GENERATED --
              */
          