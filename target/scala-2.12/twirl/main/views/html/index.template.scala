
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
                                """),_display_(/*32.34*/inputDate(itemForm("date"),'_label -> "Add new item", 'size -> 40)),format.raw/*32.100*/("""
                    
                                """),format.raw/*34.33*/("""<input type="submit" value="Add" class="btn btn-secondary">
                    
                                 
                                </div>
                                </form>                
                            <h1>To-Do</h1>

        """),_display_(/*41.10*/for(a <- items) yield /*41.25*/{_display_(Seq[Any](format.raw/*41.26*/("""
            
            
                            """),_display_(/*44.30*/defining(true)/*44.44*/ { compare =>_display_(Seq[Any](format.raw/*44.57*/("""  
                                """),_display_(/*45.34*/if(a.getCompleted()== compare)/*45.64*/ {_display_(Seq[Any](format.raw/*45.66*/("""
                                    """),format.raw/*46.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*47.80*/routes/*47.86*/.HomeController.changeStatus(a.getId())),format.raw/*47.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*47.163*/routes/*47.169*/.HomeController.delete(a.getId())),format.raw/*47.202*/("""">Delete</a></div>  
                                              
                                            <div class="card-body">
                      <h5 class="card-title text-dark"><strike>"""),_display_(/*50.65*/a/*50.66*/.getMessage()),format.raw/*50.79*/("""</strike></h5>
                      </div>
                      </div>
                    
                    """)))}),format.raw/*54.22*/("""
                """)))}),format.raw/*55.18*/("""   
                            """),_display_(/*56.30*/defining(false)/*56.45*/ { compare =>_display_(Seq[Any](format.raw/*56.58*/("""  
                                 """),_display_(/*57.35*/if(a.getCompleted()== compare)/*57.65*/ {_display_(Seq[Any](format.raw/*57.67*/("""
                                    """),format.raw/*58.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*59.80*/routes/*59.86*/.HomeController.changeStatus(a.getId())),format.raw/*59.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*59.161*/routes/*59.167*/.HomeController.delete(a.getId())),format.raw/*59.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*62.79*/a/*62.80*/.getMessage()),format.raw/*62.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*66.35*/("""
                                """)))}),format.raw/*67.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*73.10*/("""
    """),format.raw/*74.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*80.14*/("""

    """),format.raw/*82.5*/("""</body>
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
                  DATE: Sun Jul 15 23:47:26 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 96379392c68cc02e565bd1c2455571dd70aca3fd
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2439->1127|2538->1216|2579->1218|2640->1252|2653->1256|2684->1266|2745->1299|2967->1494|3058->1563|3119->1597|3207->1663|3289->1717|3579->1980|3610->1995|3649->1996|3732->2052|3755->2066|3806->2079|3869->2115|3908->2145|3948->2147|4013->2184|4184->2328|4199->2334|4260->2373|4326->2411|4342->2417|4397->2450|4624->2650|4634->2651|4668->2664|4814->2779|4863->2797|4923->2830|4947->2845|4998->2858|5062->2895|5101->2925|5141->2927|5206->2964|5377->3108|5392->3114|5453->3153|5517->3189|5533->3195|5588->3228|5827->3440|5837->3441|5871->3454|6033->3585|6098->3619|6210->3700|6242->3705|6340->3772|6373->3778
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|62->32|62->32|64->34|71->41|71->41|71->41|74->44|74->44|74->44|75->45|75->45|75->45|76->46|77->47|77->47|77->47|77->47|77->47|77->47|80->50|80->50|80->50|84->54|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|89->59|89->59|89->59|89->59|89->59|89->59|92->62|92->62|92->62|96->66|97->67|103->73|104->74|110->80|112->82
                  -- GENERATED --
              */
          