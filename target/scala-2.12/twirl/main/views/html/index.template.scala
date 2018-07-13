
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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    </head>
    <body>

         
        <div class="row">
                <div class="col-12 center-block">
                    <center>
                            <br>
                            """),_display_(/*26.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*26.119*/ {_display_(Seq[Any](format.raw/*26.121*/("""
                                """),_display_(/*27.34*/CSRF/*27.38*/.formField),format.raw/*27.48*/("""
                                """),format.raw/*28.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                        <div class="form-group">
                               
                                """),_display_(/*31.34*/inputText(itemForm("message"),'_label -> "Add new item", 'size -> 40)),format.raw/*31.103*/("""
                    
                                """),format.raw/*33.33*/("""<input type="submit" value="Add" class="btn btn-secondary">
                    
                                 
                                </div>
                                </form>                
                            <h1>To-Do</h1>

        """),_display_(/*40.10*/for(a <- items) yield /*40.25*/{_display_(Seq[Any](format.raw/*40.26*/("""
            
            
                            """),_display_(/*43.30*/defining(true)/*43.44*/ { compare =>_display_(Seq[Any](format.raw/*43.57*/("""  
                                """),_display_(/*44.34*/if(a.getCompleted()== compare)/*44.64*/ {_display_(Seq[Any](format.raw/*44.66*/("""
                                    """),format.raw/*45.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*46.80*/routes/*46.86*/.HomeController.changeStatus(a.getId())),format.raw/*46.125*/("""">Mark as uncompleted</a></div>  
                                            <div class="card-body">
                      <h5 class="card-title text-dark"><strike>"""),_display_(/*48.65*/a/*48.66*/.getMessage()),format.raw/*48.79*/("""</strike></h5>
                      </div>
                      </div>
                    
                    """)))}),format.raw/*52.22*/("""
                """)))}),format.raw/*53.18*/("""   
                            """),_display_(/*54.30*/defining(false)/*54.45*/ { compare =>_display_(Seq[Any](format.raw/*54.58*/("""  
                                 """),_display_(/*55.35*/if(a.getCompleted()== compare)/*55.65*/ {_display_(Seq[Any](format.raw/*55.67*/("""
                                    """),format.raw/*56.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*57.80*/routes/*57.86*/.HomeController.changeStatus(a.getId())),format.raw/*57.125*/("""">Mark as completed</a></div>  
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*59.79*/a/*59.80*/.getMessage()),format.raw/*59.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*63.35*/("""
                                """)))}),format.raw/*64.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*70.10*/("""
    """),format.raw/*71.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*77.14*/("""

    """),format.raw/*79.5*/("""</body>
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
                  DATE: Fri Jul 13 20:27:41 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 72eb386296d63e41e72bd0084418323dd63c98ee
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2432->1120|2531->1209|2572->1211|2633->1245|2646->1249|2677->1259|2738->1292|2960->1487|3051->1556|3133->1610|3423->1873|3454->1888|3493->1889|3576->1945|3599->1959|3650->1972|3713->2008|3752->2038|3792->2040|3857->2077|4028->2221|4043->2227|4104->2266|4297->2432|4307->2433|4341->2446|4487->2561|4536->2579|4596->2612|4620->2627|4671->2640|4735->2677|4774->2707|4814->2709|4879->2746|5050->2890|5065->2896|5126->2935|5331->3113|5341->3114|5375->3127|5537->3258|5602->3292|5714->3373|5746->3378|5844->3445|5877->3451
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|63->33|70->40|70->40|70->40|73->43|73->43|73->43|74->44|74->44|74->44|75->45|76->46|76->46|76->46|78->48|78->48|78->48|82->52|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|87->57|87->57|87->57|89->59|89->59|89->59|93->63|94->64|100->70|101->71|107->77|109->79
                  -- GENERATED --
              */
          