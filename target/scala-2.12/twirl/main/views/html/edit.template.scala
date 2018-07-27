
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Item],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(itemForm: Form[Item], id: Integer):play.twirl.api.HtmlFormat.Appendable = {
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
                            """),_display_(/*26.30*/form(action=routes.HomeController.submitDate(id), 'class -> "form-hotizontal", 'role -> "form")/*26.125*/ {_display_(Seq[Any](format.raw/*26.127*/("""
                                """),_display_(/*27.34*/CSRF/*27.38*/.formField),format.raw/*27.48*/("""
                                """),format.raw/*28.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                        <div class="form-group">
                               
                               
                                """),_display_(/*32.34*/inputDate(itemForm("date"),'_label -> "Enter date", 'size -> 90)),format.raw/*32.98*/("""
                                 """),_display_(/*33.35*/select(
                                        itemForm("category.Id"), 
                                        options(Category.options),
                                        '_label -> "Category", 
                                        '_default -> "-- Choose a category --",'_showConstraints -> false, 'class -> "form-control")),format.raw/*37.133*/("""
                    
                                """),format.raw/*39.33*/("""<input type="submit" value="Add" class="btn btn-secondary">

                            """)))}),format.raw/*41.30*/("""
                    
                           
    """),format.raw/*44.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(itemForm:Form[Item],id:Integer): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,id)

  def f:((Form[Item],Integer) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,id) => apply(itemForm,id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 27 19:23:42 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/edit.scala.html
                  HASH: a3adb7f2f6820952d9acc0ace98ba951a6c6490f
                  MATRIX: 959->2|1067->40|1111->38|1138->56|1165->57|1332->197|1347->203|1410->244|1498->305|1513->311|1574->350|2082->831|2097->837|2159->878|2429->1121|2534->1216|2575->1218|2636->1252|2649->1256|2680->1266|2741->1299|2995->1526|3080->1590|3142->1625|3501->1962|3583->2016|3704->2106|3785->2160
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|62->32|62->32|63->33|67->37|69->39|71->41|74->44
                  -- GENERATED --
              */
          