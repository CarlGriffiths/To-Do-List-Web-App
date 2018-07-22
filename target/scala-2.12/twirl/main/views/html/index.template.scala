
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
                                    """),format.raw/*74.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*75.80*/routes/*75.86*/.HomeController.changeStatus(a.getId())),format.raw/*75.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*75.161*/routes/*75.167*/.HomeController.delete(a.getId())),format.raw/*75.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*78.79*/a/*78.80*/.getMessage()),format.raw/*78.93*/("""</h5>
                                        </div>
                                    </div>
                                 """)))}),format.raw/*81.35*/("""
                           """)))}),format.raw/*82.29*/("""
                           
                  

                        """)))}),format.raw/*86.26*/("""

                     """)))}),format.raw/*88.23*/("""

                     """),format.raw/*90.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*94.24*/for(f <- items) yield /*94.39*/{_display_(Seq[Any](format.raw/*94.40*/("""

                       
                        """),_display_(/*97.26*/if(f.isToday() == false)/*97.50*/{_display_(Seq[Any](format.raw/*97.51*/("""

                           
                            """),_display_(/*100.30*/defining(false)/*100.45*/ { compare =>_display_(Seq[Any](format.raw/*100.58*/("""  
                                 """),_display_(/*101.35*/if(f.getCompleted()== compare)/*101.65*/ {_display_(Seq[Any](format.raw/*101.67*/("""
                                    """),format.raw/*102.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*103.80*/routes/*103.86*/.HomeController.changeStatus(f.getId())),format.raw/*103.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*103.161*/routes/*103.167*/.HomeController.delete(f.getId())),format.raw/*103.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*106.79*/f/*106.80*/.getMessage()),format.raw/*106.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*110.35*/("""
                          
                            """)))}),format.raw/*112.30*/("""
                        """)))}),format.raw/*113.26*/("""

                      """)))}),format.raw/*115.24*/("""

                     

                            """),format.raw/*119.29*/("""</center>
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
                  DATE: Sun Jul 22 22:17:28 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 2d4e5b5b6d2c9557fe14092f55914379204ae056
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|3151->1839|3250->1928|3291->1930|3352->1964|3365->1968|3396->1978|3457->2011|3676->2203|3767->2272|3882->2359|4187->2633|4265->2683|4364->2755|4395->2770|4434->2771|4511->2821|4543->2844|4582->2845|4639->2875|4663->2890|4714->2903|4778->2940|4817->2970|4857->2972|4922->3009|5093->3153|5108->3159|5169->3198|5233->3234|5249->3240|5304->3273|5543->3485|5553->3486|5587->3499|5748->3629|5808->3658|5913->3732|5968->3756|6019->3779|6120->3853|6151->3868|6190->3869|6268->3920|6301->3944|6340->3945|6427->4004|6452->4019|6504->4032|6569->4069|6609->4099|6650->4101|6716->4138|6888->4282|6904->4288|6966->4327|7031->4363|7048->4369|7104->4402|7344->4614|7355->4615|7390->4628|7553->4759|7642->4816|7700->4842|7757->4867|7839->4920
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|78->48|78->48|78->48|79->49|79->49|79->49|80->50|83->53|83->53|86->56|92->62|94->64|97->67|97->67|97->67|100->70|100->70|100->70|102->72|102->72|102->72|103->73|103->73|103->73|104->74|105->75|105->75|105->75|105->75|105->75|105->75|108->78|108->78|108->78|111->81|112->82|116->86|118->88|120->90|124->94|124->94|124->94|127->97|127->97|127->97|130->100|130->100|130->100|131->101|131->101|131->101|132->102|133->103|133->103|133->103|133->103|133->103|133->103|136->106|136->106|136->106|140->110|142->112|143->113|145->115|149->119
                  -- GENERATED --
              */
          