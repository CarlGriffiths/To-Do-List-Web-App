
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Item],Form[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item], itemForm: Form[Item]):play.twirl.api.HtmlFormat.Appendable = {
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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    </head>
    <body>

         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                            """),_display_(/*25.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*25.119*/ {_display_(Seq[Any](format.raw/*25.121*/("""
                                """),_display_(/*26.34*/CSRF/*26.38*/.formField),format.raw/*26.48*/("""
                                """),format.raw/*27.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                        <div class="form-group">
                               
                                """),_display_(/*30.34*/inputText(itemForm("message"),'_label -> "Add new item", 'size -> 40)),format.raw/*30.103*/("""
                    
                                """),format.raw/*32.33*/("""<input type="submit" value="Add" class="btn btn-secondary">
                    
                                 
                                </div>
                                </form>                
                            <h1>To-Do</h1>

        """),_display_(/*39.10*/for(a <- items) yield /*39.25*/{_display_(Seq[Any](format.raw/*39.26*/("""
            
            """),format.raw/*41.13*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                    <div class="card-header align="right"">Mark as done</div>  
                    <div class="card-body">
                      <h5 class="card-title text-dark">"""),_display_(/*44.57*/a/*44.58*/.getMessage()),format.raw/*44.71*/("""</h5>
                      
                    </div>
                  </div>
        
                  

        """)))}),format.raw/*51.10*/("""
    """),format.raw/*52.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*58.14*/("""

    """),format.raw/*60.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(items:List[Item],itemForm:Form[Item]): play.twirl.api.HtmlFormat.Appendable = apply(items,itemForm)

  def f:((List[Item],Form[Item]) => play.twirl.api.HtmlFormat.Appendable) = (items,itemForm) => apply(items,itemForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 13 18:54:44 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 34ca00b86d7a09d7296edaab3db4615d1cfe27a8
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2399->1087|2498->1176|2539->1178|2600->1212|2613->1216|2644->1226|2705->1259|2927->1454|3018->1523|3100->1577|3390->1840|3421->1855|3460->1856|3514->1882|3786->2127|3796->2128|3830->2141|3980->2260|4012->2265|4110->2332|4143->2338
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|55->25|55->25|55->25|56->26|56->26|56->26|57->27|60->30|60->30|62->32|69->39|69->39|69->39|71->41|74->44|74->44|74->44|81->51|82->52|88->58|90->60
                  -- GENERATED --
              */
          