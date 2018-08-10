
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

  <!-- Grey with black text -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href=".">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/completed">Completed</a>
      </li>
      
    </ul>
  </nav>
            

              


         
        <div class="row">
                <div class="col-12">
                    <center>
                            <br>
                            """),_display_(/*54.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*54.119*/ {_display_(Seq[Any](format.raw/*54.121*/("""
                                """),_display_(/*55.34*/CSRF/*55.38*/.formField),format.raw/*55.48*/("""
                                """),format.raw/*56.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*61.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*61.136*/("""

                                
                                
                    
                                """),format.raw/*66.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*73.30*/("""
                     
                    """),format.raw/*75.21*/("""<center> 
                     <a href=""""),_display_(/*76.32*/routes/*76.38*/.HomeController.index(0)),format.raw/*76.62*/("""">All |</a>
                     """),_display_(/*77.23*/for(c <- cat) yield /*77.36*/{_display_(Seq[Any](format.raw/*77.37*/("""
                    """),format.raw/*78.21*/("""<a href=""""),_display_(/*78.31*/routes/*78.37*/.HomeController.index(c.getId)),format.raw/*78.67*/("""">"""),_display_(/*78.70*/c/*78.71*/.getName()),format.raw/*78.81*/(""" """),format.raw/*78.82*/("""|</a>

                    """)))}),format.raw/*80.22*/("""    
                    """),format.raw/*81.21*/("""<hr>
                </div>  
                <div class="col-6">
                    <center>
                    <h3>Due today</h3>
                       


                     """),_display_(/*89.23*/for(a <- items) yield /*89.38*/{_display_(Seq[Any](format.raw/*89.39*/("""

                       
                       """),_display_(/*92.25*/if(a.isToday() == true)/*92.48*/{_display_(Seq[Any](format.raw/*92.49*/("""

                           """),_display_(/*94.29*/defining(false)/*94.44*/ { compare =>_display_(Seq[Any](format.raw/*94.57*/("""  
                                 """),_display_(/*95.35*/if(a.getCompleted()== compare)/*95.65*/ {_display_(Seq[Any](format.raw/*95.67*/("""
                                    """),format.raw/*96.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*102.80*/a/*102.81*/.getMessage()),format.raw/*102.94*/("""</h5>
                                                    <p style="float: center">"""),_display_(/*103.79*/a/*103.80*/.getCat().getName()),format.raw/*103.99*/("""</p>
                                                </div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*108.59*/routes/*108.65*/.HomeController.delete(a.getId())),format.raw/*108.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*112.60*/routes/*112.66*/.HomeController.changeStatus(a.getId())),format.raw/*112.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*115.59*/routes/*115.65*/.HomeController.edit(a.getId())),format.raw/*115.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*121.35*/("""
                           """)))}),format.raw/*122.29*/("""
                           
                  

                        """)))}),format.raw/*126.26*/("""

                     """)))}),format.raw/*128.23*/("""
                     
                    """),format.raw/*130.21*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*136.24*/for(f <- items) yield /*136.39*/{_display_(Seq[Any](format.raw/*136.40*/("""

                       
                        """),_display_(/*139.26*/if(f.hasDatePassed() == false)/*139.56*/{_display_(Seq[Any](format.raw/*139.57*/("""

                           
                            """),_display_(/*142.30*/defining(false)/*142.45*/ { compare =>_display_(Seq[Any](format.raw/*142.58*/("""  
                                 """),_display_(/*143.35*/if(f.getCompleted()== compare)/*143.65*/ {_display_(Seq[Any](format.raw/*143.67*/("""
                                    """),format.raw/*144.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*149.80*/f/*149.81*/.getMessage()),format.raw/*149.94*/("""</h5>
                                                    <p style="float: center">"""),_display_(/*150.79*/f/*150.80*/.getCat().getName()),format.raw/*150.99*/("""</p>
                                                    
                                                </div>
                                                <hr />
                                            <a href=""""),_display_(/*154.55*/routes/*154.61*/.HomeController.delete(f.getId())),format.raw/*154.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*158.60*/routes/*158.66*/.HomeController.changeStatus(f.getId())),format.raw/*158.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*161.59*/routes/*161.65*/.HomeController.edit(f.getId())),format.raw/*161.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*166.35*/("""
                          
                            """)))}),format.raw/*168.30*/("""
                        """)))}),format.raw/*169.26*/("""

                      """)))}),format.raw/*171.24*/("""

                     

                            """),format.raw/*175.29*/("""</center>
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
                  DATE: Fri Aug 10 17:56:54 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 6477c6b9478cf97a52daecd8367c30c89d1e7fcc
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1392->238|1407->244|1468->283|1976->764|1991->770|2053->811|2176->906|2205->907|2250->924|2289->935|2318->936|2364->954|2393->955|2435->969|2464->970|2502->981|3095->1547|3194->1636|3235->1638|3296->1672|3309->1676|3340->1686|3401->1719|3659->1950|3783->2052|3932->2173|4274->2484|4345->2527|4413->2568|4428->2574|4473->2598|4534->2632|4563->2645|4602->2646|4651->2667|4688->2677|4703->2683|4754->2713|4784->2716|4794->2717|4825->2727|4854->2728|4913->2756|4966->2781|5175->2963|5206->2978|5245->2979|5322->3029|5354->3052|5393->3053|5450->3083|5474->3098|5525->3111|5589->3148|5628->3178|5668->3180|5733->3217|6178->3634|6189->3635|6224->3648|6336->3732|6347->3733|6388->3752|6635->3971|6651->3977|6706->4010|6977->4253|6993->4259|7055->4298|7267->4482|7283->4488|7336->4519|7711->4862|7772->4891|7878->4965|7934->4989|8006->5032|8179->5177|8211->5192|8251->5193|8330->5244|8370->5274|8410->5275|8497->5334|8522->5349|8574->5362|8639->5399|8679->5429|8720->5431|8786->5468|9187->5841|9198->5842|9233->5855|9345->5939|9356->5940|9397->5959|9647->6181|9663->6187|9718->6220|9989->6463|10005->6469|10067->6508|10279->6692|10295->6698|10348->6729|10633->6982|10722->7039|10780->7065|10837->7090|10919->7143
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|84->54|84->54|84->54|85->55|85->55|85->55|86->56|91->61|91->61|96->66|103->73|105->75|106->76|106->76|106->76|107->77|107->77|107->77|108->78|108->78|108->78|108->78|108->78|108->78|108->78|108->78|110->80|111->81|119->89|119->89|119->89|122->92|122->92|122->92|124->94|124->94|124->94|125->95|125->95|125->95|126->96|132->102|132->102|132->102|133->103|133->103|133->103|138->108|138->108|138->108|142->112|142->112|142->112|145->115|145->115|145->115|151->121|152->122|156->126|158->128|160->130|166->136|166->136|166->136|169->139|169->139|169->139|172->142|172->142|172->142|173->143|173->143|173->143|174->144|179->149|179->149|179->149|180->150|180->150|180->150|184->154|184->154|184->154|188->158|188->158|188->158|191->161|191->161|191->161|196->166|198->168|199->169|201->171|205->175
                  -- GENERATED --
              */
          