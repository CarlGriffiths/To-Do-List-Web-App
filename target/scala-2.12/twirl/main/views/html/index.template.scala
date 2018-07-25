
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



         
        <div class="row">
                <div class="col-12">
                    <center>
                            <br>
                            """),_display_(/*59.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*59.119*/ {_display_(Seq[Any](format.raw/*59.121*/("""
                                """),_display_(/*60.34*/CSRF/*60.38*/.formField),format.raw/*60.48*/("""
                                """),format.raw/*61.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*66.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*66.136*/("""

                                
                                
                    
                                """),format.raw/*71.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                </div>              
                            
                            """)))}),format.raw/*78.30*/("""
                      """),format.raw/*79.23*/("""<div class="col-12">
                    <center>      
                    <h3>Due today</h3>
                       


                     """),_display_(/*85.23*/for(a <- items) yield /*85.38*/{_display_(Seq[Any](format.raw/*85.39*/("""

                       
                       """),_display_(/*88.25*/if(a.isToday() == true)/*88.48*/{_display_(Seq[Any](format.raw/*88.49*/("""

                           """),_display_(/*90.29*/defining(false)/*90.44*/ { compare =>_display_(Seq[Any](format.raw/*90.57*/("""  
                                 """),_display_(/*91.35*/if(a.getCompleted()== compare)/*91.65*/ {_display_(Seq[Any](format.raw/*91.67*/("""
                                    """),format.raw/*92.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                            <h5 class="card-title text-dark">"""),_display_(/*97.79*/a/*97.80*/.getMessage()),format.raw/*97.93*/("""</h5>

                                            
                                                <a href=""""),_display_(/*100.59*/routes/*100.65*/.HomeController.delete(a.getId())),format.raw/*100.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*104.60*/routes/*104.66*/.HomeController.changeStatus(a.getId())),format.raw/*104.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*110.35*/("""
                           """)))}),format.raw/*111.29*/("""
                           
                  

                        """)))}),format.raw/*115.26*/("""

                     """)))}),format.raw/*117.23*/("""

                     """),format.raw/*119.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*123.24*/for(f <- items) yield /*123.39*/{_display_(Seq[Any](format.raw/*123.40*/("""

                       
                        """),_display_(/*126.26*/if(f.isToday() == false)/*126.50*/{_display_(Seq[Any](format.raw/*126.51*/("""

                           
                            """),_display_(/*129.30*/defining(false)/*129.45*/ { compare =>_display_(Seq[Any](format.raw/*129.58*/("""  
                                 """),_display_(/*130.35*/if(f.getCompleted()== compare)/*130.65*/ {_display_(Seq[Any](format.raw/*130.67*/("""
                                    """),format.raw/*131.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*135.79*/f/*135.80*/.getMessage()),format.raw/*135.93*/("""</h5>
                                            <a href=""""),_display_(/*136.55*/routes/*136.61*/.HomeController.delete(f.getId())),format.raw/*136.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*140.60*/routes/*140.66*/.HomeController.changeStatus(f.getId())),format.raw/*140.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*145.35*/("""
                          
                            """)))}),format.raw/*147.30*/("""
                        """)))}),format.raw/*148.26*/("""

                      """)))}),format.raw/*150.24*/("""

                     

                            """),format.raw/*154.29*/("""</center>
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
                  DATE: Wed Jul 25 21:59:11 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: bc23ca557bb8fb3f3a2a845aae9c0bcca43aee09
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1378->224|1393->230|1456->271|1544->332|1559->338|1620->377|2128->858|2143->864|2205->905|2328->1000|2357->1001|2402->1018|2441->1029|2470->1030|2516->1048|2545->1049|2587->1063|2616->1064|2654->1075|3598->1992|3697->2081|3738->2083|3799->2117|3812->2121|3843->2131|3904->2164|4162->2395|4286->2497|4435->2618|4785->2937|4836->2960|5006->3103|5037->3118|5076->3119|5153->3169|5185->3192|5224->3193|5281->3223|5305->3238|5356->3251|5420->3288|5459->3318|5499->3320|5564->3357|5936->3702|5946->3703|5980->3716|6118->3826|6134->3832|6189->3865|6460->4108|6476->4114|6538->4153|6910->4493|6971->4522|7077->4596|7133->4620|7185->4643|7287->4717|7319->4732|7359->4733|7438->4784|7472->4808|7512->4809|7599->4868|7624->4883|7676->4896|7741->4933|7781->4963|7822->4965|7888->5002|8217->5303|8228->5304|8263->5317|8351->5377|8367->5383|8422->5416|8693->5659|8709->5665|8771->5704|9053->5954|9142->6011|9200->6037|9257->6062|9339->6115
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|89->59|89->59|89->59|90->60|90->60|90->60|91->61|96->66|96->66|101->71|108->78|109->79|115->85|115->85|115->85|118->88|118->88|118->88|120->90|120->90|120->90|121->91|121->91|121->91|122->92|127->97|127->97|127->97|130->100|130->100|130->100|134->104|134->104|134->104|140->110|141->111|145->115|147->117|149->119|153->123|153->123|153->123|156->126|156->126|156->126|159->129|159->129|159->129|160->130|160->130|160->130|161->131|165->135|165->135|165->135|166->136|166->136|166->136|170->140|170->140|170->140|175->145|177->147|178->148|180->150|184->154
                  -- GENERATED --
              */
          