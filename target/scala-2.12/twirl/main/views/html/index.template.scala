
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Item],Form[Item],List[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item], itemForm: Form[Item], cat: List[Category]):play.twirl.api.HtmlFormat.Appendable = {
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
            """),_display_(/*51.14*/for(c <- cat) yield /*51.27*/{_display_(Seq[Any](format.raw/*51.28*/("""
                """),format.raw/*52.17*/("""<a href=""""),_display_(/*52.27*/routes/*52.33*/.HomeController.index(c.getId())),format.raw/*52.65*/("""">"""),_display_(/*52.68*/c/*52.69*/.getName()),format.raw/*52.79*/("""</a>

            """)))}),format.raw/*54.14*/("""

              


         
        """),format.raw/*60.9*/("""<div class="row">
                <div class="col-12">
                    <center>
                            <br>
                            """),_display_(/*64.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*64.119*/ {_display_(Seq[Any](format.raw/*64.121*/("""
                                """),_display_(/*65.34*/CSRF/*65.38*/.formField),format.raw/*65.48*/("""
                                """),format.raw/*66.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*71.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*71.136*/("""

                                
                                
                    
                                """),format.raw/*76.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                </div>              
                            
                            """)))}),format.raw/*83.30*/("""
                      """),format.raw/*84.23*/("""<div class="col-12">
                    <center>      
                    <h3>Due today</h3>
                       


                     """),_display_(/*90.23*/for(a <- items) yield /*90.38*/{_display_(Seq[Any](format.raw/*90.39*/("""

                       
                       """),_display_(/*93.25*/if(a.isToday() == true)/*93.48*/{_display_(Seq[Any](format.raw/*93.49*/("""

                           """),_display_(/*95.29*/defining(false)/*95.44*/ { compare =>_display_(Seq[Any](format.raw/*95.57*/("""  
                                 """),_display_(/*96.35*/if(a.getCompleted()== compare)/*96.65*/ {_display_(Seq[Any](format.raw/*96.67*/("""
                                    """),format.raw/*97.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                            <h5 class="card-title text-dark">"""),_display_(/*102.79*/a/*102.80*/.getMessage()),format.raw/*102.93*/("""</h5>

                                            
                                                <a href=""""),_display_(/*105.59*/routes/*105.65*/.HomeController.delete(a.getId())),format.raw/*105.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*109.60*/routes/*109.66*/.HomeController.changeStatus(a.getId())),format.raw/*109.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*115.35*/("""
                           """)))}),format.raw/*116.29*/("""
                           
                  

                        """)))}),format.raw/*120.26*/("""

                     """)))}),format.raw/*122.23*/("""

                     """),format.raw/*124.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*128.24*/for(f <- items) yield /*128.39*/{_display_(Seq[Any](format.raw/*128.40*/("""

                       
                        """),_display_(/*131.26*/if(f.isToday() == false)/*131.50*/{_display_(Seq[Any](format.raw/*131.51*/("""

                           
                            """),_display_(/*134.30*/defining(false)/*134.45*/ { compare =>_display_(Seq[Any](format.raw/*134.58*/("""  
                                 """),_display_(/*135.35*/if(f.getCompleted()== compare)/*135.65*/ {_display_(Seq[Any](format.raw/*135.67*/("""
                                    """),format.raw/*136.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*140.79*/f/*140.80*/.getMessage()),format.raw/*140.93*/("""</h5>
                                            <a href=""""),_display_(/*141.55*/routes/*141.61*/.HomeController.delete(f.getId())),format.raw/*141.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*145.60*/routes/*145.66*/.HomeController.changeStatus(f.getId())),format.raw/*145.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*150.35*/("""
                          
                            """)))}),format.raw/*152.30*/("""
                        """)))}),format.raw/*153.26*/("""

                      """)))}),format.raw/*155.24*/("""

                     

                            """),format.raw/*159.29*/("""</center>
                            </div>

       
               
           

    </body>
</html>
"""))
      }
    }
  }

  def render(items:List[Item],itemForm:Form[Item],cat:List[Category]): play.twirl.api.HtmlFormat.Appendable = apply(items,itemForm,cat)

  def f:((List[Item],Form[Item],List[Category]) => play.twirl.api.HtmlFormat.Appendable) = (items,itemForm,cat) => apply(items,itemForm,cat)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 26 00:25:26 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: e88d59c0ae56cba05155e45ddd1963cb94b22a2c
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1378->224|1393->230|1456->271|1544->332|1559->338|1620->377|2128->858|2143->864|2205->905|2328->1000|2357->1001|2402->1018|2441->1029|2470->1030|2516->1048|2545->1049|2587->1063|2616->1064|2654->1075|3444->1838|3473->1851|3512->1852|3557->1869|3594->1879|3609->1885|3662->1917|3692->1920|3702->1921|3733->1931|3783->1950|3847->1987|4020->2133|4119->2222|4160->2224|4221->2258|4234->2262|4265->2272|4326->2305|4584->2536|4708->2638|4857->2759|5207->3078|5258->3101|5428->3244|5459->3259|5498->3260|5575->3310|5607->3333|5646->3334|5703->3364|5727->3379|5778->3392|5842->3429|5881->3459|5921->3461|5986->3498|6359->3843|6370->3844|6405->3857|6543->3967|6559->3973|6614->4006|6885->4249|6901->4255|6963->4294|7335->4634|7396->4663|7502->4737|7558->4761|7610->4784|7712->4858|7744->4873|7784->4874|7863->4925|7897->4949|7937->4950|8024->5009|8049->5024|8101->5037|8166->5074|8206->5104|8247->5106|8313->5143|8642->5444|8653->5445|8688->5458|8776->5518|8792->5524|8847->5557|9118->5800|9134->5806|9196->5845|9478->6095|9567->6152|9625->6178|9682->6203|9764->6256
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|81->51|81->51|81->51|82->52|82->52|82->52|82->52|82->52|82->52|82->52|84->54|90->60|94->64|94->64|94->64|95->65|95->65|95->65|96->66|101->71|101->71|106->76|113->83|114->84|120->90|120->90|120->90|123->93|123->93|123->93|125->95|125->95|125->95|126->96|126->96|126->96|127->97|132->102|132->102|132->102|135->105|135->105|135->105|139->109|139->109|139->109|145->115|146->116|150->120|152->122|154->124|158->128|158->128|158->128|161->131|161->131|161->131|164->134|164->134|164->134|165->135|165->135|165->135|166->136|170->140|170->140|170->140|171->141|171->141|171->141|175->145|175->145|175->145|180->150|182->152|183->153|185->155|189->159
                  -- GENERATED --
              */
          