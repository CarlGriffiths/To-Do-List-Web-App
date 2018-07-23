
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
                            """),_display_(/*48.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*48.119*/ {_display_(Seq[Any](format.raw/*48.121*/("""
                                """),_display_(/*49.34*/CSRF/*49.38*/.formField),format.raw/*49.48*/("""
                                """),format.raw/*50.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">
                               
                                """),_display_(/*53.34*/inputText(itemForm("message"),'_label -> "Add new item", 'size -> 40)),format.raw/*53.103*/("""
                                
                    
                                """),format.raw/*56.33*/("""<input type="submit" value="Add task" class="btn btn-secondary">
                    
                                 
                                 </div>
                                </form>                
                            
                            """)))}),format.raw/*62.30*/("""
                            
                    """),format.raw/*64.21*/("""<h3>Due today</h3>
                             

                     """),_display_(/*67.23*/for(a <- items) yield /*67.38*/{_display_(Seq[Any](format.raw/*67.39*/("""

                       
                       """),_display_(/*70.25*/if(a.isToday() == true)/*70.48*/{_display_(Seq[Any](format.raw/*70.49*/("""

                           """),_display_(/*72.29*/defining(false)/*72.44*/ { compare =>_display_(Seq[Any](format.raw/*72.57*/("""  
                                 """),_display_(/*73.35*/if(a.getCompleted()== compare)/*73.65*/ {_display_(Seq[Any](format.raw/*73.67*/("""
                                    """),format.raw/*74.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                            <h2 class="card-title text-dark">"""),_display_(/*79.79*/a/*79.80*/.getMessage()),format.raw/*79.93*/("""</h2>

                                            
                                                <a href=""""),_display_(/*82.59*/routes/*82.65*/.HomeController.delete(a.getId())),format.raw/*82.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*86.60*/routes/*86.66*/.HomeController.changeStatus(a.getId())),format.raw/*86.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*92.35*/("""
                           """)))}),format.raw/*93.29*/("""
                           
                  

                        """)))}),format.raw/*97.26*/("""

                     """)))}),format.raw/*99.23*/("""

                     """),format.raw/*101.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*105.24*/for(f <- items) yield /*105.39*/{_display_(Seq[Any](format.raw/*105.40*/("""

                       
                        """),_display_(/*108.26*/if(f.isToday() == false)/*108.50*/{_display_(Seq[Any](format.raw/*108.51*/("""

                           
                            """),_display_(/*111.30*/defining(false)/*111.45*/ { compare =>_display_(Seq[Any](format.raw/*111.58*/("""  
                                 """),_display_(/*112.35*/if(f.getCompleted()== compare)/*112.65*/ {_display_(Seq[Any](format.raw/*112.67*/("""
                                    """),format.raw/*113.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*117.79*/f/*117.80*/.getMessage()),format.raw/*117.93*/("""</h5>
                                            <a href=""""),_display_(/*118.55*/routes/*118.61*/.HomeController.delete(f.getId())),format.raw/*118.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*122.60*/routes/*122.66*/.HomeController.changeStatus(f.getId())),format.raw/*122.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*127.35*/("""
                          
                            """)))}),format.raw/*129.30*/("""
                        """)))}),format.raw/*130.26*/("""

                      """)))}),format.raw/*132.24*/("""

                     

                            """),format.raw/*136.29*/("""</center>
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
                  DATE: Mon Jul 23 01:44:38 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 8b731e8570b576a310fa37364f95af297fecc801
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|3151->1839|3250->1928|3291->1930|3352->1964|3365->1968|3396->1978|3457->2011|3676->2203|3767->2272|3882->2359|4187->2633|4265->2683|4364->2755|4395->2770|4434->2771|4511->2821|4543->2844|4582->2845|4639->2875|4663->2890|4714->2903|4778->2940|4817->2970|4857->2972|4922->3009|5294->3354|5304->3355|5338->3368|5475->3478|5490->3484|5544->3517|5814->3760|5829->3766|5890->3805|6261->4145|6321->4174|6426->4248|6481->4272|6533->4295|6635->4369|6667->4384|6707->4385|6786->4436|6820->4460|6860->4461|6947->4520|6972->4535|7024->4548|7089->4585|7129->4615|7170->4617|7236->4654|7565->4955|7576->4956|7611->4969|7699->5029|7715->5035|7770->5068|8041->5311|8057->5317|8119->5356|8401->5606|8490->5663|8548->5689|8605->5714|8687->5767
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|78->48|78->48|78->48|79->49|79->49|79->49|80->50|83->53|83->53|86->56|92->62|94->64|97->67|97->67|97->67|100->70|100->70|100->70|102->72|102->72|102->72|103->73|103->73|103->73|104->74|109->79|109->79|109->79|112->82|112->82|112->82|116->86|116->86|116->86|122->92|123->93|127->97|129->99|131->101|135->105|135->105|135->105|138->108|138->108|138->108|141->111|141->111|141->111|142->112|142->112|142->112|143->113|147->117|147->117|147->117|148->118|148->118|148->118|152->122|152->122|152->122|157->127|159->129|160->130|162->132|166->136
                  -- GENERATED --
              */
          