
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

object completed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
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
                     


                      """),_display_(/*45.24*/for(f <- items) yield /*45.39*/{_display_(Seq[Any](format.raw/*45.40*/("""

                       
                        
                             """),_display_(/*49.31*/defining(true)/*49.45*/ { compare =>_display_(Seq[Any](format.raw/*49.58*/("""  
                                 """),_display_(/*50.35*/if(f.getCompleted()== compare)/*50.65*/ {_display_(Seq[Any](format.raw/*50.67*/("""
                           
                                    """),format.raw/*52.37*/("""<div class="card border-dark mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                                    <div style="clear: both">
                                                            <h5 style="float: center">"""),_display_(/*57.88*/f/*57.89*/.getMessage()),format.raw/*57.102*/("""</h5>
                                                            <p style="float: center">"""),_display_(/*58.87*/f/*58.88*/.getDateCompleted()),format.raw/*58.107*/("""</p>
                                                            
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

  def render(items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 29 02:04:03 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/completed.scala.html
                  HASH: 94ef690c5c994a3b25fe9358abbf6e4cd3b5bb8d
                  MATRIX: 956->2|1048->24|1092->22|1119->40|1146->41|1327->195|1342->201|1403->240|1911->721|1926->727|1988->768|2735->1488|2766->1503|2805->1504|2913->1585|2936->1599|2987->1612|3051->1649|3090->1679|3130->1681|3223->1746|3635->2131|3645->2132|3680->2145|3799->2237|3809->2238|3850->2257|4166->2546|4181->2552|4235->2585|4505->2828|4520->2834|4581->2873|4887->3148|4948->3178|5037->3236|5140->3311
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|75->45|75->45|75->45|79->49|79->49|79->49|80->50|80->50|80->50|82->52|87->57|87->57|87->57|88->58|88->58|88->58|93->63|93->63|93->63|97->67|97->67|97->67|103->73|104->74|107->77|113->83
                  -- GENERATED --
              */
          