
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
                             

                     """),_display_(/*44.23*/for(a <- items) yield /*44.38*/{_display_(Seq[Any](format.raw/*44.39*/("""

                       
                       """),_display_(/*47.25*/if(a.isToday() == true)/*47.48*/{_display_(Seq[Any](format.raw/*47.49*/("""

                           
                            """),_display_(/*50.30*/defining(true)/*50.44*/ { compare =>_display_(Seq[Any](format.raw/*50.57*/("""  
                                """),_display_(/*51.34*/if(a.getCompleted()== compare)/*51.64*/ {_display_(Seq[Any](format.raw/*51.66*/("""
                                    """),format.raw/*52.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*53.80*/routes/*53.86*/.HomeController.changeStatus(a.getId())),format.raw/*53.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*53.163*/routes/*53.169*/.HomeController.delete(a.getId())),format.raw/*53.202*/("""">Delete</a><a href=""""),_display_(/*53.224*/routes/*53.230*/.HomeController.addDate(a.getId())),format.raw/*53.264*/("""">Edit</a><</div>  
                                              
                                            <div class="card-body">
                                            <a href=""""),_display_(/*56.55*/routes/*56.61*/.HomeController.changeStatus(a.getId())),format.raw/*56.100*/("""">
                                            <h5 class="card-title text-dark"><strike>"""),_display_(/*57.87*/a/*57.88*/.getMessage()),format.raw/*57.101*/("""</strike></h5>
                                     
                                    </div>
                                    </div>
                    
                                """)))}),format.raw/*62.34*/("""
                                        """)))}),format.raw/*63.42*/("""   
                            """),_display_(/*64.30*/defining(false)/*64.45*/ { compare =>_display_(Seq[Any](format.raw/*64.58*/("""  
                                 """),_display_(/*65.35*/if(a.getCompleted()== compare)/*65.65*/ {_display_(Seq[Any](format.raw/*65.67*/("""
                                    """),format.raw/*66.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*67.80*/routes/*67.86*/.HomeController.changeStatus(a.getId())),format.raw/*67.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*67.161*/routes/*67.167*/.HomeController.delete(a.getId())),format.raw/*67.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*70.79*/a/*70.80*/.getMessage()),format.raw/*70.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*74.35*/("""
                            """)))}),format.raw/*75.30*/("""
                    
                    
        
                  

                        """)))}),format.raw/*81.26*/("""

                     """)))}),format.raw/*83.23*/("""

                    """),format.raw/*85.21*/("""<hr>
                     <h3>Due in future</h3>


                      """),_display_(/*89.24*/for(f <- items) yield /*89.39*/{_display_(Seq[Any](format.raw/*89.40*/("""

                       
                       """),_display_(/*92.25*/if(f.isToday() == false)/*92.49*/{_display_(Seq[Any](format.raw/*92.50*/("""

                           
                            """),_display_(/*95.30*/defining(true)/*95.44*/ { compare =>_display_(Seq[Any](format.raw/*95.57*/("""  
                                """),_display_(/*96.34*/if(f.getCompleted()== compare)/*96.64*/ {_display_(Seq[Any](format.raw/*96.66*/("""
                                    """),format.raw/*97.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*98.80*/routes/*98.86*/.HomeController.changeStatus(f.getId())),format.raw/*98.125*/("""">Mark as uncompleted</a> | <a href=""""),_display_(/*98.163*/routes/*98.169*/.HomeController.delete(f.getId())),format.raw/*98.202*/("""">Delete</a></div>  
                                              
                                            <div class="card-body">
                                    <h5 class="card-title text-dark"><strike>"""),_display_(/*101.79*/f/*101.80*/.getMessage()),format.raw/*101.93*/("""</strike></h5>
                                     
                                    </div>
                                    </div>
                    
                    """)))}),format.raw/*106.22*/("""
                """)))}),format.raw/*107.18*/("""   
                            """),_display_(/*108.30*/defining(false)/*108.45*/ { compare =>_display_(Seq[Any](format.raw/*108.58*/("""  
                                 """),_display_(/*109.35*/if(f.getCompleted()== compare)/*109.65*/ {_display_(Seq[Any](format.raw/*109.67*/("""
                                    """),format.raw/*110.37*/("""<div class="card border-primary mb-3" style="max-width: 25rem;">
                                            <div class="card-header"><a href=""""),_display_(/*111.80*/routes/*111.86*/.HomeController.changeStatus(f.getId())),format.raw/*111.125*/("""">Mark as completed</a> | <a href=""""),_display_(/*111.161*/routes/*111.167*/.HomeController.delete(f.getId())),format.raw/*111.200*/("""">Delete</a></div>  
                                            
                                            <div class="card-body">
                                            <h5 class="card-title text-dark">"""),_display_(/*114.79*/f/*114.80*/.getMessage()),format.raw/*114.93*/("""</h5>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*118.35*/("""
                                """)))}),format.raw/*119.34*/("""
                    
                    
        
                  

        """)))}),format.raw/*125.10*/("""

                     """)))}),format.raw/*127.23*/("""

    """),format.raw/*129.5*/("""</center>
</div>

          
        
               
            """)))}),format.raw/*135.14*/("""

    """),format.raw/*137.5*/("""</body>
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
                  DATE: Tue Jul 17 14:44:45 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: fb709756dc426eea3c354bf39d2374e1c3a66c97
                  MATRIX: 963->2|1077->46|1121->44|1148->62|1175->63|1342->203|1357->209|1420->250|1508->311|1523->317|1584->356|2092->837|2107->843|2169->884|2439->1127|2538->1216|2579->1218|2640->1252|2653->1256|2684->1266|2745->1299|2964->1491|3055->1560|3170->1647|3572->2022|3603->2037|3642->2038|3719->2088|3751->2111|3790->2112|3876->2171|3899->2185|3950->2198|4013->2234|4052->2264|4092->2266|4157->2303|4328->2447|4343->2453|4404->2492|4470->2530|4486->2536|4541->2569|4591->2591|4607->2597|4663->2631|4879->2820|4894->2826|4955->2865|5071->2954|5081->2955|5116->2968|5340->3161|5413->3203|5473->3236|5497->3251|5548->3264|5612->3301|5651->3331|5691->3333|5756->3370|5927->3514|5942->3520|6003->3559|6067->3595|6083->3601|6138->3634|6377->3846|6387->3847|6421->3860|6583->3991|6644->4021|6772->4118|6827->4142|6877->4164|6978->4238|7009->4253|7048->4254|7125->4304|7158->4328|7197->4329|7283->4388|7306->4402|7357->4415|7420->4451|7459->4481|7499->4483|7564->4520|7735->4664|7750->4670|7811->4709|7877->4747|7893->4753|7948->4786|8190->5000|8201->5001|8236->5014|8449->5195|8499->5213|8560->5246|8585->5261|8637->5274|8702->5311|8742->5341|8783->5343|8849->5380|9021->5524|9037->5530|9099->5569|9164->5605|9181->5611|9237->5644|9477->5856|9488->5857|9523->5870|9686->6001|9752->6035|9865->6116|9921->6140|9955->6146|10054->6213|10088->6219
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|64->34|74->44|74->44|74->44|77->47|77->47|77->47|80->50|80->50|80->50|81->51|81->51|81->51|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|83->53|83->53|86->56|86->56|86->56|87->57|87->57|87->57|92->62|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|97->67|97->67|97->67|97->67|97->67|97->67|100->70|100->70|100->70|104->74|105->75|111->81|113->83|115->85|119->89|119->89|119->89|122->92|122->92|122->92|125->95|125->95|125->95|126->96|126->96|126->96|127->97|128->98|128->98|128->98|128->98|128->98|128->98|131->101|131->101|131->101|136->106|137->107|138->108|138->108|138->108|139->109|139->109|139->109|140->110|141->111|141->111|141->111|141->111|141->111|141->111|144->114|144->114|144->114|148->118|149->119|155->125|157->127|159->129|165->135|167->137
                  -- GENERATED --
              */
          