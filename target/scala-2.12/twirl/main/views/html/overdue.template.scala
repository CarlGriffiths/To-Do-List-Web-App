
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

object overdue extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Item],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

            
        <title>title</title>
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
         <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    </head>
    <body>

     <!-- Grey with black text -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href=".">Home</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="/completed">Completed</a>
          </li>
          
        </ul>
      </nav>
         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                           
                    <h2>Overdue</h2>     
                     <hr>
                     
                      """),_display_(/*41.24*/for(f <- user.getItems()) yield /*41.49*/{_display_(Seq[Any](format.raw/*41.50*/("""
                        """),_display_(/*42.26*/if(f.getCompleted()== false)/*42.54*/ {_display_(Seq[Any](format.raw/*42.56*/("""
                             """),_display_(/*43.31*/defining(true)/*43.45*/ { compare =>_display_(Seq[Any](format.raw/*43.58*/("""  
                                 """),_display_(/*44.35*/if(f.hasDatePassed()== compare)/*44.66*/ {_display_(Seq[Any](format.raw/*44.68*/("""
                           
                                    """),format.raw/*46.37*/("""<div class="card border-dark mb-3" style="max-width: 25rem;">
   
                                            <div class="card-body">
                                                    <div style="clear: both">
                                                            <h5 style="float: center">"""),_display_(/*50.88*/f/*50.89*/.getMessage()),format.raw/*50.102*/("""</h5>
                                                           
                                                        </div>
                                                        <hr />
                                          
                                            <a href=""""),_display_(/*55.55*/routes/*55.61*/.HomeController.delete(f.getId())),format.raw/*55.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*59.60*/routes/*59.66*/.HomeController.changeStatus(f.getId())),format.raw/*59.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>
                                 
                                """)))}),format.raw/*64.34*/("""
                            """)))}),format.raw/*65.30*/("""
                              
                        """)))}),format.raw/*67.26*/("""
                    
                    """)))}),format.raw/*69.22*/("""
                     

                            """),format.raw/*72.29*/("""</center>
                            </div>

          
        
               
           

    </body>
</html>
"""))
      }
    }
  }

  def render(items:List[Item],user:User): play.twirl.api.HtmlFormat.Appendable = apply(items,user)

  def f:((List[Item],User) => play.twirl.api.HtmlFormat.Appendable) = (items,user) => apply(items,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 15 22:12:43 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/overdue.scala.html
                  HASH: f91dd8410c43a573bef564f3c8c8d3e1081b0d30
                  MATRIX: 959->2|1063->36|1107->34|1134->52|1161->53|1342->207|1357->213|1418->252|1926->733|1941->739|2003->780|2725->1475|2766->1500|2805->1501|2858->1527|2895->1555|2935->1557|2993->1588|3016->1602|3067->1615|3131->1652|3171->1683|3211->1685|3304->1750|3630->2049|3640->2050|3675->2063|3991->2352|4006->2358|4060->2391|4330->2634|4345->2640|4406->2679|4719->2961|4780->2991|4868->3048|4942->3091|5022->3143
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|76->46|80->50|80->50|80->50|85->55|85->55|85->55|89->59|89->59|89->59|94->64|95->65|97->67|99->69|102->72
                  -- GENERATED --
              */
          