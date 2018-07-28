
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
                                            
                                                <div style="clear: both">
                                                    <h4 style="float: center">"""),_display_(/*106.80*/a/*106.81*/.getMessage()),format.raw/*106.94*/("""</h4>
                                                    <p style="float: center">"""),_display_(/*107.79*/a/*107.80*/.getCat().getName()),format.raw/*107.99*/("""</p>
                                                </div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*112.59*/routes/*112.65*/.HomeController.delete(a.getId())),format.raw/*112.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*116.60*/routes/*116.66*/.HomeController.changeStatus(a.getId())),format.raw/*116.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*119.59*/routes/*119.65*/.HomeController.edit(a.getId())),format.raw/*119.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*125.35*/("""
                           """)))}),format.raw/*126.29*/("""
                           
                  

                        """)))}),format.raw/*130.26*/("""

                     """)))}),format.raw/*132.23*/("""

                     """),format.raw/*134.22*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*138.24*/for(f <- items) yield /*138.39*/{_display_(Seq[Any](format.raw/*138.40*/("""

                       
                        """),_display_(/*141.26*/if(f.isToday() == false)/*141.50*/{_display_(Seq[Any](format.raw/*141.51*/("""

                           
                            """),_display_(/*144.30*/defining(false)/*144.45*/ { compare =>_display_(Seq[Any](format.raw/*144.58*/("""  
                                 """),_display_(/*145.35*/if(f.getCompleted()== compare)/*145.65*/ {_display_(Seq[Any](format.raw/*145.67*/("""
                                    """),format.raw/*146.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h4 style="float: center">"""),_display_(/*151.80*/f/*151.81*/.getMessage()),format.raw/*151.94*/("""</h4>
                                                    <p style="float: center">"""),_display_(/*152.79*/f/*152.80*/.getCat().getName()),format.raw/*152.99*/("""</p>
                                                </div>
                                                <hr />
                                            <a href=""""),_display_(/*155.55*/routes/*155.61*/.HomeController.delete(f.getId())),format.raw/*155.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*159.60*/routes/*159.66*/.HomeController.changeStatus(f.getId())),format.raw/*159.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*162.59*/routes/*162.65*/.HomeController.edit(f.getId())),format.raw/*162.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*167.35*/("""
                          
                            """)))}),format.raw/*169.30*/("""
                        """)))}),format.raw/*170.26*/("""

                      """)))}),format.raw/*172.24*/("""

                     

                            """),format.raw/*176.29*/("""</center>
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
                  DATE: Sat Jul 28 12:27:10 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: bd701107a4ac3dab22d5403173133dc19feeea2f
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1378->224|1393->230|1456->271|1544->332|1559->338|1620->377|2128->858|2143->864|2205->905|2328->1000|2357->1001|2402->1018|2441->1029|2470->1030|2516->1048|2545->1049|2587->1063|2616->1064|2654->1075|3626->2020|3725->2109|3766->2111|3827->2145|3840->2149|3871->2159|3932->2192|4190->2423|4314->2525|4463->2646|4813->2965|4864->2988|4973->3070|4988->3076|5033->3100|5094->3134|5123->3147|5162->3148|5211->3169|5248->3179|5263->3185|5314->3215|5344->3218|5354->3219|5385->3229|5414->3230|5473->3258|5526->3283|5645->3375|5676->3390|5715->3391|5792->3441|5824->3464|5863->3465|5920->3495|5944->3510|5995->3523|6059->3560|6098->3590|6138->3592|6204->3629|6652->4049|6663->4050|6698->4063|6810->4147|6821->4148|6862->4167|7109->4386|7125->4392|7180->4425|7451->4668|7467->4674|7529->4713|7741->4897|7757->4903|7810->4934|8185->5277|8246->5306|8352->5380|8408->5404|8460->5427|8562->5501|8594->5516|8634->5517|8713->5568|8747->5592|8787->5593|8874->5652|8899->5667|8951->5680|9016->5717|9056->5747|9097->5749|9163->5786|9567->6162|9578->6163|9613->6176|9725->6260|9736->6261|9777->6280|9974->6449|9990->6455|10045->6488|10316->6731|10332->6737|10394->6776|10606->6960|10622->6966|10675->6997|10960->7250|11049->7307|11107->7333|11164->7358|11246->7411
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|91->61|91->61|91->61|92->62|92->62|92->62|93->63|98->68|98->68|103->73|110->80|111->81|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|115->85|115->85|115->85|115->85|115->85|117->87|118->88|123->93|123->93|123->93|126->96|126->96|126->96|128->98|128->98|128->98|129->99|129->99|129->99|130->100|136->106|136->106|136->106|137->107|137->107|137->107|142->112|142->112|142->112|146->116|146->116|146->116|149->119|149->119|149->119|155->125|156->126|160->130|162->132|164->134|168->138|168->138|168->138|171->141|171->141|171->141|174->144|174->144|174->144|175->145|175->145|175->145|176->146|181->151|181->151|181->151|182->152|182->152|182->152|185->155|185->155|185->155|189->159|189->159|189->159|192->162|192->162|192->162|197->167|199->169|200->170|202->172|206->176
                  -- GENERATED --
              */
          