
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Item],Form[Item],List[Category],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item], itemForm: Form[Item], cat: List[Category], user: User):play.twirl.api.HtmlFormat.Appendable = {
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
                <a class="nav-link" href=".">Tasks</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/completed">Completed</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/overdue">Overdue</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/stats">Stats</a>
            </li>
            """),_display_(/*47.14*/if(user != null)/*47.30*/{_display_(Seq[Any](format.raw/*47.31*/("""
            """),format.raw/*48.13*/("""<li class="nav-item">
                
                <a class="nav-link" href=""""),_display_(/*50.44*/routes/*50.50*/.HomeController.logout),format.raw/*50.72*/(""""> Logout</a>
            </li>
            """)))}),format.raw/*52.14*/(""" 
            """),format.raw/*53.13*/("""</ul>
        </nav>

         
        <div class="row">
                <div class="col-12">
                    <center>
                            """),_display_(/*60.30*/if(flash.containsKey("emptyMessage"))/*60.67*/ {_display_(Seq[Any](format.raw/*60.69*/("""
                                """),format.raw/*61.33*/("""<div class="alert alert-warning">
                                """),_display_(/*62.34*/flash/*62.39*/.get("emptyMessage")),format.raw/*62.59*/(""";
                                </div>
                            """)))}),format.raw/*64.30*/("""
                            """),format.raw/*65.29*/("""<br>
                            """),_display_(/*66.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*66.119*/ {_display_(Seq[Any](format.raw/*66.121*/("""
                                """),_display_(/*67.34*/CSRF/*67.38*/.formField),format.raw/*67.48*/("""
                                """),format.raw/*68.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*73.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*73.136*/("""

                    
                                """),format.raw/*76.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*83.30*/("""
                     
                    """),format.raw/*85.21*/("""<center> 
                     <a href=""""),_display_(/*86.32*/routes/*86.38*/.HomeController.index(0)),format.raw/*86.62*/("""">All |</a>
                     """),_display_(/*87.23*/for(c <- cat) yield /*87.36*/{_display_(Seq[Any](format.raw/*87.37*/("""
                    """),format.raw/*88.21*/("""<a href=""""),_display_(/*88.31*/routes/*88.37*/.HomeController.index(c.getId)),format.raw/*88.67*/("""">"""),_display_(/*88.70*/c/*88.71*/.getName()),format.raw/*88.81*/(""" """),format.raw/*88.82*/("""|</a>

                    """)))}),format.raw/*90.22*/("""    
                    """),format.raw/*91.21*/("""<hr>
                </div> 
            
                <div class="col-6">
                    <center>
                    
                    <h3>Due today</h3>


                     """),_display_(/*100.23*/for(a <- items) yield /*100.38*/{_display_(Seq[Any](format.raw/*100.39*/("""
                         
                       
                       """),_display_(/*103.25*/if(a.isToday() == true)/*103.48*/{_display_(Seq[Any](format.raw/*103.49*/("""

                           """),_display_(/*105.29*/defining(false)/*105.44*/ { compare =>_display_(Seq[Any](format.raw/*105.57*/("""  
                                 """),_display_(/*106.35*/if(a.getCompleted()== compare)/*106.65*/ {_display_(Seq[Any](format.raw/*106.67*/("""
                                    """),format.raw/*107.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*113.80*/a/*113.81*/.getMessage()),format.raw/*113.94*/("""</h5>
                                                     
                                                    """),_display_(/*115.54*/if(a.getCat() != null)/*115.76*/{_display_(Seq[Any](format.raw/*115.77*/("""
                                                    """),format.raw/*116.53*/("""<p style="float: center">"""),_display_(/*116.79*/a/*116.80*/.getCat().getName()),format.raw/*116.99*/("""</p>
                                                    """)))}/*117.55*/else/*117.59*/{_display_(Seq[Any](format.raw/*117.60*/("""
                                                        """),format.raw/*118.57*/("""<p>No category selected</p>
                                                        """)))}),format.raw/*119.58*/("""
                                                     """),_display_(/*120.55*/a/*120.56*/.dateToString()),format.raw/*120.71*/("""
                                                """),format.raw/*121.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*125.59*/routes/*125.65*/.HomeController.delete(a.getId())),format.raw/*125.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*129.60*/routes/*129.66*/.HomeController.changeStatus(a.getId())),format.raw/*129.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*132.59*/routes/*132.65*/.HomeController.edit(a.getId())),format.raw/*132.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*138.35*/("""
                           """)))}),format.raw/*139.29*/("""
                           
                  

                        """)))}),format.raw/*143.26*/("""

                     """)))}),format.raw/*145.23*/("""
                     
                                    """),format.raw/*147.37*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*153.24*/for(f <- items) yield /*153.39*/{_display_(Seq[Any](format.raw/*153.40*/("""

                       
                        """),_display_(/*156.26*/if(f.dueFuture() == true)/*156.51*/{_display_(Seq[Any](format.raw/*156.52*/("""

                           
                            """),_display_(/*159.30*/defining(false)/*159.45*/ { compare =>_display_(Seq[Any](format.raw/*159.58*/("""  
                                 """),_display_(/*160.35*/if(f.getCompleted()== compare)/*160.65*/ {_display_(Seq[Any](format.raw/*160.67*/("""
                                    """),format.raw/*161.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*166.80*/f/*166.81*/.getMessage()),format.raw/*166.94*/("""</h5>
                                                    """),_display_(/*167.54*/if(f.getCat() != null)/*167.76*/{_display_(Seq[Any](format.raw/*167.77*/("""
                                                        """),format.raw/*168.57*/("""<p style="float: center">"""),_display_(/*168.83*/f/*168.84*/.getCat().getName()),format.raw/*168.103*/("""</p>
                                                        """)))}/*169.59*/else/*169.63*/{_display_(Seq[Any](format.raw/*169.64*/("""
                                                            """),format.raw/*170.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*171.62*/("""
                                                            """),_display_(/*172.62*/f/*172.63*/.dateToString()),format.raw/*172.78*/("""
                                                    
                                                """),format.raw/*174.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*176.55*/routes/*176.61*/.HomeController.delete(f.getId())),format.raw/*176.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*180.60*/routes/*180.66*/.HomeController.changeStatus(f.getId())),format.raw/*180.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*183.59*/routes/*183.65*/.HomeController.edit(f.getId())),format.raw/*183.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*188.35*/("""
                          
                            """)))}),format.raw/*190.30*/("""
                        """)))}),format.raw/*191.26*/("""

                      """)))}),format.raw/*193.24*/("""

                     

                            """),format.raw/*197.29*/("""</center>
                            </div>

       
               
           

    </body>
</html>
"""))
      }
    }
  }

  def render(items:List[Item],itemForm:Form[Item],cat:List[Category],user:User): play.twirl.api.HtmlFormat.Appendable = apply(items,itemForm,cat,user)

  def f:((List[Item],Form[Item],List[Category],User) => play.twirl.api.HtmlFormat.Appendable) = (items,itemForm,cat,user) => apply(items,itemForm,cat,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 29 15:51:48 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 3bec85d4740b5a88a699e769abb4df9de111934b
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->96|1409->250|1424->256|1485->295|1993->776|2008->782|2070->823|2193->918|2222->919|2267->936|2306->947|2335->948|2381->966|2410->967|2452->981|2481->982|2519->993|3189->1636|3214->1652|3253->1653|3294->1666|3403->1748|3418->1754|3461->1776|3537->1821|3579->1835|3759->1988|3805->2025|3845->2027|3906->2060|4000->2127|4014->2132|4055->2152|4156->2222|4213->2251|4274->2285|4373->2374|4414->2376|4475->2410|4488->2414|4519->2424|4580->2457|4838->2688|4962->2790|5045->2845|5387->3156|5458->3199|5526->3240|5541->3246|5586->3270|5647->3304|5676->3317|5715->3318|5764->3339|5801->3349|5816->3355|5867->3385|5897->3388|5907->3389|5938->3399|5967->3400|6026->3428|6079->3453|6298->3644|6330->3659|6370->3660|6473->3735|6506->3758|6546->3759|6604->3789|6629->3804|6681->3817|6746->3854|6786->3884|6827->3886|6893->3923|7338->4340|7349->4341|7384->4354|7525->4467|7557->4489|7597->4490|7679->4543|7733->4569|7744->4570|7785->4589|7863->4648|7877->4652|7917->4653|8003->4710|8120->4795|8203->4850|8214->4851|8251->4866|8329->4915|8523->5081|8539->5087|8594->5120|8865->5363|8881->5369|8943->5408|9155->5592|9171->5598|9224->5629|9599->5972|9660->6001|9766->6075|9822->6099|9910->6158|10083->6303|10115->6318|10155->6319|10234->6370|10269->6395|10309->6396|10396->6455|10421->6470|10473->6483|10538->6520|10578->6550|10619->6552|10685->6589|11086->6962|11097->6963|11132->6976|11219->7035|11251->7057|11291->7058|11377->7115|11431->7141|11442->7142|11484->7161|11566->7224|11580->7228|11620->7229|11710->7290|11831->7379|11921->7441|11932->7442|11969->7457|12100->7559|12244->7675|12260->7681|12315->7714|12586->7957|12602->7963|12664->8002|12876->8186|12892->8192|12945->8223|13230->8476|13319->8533|13377->8559|13434->8584|13516->8637
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|77->47|77->47|77->47|78->48|80->50|80->50|80->50|82->52|83->53|90->60|90->60|90->60|91->61|92->62|92->62|92->62|94->64|95->65|96->66|96->66|96->66|97->67|97->67|97->67|98->68|103->73|103->73|106->76|113->83|115->85|116->86|116->86|116->86|117->87|117->87|117->87|118->88|118->88|118->88|118->88|118->88|118->88|118->88|118->88|120->90|121->91|130->100|130->100|130->100|133->103|133->103|133->103|135->105|135->105|135->105|136->106|136->106|136->106|137->107|143->113|143->113|143->113|145->115|145->115|145->115|146->116|146->116|146->116|146->116|147->117|147->117|147->117|148->118|149->119|150->120|150->120|150->120|151->121|155->125|155->125|155->125|159->129|159->129|159->129|162->132|162->132|162->132|168->138|169->139|173->143|175->145|177->147|183->153|183->153|183->153|186->156|186->156|186->156|189->159|189->159|189->159|190->160|190->160|190->160|191->161|196->166|196->166|196->166|197->167|197->167|197->167|198->168|198->168|198->168|198->168|199->169|199->169|199->169|200->170|201->171|202->172|202->172|202->172|204->174|206->176|206->176|206->176|210->180|210->180|210->180|213->183|213->183|213->183|218->188|220->190|221->191|223->193|227->197
                  -- GENERATED --
              */
          