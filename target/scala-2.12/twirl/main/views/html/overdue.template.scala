
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
                           
                    <h2>Completed</h2>     
                   

                     <hr>
                     
                    

                      """),_display_(/*45.24*/for(f <- user.getItems()) yield /*45.49*/{_display_(Seq[Any](format.raw/*45.50*/("""

                       
                        
                             """),_display_(/*49.31*/defining(true)/*49.45*/ { compare =>_display_(Seq[Any](format.raw/*49.58*/("""  
                                 """),_display_(/*50.35*/if(f.hasDatePassed()== compare)/*50.66*/ {_display_(Seq[Any](format.raw/*50.68*/("""
                           
                                    """),format.raw/*52.37*/("""<div class="card border-dark mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                                    <div style="clear: both">
                                                            <h5 style="float: center">"""),_display_(/*57.88*/f/*57.89*/.getMessage()),format.raw/*57.102*/("""</h5>
                                                            
                                                            
                                                        </div>
                                                        <hr />
                                          
                                            <a href=""""),_display_(/*63.55*/routes/*63.61*/.HomeController.delete(f.getId())),format.raw/*63.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*67.60*/routes/*67.66*/.HomeController.changeStatus(f.getId())),format.raw/*67.105*/("""" class="btn btn-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 
                                """)))}),format.raw/*73.34*/("""
                            """)))}),format.raw/*74.30*/("""

                              
                        """)))}),format.raw/*77.26*/("""

                    

                     

                            """),format.raw/*83.29*/("""</center>
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
                  DATE: Mon Aug 13 16:42:23 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/overdue.scala.html
                  HASH: 1ecc138d0c87f41bd93e85215e6844375ef6ebfb
                  MATRIX: 959->2|1063->36|1107->34|1134->52|1161->53|1342->207|1357->213|1418->252|1926->733|1941->739|2003->780|2770->1520|2811->1545|2850->1546|2958->1627|2981->1641|3032->1654|3096->1691|3136->1722|3176->1724|3269->1789|3681->2174|3691->2175|3726->2188|4104->2539|4119->2545|4173->2578|4443->2821|4458->2827|4519->2866|4825->3141|4886->3171|4975->3229|5078->3304
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|75->45|75->45|75->45|79->49|79->49|79->49|80->50|80->50|80->50|82->52|87->57|87->57|87->57|93->63|93->63|93->63|97->67|97->67|97->67|103->73|104->74|107->77|113->83
                  -- GENERATED --
              */
          