
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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
        <script>  

            function checkInput(message)"""),format.raw/*20.41*/("""{"""),format.raw/*20.42*/("""
                """),format.raw/*21.17*/("""if(message)"""),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""

                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""

            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""


        """),format.raw/*28.9*/("""</script>
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
                            <br>
                            """),_display_(/*59.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*59.119*/ {_display_(Seq[Any](format.raw/*59.121*/("""
                                """),_display_(/*60.34*/CSRF/*60.38*/.formField),format.raw/*60.48*/("""
                                """),format.raw/*61.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">
                               
                                """),_display_(/*64.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*64.136*/("""

                                
                                
                    
                                """),format.raw/*69.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>                
                            
                            """)))}),format.raw/*75.30*/("""
                            
                    """),format.raw/*77.21*/("""<h3>Due today</h3>
                             

                     """),_display_(/*80.23*/for(a <- items) yield /*80.38*/{_display_(Seq[Any](format.raw/*80.39*/("""

                       
                       """),_display_(/*83.25*/if(a.isToday() == true)/*83.48*/{_display_(Seq[Any](format.raw/*83.49*/("""

                           """),_display_(/*85.29*/defining(false)/*85.44*/ { compare =>_display_(Seq[Any](format.raw/*85.57*/("""  
                                 """),_display_(/*86.35*/if(a.getCompleted()== compare)/*86.65*/ {_display_(Seq[Any](format.raw/*86.67*/("""
                                    """),format.raw/*87.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                            <h5 class="card-title text-dark">"""),_display_(/*92.79*/a/*92.80*/.getMessage()),format.raw/*92.93*/("""</h5>

                                            
                                                <a href=""""),_display_(/*95.59*/routes/*95.65*/.HomeController.delete(a.getId())),format.raw/*95.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*99.60*/routes/*99.66*/.HomeController.changeStatus(a.getId())),format.raw/*99.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*105.35*/("""
                           """)))}),format.raw/*106.29*/("""
                           
                  

                        """)))}),format.raw/*110.26*/("""

                     """)))}),format.raw/*112.23*/("""

                     """),format.raw/*114.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*118.24*/for(f <- items) yield /*118.39*/{_display_(Seq[Any](format.raw/*118.40*/("""

                       
                        """),_display_(/*121.26*/if(f.isToday() == false)/*121.50*/{_display_(Seq[Any](format.raw/*121.51*/("""

                           
                            """),_display_(/*124.30*/defining(false)/*124.45*/ { compare =>_display_(Seq[Any](format.raw/*124.58*/("""  
                                 """),_display_(/*125.35*/if(f.getCompleted()== compare)/*125.65*/ {_display_(Seq[Any](format.raw/*125.67*/("""
                                    """),format.raw/*126.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*130.79*/f/*130.80*/.getMessage()),format.raw/*130.93*/("""</h5>
                                            <a href=""""),_display_(/*131.55*/routes/*131.61*/.HomeController.delete(f.getId())),format.raw/*131.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*135.60*/routes/*135.66*/.HomeController.changeStatus(f.getId())),format.raw/*135.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*140.35*/("""
                          
                            """)))}),format.raw/*142.30*/("""
                        """)))}),format.raw/*143.26*/("""

                      """)))}),format.raw/*145.24*/("""

                     

                            """),format.raw/*149.29*/("""</center>
                            </div>

          
        
               
           

    </body>
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
                  DATE: Mon Jul 23 20:53:54 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 65d29228dd7c9f809e7280b6a36fe6152a65d073
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2292->979|2321->980|2366->997|2405->1008|2434->1009|2480->1027|2509->1028|2551->1042|2580->1043|2618->1054|3575->1984|3674->2073|3715->2075|3776->2109|3789->2113|3820->2123|3881->2156|4100->2348|4224->2450|4373->2571|4684->2851|4762->2901|4861->2973|4892->2988|4931->2989|5008->3039|5040->3062|5079->3063|5136->3093|5160->3108|5211->3121|5275->3158|5314->3188|5354->3190|5419->3227|5791->3572|5801->3573|5835->3586|5972->3696|5987->3702|6041->3735|6311->3978|6326->3984|6387->4023|6759->4363|6820->4392|6926->4466|6982->4490|7034->4513|7136->4587|7168->4602|7208->4603|7287->4654|7321->4678|7361->4679|7448->4738|7473->4753|7525->4766|7590->4803|7630->4833|7671->4835|7737->4872|8066->5173|8077->5174|8112->5187|8200->5247|8216->5253|8271->5286|8542->5529|8558->5535|8620->5574|8902->5824|8991->5881|9049->5907|9106->5932|9188->5985
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|89->59|89->59|89->59|90->60|90->60|90->60|91->61|94->64|94->64|99->69|105->75|107->77|110->80|110->80|110->80|113->83|113->83|113->83|115->85|115->85|115->85|116->86|116->86|116->86|117->87|122->92|122->92|122->92|125->95|125->95|125->95|129->99|129->99|129->99|135->105|136->106|140->110|142->112|144->114|148->118|148->118|148->118|151->121|151->121|151->121|154->124|154->124|154->124|155->125|155->125|155->125|156->126|160->130|160->130|160->130|161->131|161->131|161->131|165->135|165->135|165->135|170->140|172->142|173->143|175->145|179->149
                  -- GENERATED --
              */
          