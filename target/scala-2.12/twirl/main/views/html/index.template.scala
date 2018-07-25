
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


              <a href=""""),_display_(/*53.25*/routes/*53.31*/.HomeController.index(1)),format.raw/*53.55*/("""">Hard coding value for testing</a>


         
        <div class="row">
                <div class="col-12">
                    <center>
                            <br>
                            """),_display_(/*61.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*61.119*/ {_display_(Seq[Any](format.raw/*61.121*/("""
                                """),_display_(/*62.34*/CSRF/*62.38*/.formField),format.raw/*62.48*/("""
                                """),format.raw/*63.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*68.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*68.136*/("""

                                
                                
                    
                                """),format.raw/*73.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                </div>              
                            
                            """)))}),format.raw/*80.30*/("""
                      """),format.raw/*81.23*/("""<div class="col-12">
                    <center>      
                    <h3>Due today</h3>
                       


                     """),_display_(/*87.23*/for(a <- items) yield /*87.38*/{_display_(Seq[Any](format.raw/*87.39*/("""

                       
                       """),_display_(/*90.25*/if(a.isToday() == true)/*90.48*/{_display_(Seq[Any](format.raw/*90.49*/("""

                           """),_display_(/*92.29*/defining(false)/*92.44*/ { compare =>_display_(Seq[Any](format.raw/*92.57*/("""  
                                 """),_display_(/*93.35*/if(a.getCompleted()== compare)/*93.65*/ {_display_(Seq[Any](format.raw/*93.67*/("""
                                    """),format.raw/*94.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                            <h5 class="card-title text-dark">"""),_display_(/*99.79*/a/*99.80*/.getMessage()),format.raw/*99.93*/("""</h5>

                                            
                                                <a href=""""),_display_(/*102.59*/routes/*102.65*/.HomeController.delete(a.getId())),format.raw/*102.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*106.60*/routes/*106.66*/.HomeController.changeStatus(a.getId())),format.raw/*106.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*112.35*/("""
                           """)))}),format.raw/*113.29*/("""
                           
                  

                        """)))}),format.raw/*117.26*/("""

                     """)))}),format.raw/*119.23*/("""

                     """),format.raw/*121.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*125.24*/for(f <- items) yield /*125.39*/{_display_(Seq[Any](format.raw/*125.40*/("""

                       
                        """),_display_(/*128.26*/if(f.isToday() == false)/*128.50*/{_display_(Seq[Any](format.raw/*128.51*/("""

                           
                            """),_display_(/*131.30*/defining(false)/*131.45*/ { compare =>_display_(Seq[Any](format.raw/*131.58*/("""  
                                 """),_display_(/*132.35*/if(f.getCompleted()== compare)/*132.65*/ {_display_(Seq[Any](format.raw/*132.67*/("""
                                    """),format.raw/*133.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*137.79*/f/*137.80*/.getMessage()),format.raw/*137.93*/("""</h5>
                                            <a href=""""),_display_(/*138.55*/routes/*138.61*/.HomeController.delete(f.getId())),format.raw/*138.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*142.60*/routes/*142.66*/.HomeController.changeStatus(f.getId())),format.raw/*142.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*147.35*/("""
                          
                            """)))}),format.raw/*149.30*/("""
                        """)))}),format.raw/*150.26*/("""

                      """)))}),format.raw/*152.24*/("""

                     

                            """),format.raw/*156.29*/("""</center>
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
                  DATE: Wed Jul 25 23:13:59 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 8d7fc8442a93ae151ce750b9d31714b8ce645573
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2292->979|2321->980|2366->997|2405->1008|2434->1009|2480->1027|2509->1028|2551->1042|2580->1043|2618->1054|3421->1830|3436->1836|3481->1860|3710->2062|3809->2151|3850->2153|3911->2187|3924->2191|3955->2201|4016->2234|4274->2465|4398->2567|4547->2688|4897->3007|4948->3030|5118->3173|5149->3188|5188->3189|5265->3239|5297->3262|5336->3263|5393->3293|5417->3308|5468->3321|5532->3358|5571->3388|5611->3390|5676->3427|6048->3772|6058->3773|6092->3786|6230->3896|6246->3902|6301->3935|6572->4178|6588->4184|6650->4223|7022->4563|7083->4592|7189->4666|7245->4690|7297->4713|7399->4787|7431->4802|7471->4803|7550->4854|7584->4878|7624->4879|7711->4938|7736->4953|7788->4966|7853->5003|7893->5033|7934->5035|8000->5072|8329->5373|8340->5374|8375->5387|8463->5447|8479->5453|8534->5486|8805->5729|8821->5735|8883->5774|9165->6024|9254->6081|9312->6107|9369->6132|9451->6185
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|83->53|83->53|83->53|91->61|91->61|91->61|92->62|92->62|92->62|93->63|98->68|98->68|103->73|110->80|111->81|117->87|117->87|117->87|120->90|120->90|120->90|122->92|122->92|122->92|123->93|123->93|123->93|124->94|129->99|129->99|129->99|132->102|132->102|132->102|136->106|136->106|136->106|142->112|143->113|147->117|149->119|151->121|155->125|155->125|155->125|158->128|158->128|158->128|161->131|161->131|161->131|162->132|162->132|162->132|163->133|167->137|167->137|167->137|168->138|168->138|168->138|172->142|172->142|172->142|177->147|179->149|180->150|182->152|186->156
                  -- GENERATED --
              */
          