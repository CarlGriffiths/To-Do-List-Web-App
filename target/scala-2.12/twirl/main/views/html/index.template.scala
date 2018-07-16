
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
                            
                             <h3>Due today</h3>

                     """),_display_(/*42.23*/for(a <- items) yield /*42.38*/{_display_(Seq[Any](format.raw/*42.39*/("""

                       
                       """),_display_(/*45.25*/if(a.isToday() == true)/*45.48*/{_display_(Seq[Any](format.raw/*45.49*/("""

                           
                            """),_display_(/*48.30*/defining(true)/*48.44*/ { compare =>_display_(Seq[Any](format.raw/*48.57*/("""  
                                """),_display_(/*49.34*/if(a.getCompleted()== compare)/*49.64*/ {_display_(Seq[Any](format.raw/*49.66*/("""
                                    """),format.raw/*50.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*51.80*/routes/*51.86*/.HomeController.changeStatus(a.getId())),format.raw/*51.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*51.163*/routes/*51.169*/.HomeController.delete(a.getId())),format.raw/*51.202*/("""">Delete</a></div>  
                                              
                                            <div class="card-body">
                                    <h5 class="card-title text-dark"><strike>"""),_display_(/*54.79*/a/*54.80*/.getMessage()),format.raw/*54.93*/("""</strike></h5>
                                     
                                    </div>
                                    </div>
                    
                    """)))}),format.raw/*59.22*/("""
                """)))}),format.raw/*60.18*/("""   
                            """),_display_(/*61.30*/defining(false)/*61.45*/ { compare =>_display_(Seq[Any](format.raw/*61.58*/("""  
                                 """),_display_(/*62.35*/if(a.getCompleted()== compare)/*62.65*/ {_display_(Seq[Any](format.raw/*62.67*/("""
                                    """),format.raw/*63.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*64.80*/routes/*64.86*/.HomeController.changeStatus(a.getId())),format.raw/*64.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*64.161*/routes/*64.167*/.HomeController.delete(a.getId())),format.raw/*64.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*67.79*/a/*67.80*/.getMessage()),format.raw/*67.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*71.35*/("""
                                """)))}),format.raw/*72.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*78.10*/("""

                     """)))}),format.raw/*80.23*/("""

                     """),format.raw/*82.22*/("""<h3>Due in future</h3>


                      """),_display_(/*85.24*/for(f <- items) yield /*85.39*/{_display_(Seq[Any](format.raw/*85.40*/("""

                       
                       """),_display_(/*88.25*/if(f.isToday() == false)/*88.49*/{_display_(Seq[Any](format.raw/*88.50*/("""

                           
                            """),_display_(/*91.30*/defining(true)/*91.44*/ { compare =>_display_(Seq[Any](format.raw/*91.57*/("""  
                                """),_display_(/*92.34*/if(f.getCompleted()== compare)/*92.64*/ {_display_(Seq[Any](format.raw/*92.66*/("""
                                    """),format.raw/*93.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*94.80*/routes/*94.86*/.HomeController.changeStatus(f.getId())),format.raw/*94.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*94.163*/routes/*94.169*/.HomeController.delete(f.getId())),format.raw/*94.202*/("""">Delete</a></div>  
                                              
                                            <div class="card-body">
                                    <h5 class="card-title text-dark"><strike>"""),_display_(/*97.79*/f/*97.80*/.getMessage()),format.raw/*97.93*/("""</strike></h5>
                                     
                                    </div>
                                    </div>
                    
                    """)))}),format.raw/*102.22*/("""
                """)))}),format.raw/*103.18*/("""   
                            """),_display_(/*104.30*/defining(false)/*104.45*/ { compare =>_display_(Seq[Any](format.raw/*104.58*/("""  
                                 """),_display_(/*105.35*/if(f.getCompleted()== compare)/*105.65*/ {_display_(Seq[Any](format.raw/*105.67*/("""
                                    """),format.raw/*106.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*107.80*/routes/*107.86*/.HomeController.changeStatus(f.getId())),format.raw/*107.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*107.161*/routes/*107.167*/.HomeController.delete(f.getId())),format.raw/*107.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*110.79*/f/*110.80*/.getMessage()),format.raw/*110.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*114.35*/("""
                                """)))}),format.raw/*115.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*121.10*/("""

                     """)))}),format.raw/*123.23*/("""

    """),format.raw/*125.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*131.14*/("""

    """),format.raw/*133.5*/("""</body>
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
                  DATE: Mon Jul 16 16:43:36 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 0478344dadda951b5bf1610bfb64a1d441cde07f
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2439->1127|2538->1216|2579->1218|2640->1252|2653->1256|2684->1266|2745->1299|2967->1494|3058->1563|3173->1650|3515->1965|3546->1980|3585->1981|3662->2031|3694->2054|3733->2055|3819->2114|3842->2128|3893->2141|3956->2177|3995->2207|4035->2209|4100->2246|4271->2390|4286->2396|4347->2435|4413->2473|4429->2479|4484->2512|4725->2726|4735->2727|4769->2740|4981->2921|5030->2939|5090->2972|5114->2987|5165->3000|5229->3037|5268->3067|5308->3069|5373->3106|5544->3250|5559->3256|5620->3295|5684->3331|5700->3337|5755->3370|5994->3582|6004->3583|6038->3596|6200->3727|6265->3761|6377->3842|6432->3866|6483->3889|6558->3937|6589->3952|6628->3953|6705->4003|6738->4027|6777->4028|6863->4087|6886->4101|6937->4114|7000->4150|7039->4180|7079->4182|7144->4219|7315->4363|7330->4369|7391->4408|7457->4446|7473->4452|7528->4485|7769->4699|7779->4700|7813->4713|8026->4894|8076->4912|8137->4945|8162->4960|8214->4973|8279->5010|8319->5040|8360->5042|8426->5079|8598->5223|8614->5229|8676->5268|8741->5304|8758->5310|8814->5343|9054->5555|9065->5556|9100->5569|9263->5700|9329->5734|9442->5815|9498->5839|9532->5845|9631->5912|9665->5918
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|64->34|72->42|72->42|72->42|75->45|75->45|75->45|78->48|78->48|78->48|79->49|79->49|79->49|80->50|81->51|81->51|81->51|81->51|81->51|81->51|84->54|84->54|84->54|89->59|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|94->64|94->64|94->64|94->64|94->64|94->64|97->67|97->67|97->67|101->71|102->72|108->78|110->80|112->82|115->85|115->85|115->85|118->88|118->88|118->88|121->91|121->91|121->91|122->92|122->92|122->92|123->93|124->94|124->94|124->94|124->94|124->94|124->94|127->97|127->97|127->97|132->102|133->103|134->104|134->104|134->104|135->105|135->105|135->105|136->106|137->107|137->107|137->107|137->107|137->107|137->107|140->110|140->110|140->110|144->114|145->115|151->121|153->123|155->125|161->131|163->133
                  -- GENERATED --
              */
          