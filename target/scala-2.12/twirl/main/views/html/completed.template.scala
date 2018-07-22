
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
                           
                            
                    <h3>Due today</h3>
                             

                     """),_display_(/*50.23*/for(a <- items) yield /*50.38*/{_display_(Seq[Any](format.raw/*50.39*/("""

                       
                       """),_display_(/*53.25*/if(a.isToday() == true)/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""

                           """),_display_(/*55.29*/defining(true)/*55.43*/ { compare =>_display_(Seq[Any](format.raw/*55.56*/("""  
                                 """),_display_(/*56.35*/if(a.getCompleted()== compare)/*56.65*/ {_display_(Seq[Any](format.raw/*56.67*/("""
                                    """),format.raw/*57.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*58.80*/routes/*58.86*/.HomeController.changeStatus(a.getId())),format.raw/*58.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*58.161*/routes/*58.167*/.HomeController.delete(a.getId())),format.raw/*58.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*61.79*/a/*61.80*/.getMessage()),format.raw/*61.93*/("""</h5>
                                        </div>
                                    </div>
                                 """)))}),format.raw/*64.35*/("""
                           """)))}),format.raw/*65.29*/("""
                           
                  

                        """)))}),format.raw/*69.26*/("""

                     """)))}),format.raw/*71.23*/("""

                     """),format.raw/*73.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*77.24*/for(f <- items) yield /*77.39*/{_display_(Seq[Any](format.raw/*77.40*/("""

                       
                        """),_display_(/*80.26*/if(f.isToday() == false)/*80.50*/{_display_(Seq[Any](format.raw/*80.51*/("""

                           
                            """),_display_(/*83.30*/defining(true)/*83.44*/ { compare =>_display_(Seq[Any](format.raw/*83.57*/("""  
                                 """),_display_(/*84.35*/if(f.getCompleted()== compare)/*84.65*/ {_display_(Seq[Any](format.raw/*84.67*/("""
                                    """),format.raw/*85.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*86.80*/routes/*86.86*/.HomeController.changeStatus(f.getId())),format.raw/*86.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*86.161*/routes/*86.167*/.HomeController.delete(f.getId())),format.raw/*86.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*89.79*/f/*89.80*/.getMessage()),format.raw/*89.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*93.35*/("""
                          
                            """)))}),format.raw/*95.30*/("""
                        """)))}),format.raw/*96.26*/("""

                      """)))}),format.raw/*98.24*/("""

                     

                            """),format.raw/*102.29*/("""</center>
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
                  DATE: Sun Jul 22 22:17:28 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/completed.scala.html
                  HASH: 3ce19e069353dc81db292c919df59379bc396e6a
                  MATRIX: 956->2|1048->24|1092->22|1119->40|1146->41|1313->181|1328->187|1391->228|1479->289|1494->295|1555->334|2063->815|2078->821|2140->862|3209->1904|3240->1919|3279->1920|3356->1970|3388->1993|3427->1994|3484->2024|3507->2038|3558->2051|3622->2088|3661->2118|3701->2120|3766->2157|3937->2301|3952->2307|4013->2346|4077->2382|4093->2388|4148->2421|4387->2633|4397->2634|4431->2647|4592->2777|4652->2806|4757->2880|4812->2904|4863->2927|4964->3001|4995->3016|5034->3017|5112->3068|5145->3092|5184->3093|5270->3152|5293->3166|5344->3179|5408->3216|5447->3246|5487->3248|5552->3285|5723->3429|5738->3435|5799->3474|5863->3510|5879->3516|5934->3549|6173->3761|6183->3762|6217->3775|6379->3906|6467->3963|6524->3989|6580->4014|6662->4067
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|80->50|80->50|80->50|83->53|83->53|83->53|85->55|85->55|85->55|86->56|86->56|86->56|87->57|88->58|88->58|88->58|88->58|88->58|88->58|91->61|91->61|91->61|94->64|95->65|99->69|101->71|103->73|107->77|107->77|107->77|110->80|110->80|110->80|113->83|113->83|113->83|114->84|114->84|114->84|115->85|116->86|116->86|116->86|116->86|116->86|116->86|119->89|119->89|119->89|123->93|125->95|126->96|128->98|132->102
                  -- GENERATED --
              */
          