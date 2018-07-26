
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
                     <a href=""""),_display_(/*83.32*/routes/*83.38*/.HomeController.index(0)),format.raw/*83.62*/("""">All |</a>
                     """),_display_(/*84.23*/for(c <- cat) yield /*84.36*/{_display_(Seq[Any](format.raw/*84.37*/("""
                    """),format.raw/*85.21*/("""<a href=""""),_display_(/*85.31*/routes/*85.37*/.HomeController.index(c.getId)),format.raw/*85.67*/("""">"""),_display_(/*85.70*/c/*85.71*/.getName()),format.raw/*85.81*/(""" """),format.raw/*85.82*/("""|</a>

                    """)))}),format.raw/*87.22*/("""    
                    """),format.raw/*88.21*/("""<hr>
                    <h3>Due today</h3>
                       


                     """),_display_(/*93.23*/for(a <- items) yield /*93.38*/{_display_(Seq[Any](format.raw/*93.39*/("""

                       
                       """),_display_(/*96.25*/if(a.isToday() == true)/*96.48*/{_display_(Seq[Any](format.raw/*96.49*/("""

                           """),_display_(/*98.29*/defining(false)/*98.44*/ { compare =>_display_(Seq[Any](format.raw/*98.57*/("""  
                                 """),_display_(/*99.35*/if(a.getCompleted()== compare)/*99.65*/ {_display_(Seq[Any](format.raw/*99.67*/("""
                                    """),format.raw/*100.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                            <h5 class="card-title text-dark">"""),_display_(/*105.79*/a/*105.80*/.getMessage()),format.raw/*105.93*/("""</h5>
                                            <p class="card-title text-secondary">"""),_display_(/*106.83*/a/*106.84*/.getCat().getName()),format.raw/*106.103*/("""</p>

                                            
                                                <a href=""""),_display_(/*109.59*/routes/*109.65*/.HomeController.delete(a.getId())),format.raw/*109.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*113.60*/routes/*113.66*/.HomeController.changeStatus(a.getId())),format.raw/*113.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*119.35*/("""
                           """)))}),format.raw/*120.29*/("""
                           
                  

                        """)))}),format.raw/*124.26*/("""

                     """)))}),format.raw/*126.23*/("""

                     """),format.raw/*128.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*132.24*/for(f <- items) yield /*132.39*/{_display_(Seq[Any](format.raw/*132.40*/("""

                       
                        """),_display_(/*135.26*/if(f.isToday() == false)/*135.50*/{_display_(Seq[Any](format.raw/*135.51*/("""

                           
                            """),_display_(/*138.30*/defining(false)/*138.45*/ { compare =>_display_(Seq[Any](format.raw/*138.58*/("""  
                                 """),_display_(/*139.35*/if(f.getCompleted()== compare)/*139.65*/ {_display_(Seq[Any](format.raw/*139.67*/("""
                                    """),format.raw/*140.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*144.79*/f/*144.80*/.getMessage()),format.raw/*144.93*/("""</h5>
                                            <p class="card-title text-secondary">"""),_display_(/*145.83*/f/*145.84*/.getCat().getName()),format.raw/*145.103*/("""</p>
                                            <a href=""""),_display_(/*146.55*/routes/*146.61*/.HomeController.delete(f.getId())),format.raw/*146.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*150.60*/routes/*150.66*/.HomeController.changeStatus(f.getId())),format.raw/*150.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*155.35*/("""
                          
                            """)))}),format.raw/*157.30*/("""
                        """)))}),format.raw/*158.26*/("""

                      """)))}),format.raw/*160.24*/("""

                     

                            """),format.raw/*164.29*/("""</center>
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
                  DATE: Thu Jul 26 02:38:02 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 1c0a0eee584cd4dd856524a8090a45e48a7db009
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1378->224|1393->230|1456->271|1544->332|1559->338|1620->377|2128->858|2143->864|2205->905|2328->1000|2357->1001|2402->1018|2441->1029|2470->1030|2516->1048|2545->1049|2587->1063|2616->1064|2654->1075|3626->2020|3725->2109|3766->2111|3827->2145|3840->2149|3871->2159|3932->2192|4190->2423|4314->2525|4463->2646|4813->2965|4864->2988|4973->3070|4988->3076|5033->3100|5094->3134|5123->3147|5162->3148|5211->3169|5248->3179|5263->3185|5314->3215|5344->3218|5354->3219|5385->3229|5414->3230|5473->3258|5526->3283|5645->3375|5676->3390|5715->3391|5792->3441|5824->3464|5863->3465|5920->3495|5944->3510|5995->3523|6059->3560|6098->3590|6138->3592|6204->3629|6577->3974|6588->3975|6623->3988|6739->4076|6750->4077|6792->4096|6929->4205|6945->4211|7000->4244|7271->4487|7287->4493|7349->4532|7721->4872|7782->4901|7888->4975|7944->4999|7996->5022|8098->5096|8130->5111|8170->5112|8249->5163|8283->5187|8323->5188|8410->5247|8435->5262|8487->5275|8552->5312|8592->5342|8633->5344|8699->5381|9028->5682|9039->5683|9074->5696|9190->5784|9201->5785|9243->5804|9330->5863|9346->5869|9401->5902|9672->6145|9688->6151|9750->6190|10032->6440|10121->6497|10179->6523|10236->6548|10318->6601
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|91->61|91->61|91->61|92->62|92->62|92->62|93->63|98->68|98->68|103->73|110->80|111->81|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|115->85|115->85|115->85|115->85|115->85|117->87|118->88|123->93|123->93|123->93|126->96|126->96|126->96|128->98|128->98|128->98|129->99|129->99|129->99|130->100|135->105|135->105|135->105|136->106|136->106|136->106|139->109|139->109|139->109|143->113|143->113|143->113|149->119|150->120|154->124|156->126|158->128|162->132|162->132|162->132|165->135|165->135|165->135|168->138|168->138|168->138|169->139|169->139|169->139|170->140|174->144|174->144|174->144|175->145|175->145|175->145|176->146|176->146|176->146|180->150|180->150|180->150|185->155|187->157|188->158|190->160|194->164
                  -- GENERATED --
              */
          