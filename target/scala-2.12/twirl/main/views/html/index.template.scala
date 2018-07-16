
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
    <body></body>

         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                            <br>
                            """),_display_(/*26.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*26.119*/ {_display_(Seq[Any](format.raw/*26.121*/("""
                                """),_display_(/*27.34*/CSRF/*27.38*/.formField),format.raw/*27.48*/("""
                                """),format.raw/*28.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                        <div class="form-group">
                               
                                """),_display_(/*31.34*/inputText(itemForm("message"),'_label -> "Add new item", 'size -> 40)),format.raw/*31.103*/("""
                                
                    
                                """),format.raw/*34.33*/("""<input type="submit" value="Add task" class="btn btn-secondary">
                    
                                 
                                </div>
                                </form>                
                            <h1>To-Do</h1>

                     """),_display_(/*41.23*/for(a <- items) yield /*41.38*/{_display_(Seq[Any](format.raw/*41.39*/("""
            
                       
                            """),_display_(/*44.30*/defining(true)/*44.44*/ { compare =>_display_(Seq[Any](format.raw/*44.57*/("""  
                                """),_display_(/*45.34*/if(a.getCompleted()== compare)/*45.64*/ {_display_(Seq[Any](format.raw/*45.66*/("""
                                    """),format.raw/*46.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*47.80*/routes/*47.86*/.HomeController.changeStatus(a.getId())),format.raw/*47.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*47.163*/routes/*47.169*/.HomeController.delete(a.getId())),format.raw/*47.202*/("""">Delete</a></div>  
                                              
                                            <div class="card-body">
                                    <h5 class="card-title text-dark"><strike>"""),_display_(/*50.79*/a/*50.80*/.getMessage()),format.raw/*50.93*/("""</strike></h5>
                                     <h5 class="card-title text-dark"><strike>"""),_display_(/*51.80*/a/*51.81*/.isToday()),format.raw/*51.91*/("""</strike></h5>
                                    </div>
                                    </div>
                    
                    """)))}),format.raw/*55.22*/("""
                """)))}),format.raw/*56.18*/("""   
                            """),_display_(/*57.30*/defining(false)/*57.45*/ { compare =>_display_(Seq[Any](format.raw/*57.58*/("""  
                                 """),_display_(/*58.35*/if(a.getCompleted()== compare)/*58.65*/ {_display_(Seq[Any](format.raw/*58.67*/("""
                                    """),format.raw/*59.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*60.80*/routes/*60.86*/.HomeController.changeStatus(a.getId())),format.raw/*60.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*60.161*/routes/*60.167*/.HomeController.delete(a.getId())),format.raw/*60.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*63.79*/a/*63.80*/.getMessage()),format.raw/*63.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*67.35*/("""
                                """)))}),format.raw/*68.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*74.10*/("""
    """),format.raw/*75.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*81.14*/("""

    """),format.raw/*83.5*/("""</body>
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
                  DATE: Mon Jul 16 16:19:55 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: a56b1dd18c18b553640967487cba4c45054902a2
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2439->1127|2538->1216|2579->1218|2640->1252|2653->1256|2684->1266|2745->1299|2967->1494|3058->1563|3173->1650|3481->1931|3512->1946|3551->1947|3645->2014|3668->2028|3719->2041|3782->2077|3821->2107|3861->2109|3926->2146|4097->2290|4112->2296|4173->2335|4239->2373|4255->2379|4310->2412|4551->2626|4561->2627|4595->2640|4716->2734|4726->2735|4757->2745|4931->2888|4980->2906|5040->2939|5064->2954|5115->2967|5179->3004|5218->3034|5258->3036|5323->3073|5494->3217|5509->3223|5570->3262|5634->3298|5650->3304|5705->3337|5944->3549|5954->3550|5988->3563|6150->3694|6215->3728|6327->3809|6359->3814|6457->3881|6490->3887
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|64->34|71->41|71->41|71->41|74->44|74->44|74->44|75->45|75->45|75->45|76->46|77->47|77->47|77->47|77->47|77->47|77->47|80->50|80->50|80->50|81->51|81->51|81->51|85->55|86->56|87->57|87->57|87->57|88->58|88->58|88->58|89->59|90->60|90->60|90->60|90->60|90->60|90->60|93->63|93->63|93->63|97->67|98->68|104->74|105->75|111->81|113->83
                  -- GENERATED --
              */
          