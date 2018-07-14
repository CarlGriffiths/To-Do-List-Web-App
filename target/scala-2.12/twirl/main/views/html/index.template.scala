
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
                    
                                """),format.raw/*33.33*/("""<input type="submit" value="Add" class="btn btn-secondary">
                    
                                 
                                </div>
                                </form>                
                            <h1>To-Do</h1>

        """),_display_(/*40.10*/for(a <- items) yield /*40.25*/{_display_(Seq[Any](format.raw/*40.26*/("""
            
            
                            """),_display_(/*43.30*/defining(true)/*43.44*/ { compare =>_display_(Seq[Any](format.raw/*43.57*/("""  
                                """),_display_(/*44.34*/if(a.getCompleted()== compare)/*44.64*/ {_display_(Seq[Any](format.raw/*44.66*/("""
                                    """),format.raw/*45.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*46.80*/routes/*46.86*/.HomeController.changeStatus(a.getId())),format.raw/*46.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*46.163*/routes/*46.169*/.HomeController.delete(a.getId())),format.raw/*46.202*/("""">Delete</a></div>  
                                              
                                            <div class="card-body">
                      <h5 class="card-title text-dark"><strike>"""),_display_(/*49.65*/a/*49.66*/.getMessage()),format.raw/*49.79*/("""</strike></h5>
                      </div>
                      </div>
                    
                    """)))}),format.raw/*53.22*/("""
                """)))}),format.raw/*54.18*/("""   
                            """),_display_(/*55.30*/defining(false)/*55.45*/ { compare =>_display_(Seq[Any](format.raw/*55.58*/("""  
                                 """),_display_(/*56.35*/if(a.getCompleted()== compare)/*56.65*/ {_display_(Seq[Any](format.raw/*56.67*/("""
                                    """),format.raw/*57.37*/("""<div class="card border-primary mb-3" style="max-width: 30rem;">
                                            <div class="card-header"><a href=""""),_display_(/*58.80*/routes/*58.86*/.HomeController.changeStatus(a.getId())),format.raw/*58.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*58.161*/routes/*58.167*/.HomeController.delete(a.getId())),format.raw/*58.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*61.79*/a/*61.80*/.getMessage()),format.raw/*61.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*65.35*/("""
                                """)))}),format.raw/*66.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*72.10*/("""
    """),format.raw/*73.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*79.14*/("""

    """),format.raw/*81.5*/("""</body>
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
                  DATE: Sat Jul 14 12:18:35 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 63a98fe963f7b0b5530eae029e6c81b43542cb3c
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2439->1127|2538->1216|2579->1218|2640->1252|2653->1256|2684->1266|2745->1299|2967->1494|3058->1563|3140->1617|3430->1880|3461->1895|3500->1896|3583->1952|3606->1966|3657->1979|3720->2015|3759->2045|3799->2047|3864->2084|4035->2228|4050->2234|4111->2273|4177->2311|4193->2317|4248->2350|4475->2550|4485->2551|4519->2564|4665->2679|4714->2697|4774->2730|4798->2745|4849->2758|4913->2795|4952->2825|4992->2827|5057->2864|5228->3008|5243->3014|5304->3053|5368->3089|5384->3095|5439->3128|5678->3340|5688->3341|5722->3354|5884->3485|5949->3519|6061->3600|6093->3605|6191->3672|6224->3678
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|63->33|70->40|70->40|70->40|73->43|73->43|73->43|74->44|74->44|74->44|75->45|76->46|76->46|76->46|76->46|76->46|76->46|79->49|79->49|79->49|83->53|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|88->58|88->58|88->58|88->58|88->58|88->58|91->61|91->61|91->61|95->65|96->66|102->72|103->73|109->79|111->81
                  -- GENERATED --
              */
          