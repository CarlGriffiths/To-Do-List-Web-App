
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
         <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    </head>
    <body>

    
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Navbar</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      
      <li class="nav-item">
        <a class="nav-link" href=".">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/completed">completed</a>
      </li>
    </ul>
    
  </div>
</nav>
         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                           
                    <h2>Completed</h2>     
                   

                     <hr>
                     


                      """),_display_(/*53.24*/for(f <- items) yield /*53.39*/{_display_(Seq[Any](format.raw/*53.40*/("""

                       
                        
                             """),_display_(/*57.31*/defining(true)/*57.45*/ { compare =>_display_(Seq[Any](format.raw/*57.58*/("""  
                                 """),_display_(/*58.35*/if(f.getCompleted()== compare)/*58.65*/ {_display_(Seq[Any](format.raw/*58.67*/("""
                           
                                    """),format.raw/*60.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*64.79*/f/*64.80*/.getMessage()),format.raw/*64.93*/("""</h5>
                                            <a href=""""),_display_(/*65.55*/routes/*65.61*/.HomeController.delete(f.getId())),format.raw/*65.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*69.60*/routes/*69.66*/.HomeController.changeStatus(f.getId())),format.raw/*69.105*/("""" class="btn btn-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 
                                """)))}),format.raw/*75.34*/("""
                            """)))}),format.raw/*76.30*/("""

                              
                        """)))}),format.raw/*79.26*/("""

                    

                     

                            """),format.raw/*85.29*/("""</center>
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
                  DATE: Mon Jul 23 01:45:32 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/completed.scala.html
                  HASH: 7eb39a48b824b23f83e35b7f75179e800dc3a293
                  MATRIX: 956->2|1048->24|1092->22|1119->40|1146->41|1313->181|1328->187|1391->228|1479->289|1494->295|1555->334|2063->815|2078->821|2140->862|3226->1921|3257->1936|3296->1937|3404->2018|3427->2032|3478->2045|3542->2082|3581->2112|3621->2114|3714->2179|4042->2480|4052->2481|4086->2494|4173->2554|4188->2560|4242->2593|4512->2836|4527->2842|4588->2881|4894->3156|4955->3186|5044->3244|5147->3319
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|83->53|83->53|83->53|87->57|87->57|87->57|88->58|88->58|88->58|90->60|94->64|94->64|94->64|95->65|95->65|95->65|99->69|99->69|99->69|105->75|106->76|109->79|115->85
                  -- GENERATED --
              */
          