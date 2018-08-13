
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
                <a class="nav-link" href=".">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/completed">Completed</a>
            </li>
            """),_display_(/*41.14*/if(user != null)/*41.30*/{_display_(Seq[Any](format.raw/*41.31*/("""
            """),format.raw/*42.13*/("""<li class="nav-item">
                <a class="nav-link" href="/completed"> LOgout</a>
            </li>
            """)))}),format.raw/*45.14*/(""" 
            """),format.raw/*46.13*/("""</ul>
        </nav>

         
        <div class="row">
                <div class="col-12">
                    <center>
                            """),_display_(/*53.30*/if(flash.containsKey("emptyMessage"))/*53.67*/ {_display_(Seq[Any](format.raw/*53.69*/("""
                                """),format.raw/*54.33*/("""<div class="alert alert-warning">
                                """),_display_(/*55.34*/flash/*55.39*/.get("emptyMessage")),format.raw/*55.59*/(""";
                                </div>
                            """)))}),format.raw/*57.30*/("""
                            """),format.raw/*58.29*/("""<br>
                            """),_display_(/*59.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*59.119*/ {_display_(Seq[Any](format.raw/*59.121*/("""
                                """),_display_(/*60.34*/CSRF/*60.38*/.formField),format.raw/*60.48*/("""
                                """),format.raw/*61.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*66.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*66.136*/("""

                                
                                
                    
                                """),format.raw/*71.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*78.30*/("""
                     
                    """),format.raw/*80.21*/("""<center> 
                     <a href=""""),_display_(/*81.32*/routes/*81.38*/.HomeController.index(0)),format.raw/*81.62*/("""">All |</a>
                     """),_display_(/*82.23*/for(c <- cat) yield /*82.36*/{_display_(Seq[Any](format.raw/*82.37*/("""
                    """),format.raw/*83.21*/("""<a href=""""),_display_(/*83.31*/routes/*83.37*/.HomeController.index(c.getId)),format.raw/*83.67*/("""">"""),_display_(/*83.70*/c/*83.71*/.getName()),format.raw/*83.81*/(""" """),format.raw/*83.82*/("""|</a>

                    """)))}),format.raw/*85.22*/("""    
                    """),format.raw/*86.21*/("""<hr>
                </div>  
                <div class="col-6">
                    <center>
                    <h1>"""),_display_(/*90.26*/user/*90.30*/.getcompcount()),format.raw/*90.45*/("""</h1>
                    <h3>Due today</h3>
                       


                     """),_display_(/*95.23*/for(a <- items) yield /*95.38*/{_display_(Seq[Any](format.raw/*95.39*/("""

                       
                       """),_display_(/*98.25*/if(a.isToday() == true)/*98.48*/{_display_(Seq[Any](format.raw/*98.49*/("""

                           """),_display_(/*100.29*/defining(false)/*100.44*/ { compare =>_display_(Seq[Any](format.raw/*100.57*/("""  
                                 """),_display_(/*101.35*/if(a.getCompleted()== compare)/*101.65*/ {_display_(Seq[Any](format.raw/*101.67*/("""
                                    """),format.raw/*102.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*108.80*/a/*108.81*/.getMessage()),format.raw/*108.94*/("""</h5>
                                                     
                                                    """),_display_(/*110.54*/if(a.getCat() != null)/*110.76*/{_display_(Seq[Any](format.raw/*110.77*/("""
                                                    """),format.raw/*111.53*/("""<p style="float: center">"""),_display_(/*111.79*/a/*111.80*/.getCat().getName()),format.raw/*111.99*/("""</p>
                                                    """)))}/*112.55*/else/*112.59*/{_display_(Seq[Any](format.raw/*112.60*/("""
                                                        """),format.raw/*113.57*/("""<p>No category selected</p>
                                                        """)))}),format.raw/*114.58*/("""
                                                     
                                                """),format.raw/*116.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*120.59*/routes/*120.65*/.HomeController.delete(a.getId())),format.raw/*120.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*124.60*/routes/*124.66*/.HomeController.changeStatus(a.getId())),format.raw/*124.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*127.59*/routes/*127.65*/.HomeController.edit(a.getId())),format.raw/*127.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*133.35*/("""
                           """)))}),format.raw/*134.29*/("""
                           
                  

                        """)))}),format.raw/*138.26*/("""

                     """)))}),format.raw/*140.23*/("""
                     
                                    """),format.raw/*142.37*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*148.24*/for(f <- items) yield /*148.39*/{_display_(Seq[Any](format.raw/*148.40*/("""

                       
                        """),_display_(/*151.26*/if(f.hasDatePassed() == false)/*151.56*/{_display_(Seq[Any](format.raw/*151.57*/("""

                           
                            """),_display_(/*154.30*/defining(false)/*154.45*/ { compare =>_display_(Seq[Any](format.raw/*154.58*/("""  
                                 """),_display_(/*155.35*/if(f.getCompleted()== compare)/*155.65*/ {_display_(Seq[Any](format.raw/*155.67*/("""
                                    """),format.raw/*156.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*161.80*/f/*161.81*/.getMessage()),format.raw/*161.94*/("""</h5>
                                                    """),_display_(/*162.54*/if(f.getCat() != null)/*162.76*/{_display_(Seq[Any](format.raw/*162.77*/("""
                                                        """),format.raw/*163.57*/("""<p style="float: center">"""),_display_(/*163.83*/f/*163.84*/.getCat().getName()),format.raw/*163.103*/("""</p>
                                                        """)))}/*164.59*/else/*164.63*/{_display_(Seq[Any](format.raw/*164.64*/("""
                                                            """),format.raw/*165.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*166.62*/("""
                                                    
                                                """),format.raw/*168.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*170.55*/routes/*170.61*/.HomeController.delete(f.getId())),format.raw/*170.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*174.60*/routes/*174.66*/.HomeController.changeStatus(f.getId())),format.raw/*174.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*177.59*/routes/*177.65*/.HomeController.edit(f.getId())),format.raw/*177.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*182.35*/("""
                          
                            """)))}),format.raw/*184.30*/("""
                        """)))}),format.raw/*185.26*/("""

                      """)))}),format.raw/*187.24*/("""

                     

                            """),format.raw/*191.29*/("""</center>
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
                  DATE: Mon Aug 13 15:40:37 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: c6f5700a146942adfd144b3b18ecd77108dbe64e
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->96|1409->250|1424->256|1485->295|1993->776|2008->782|2070->823|2193->918|2222->919|2267->936|2306->947|2335->948|2381->966|2410->967|2452->981|2481->982|2519->993|2960->1407|2985->1423|3024->1424|3065->1437|3215->1556|3257->1570|3437->1723|3483->1760|3523->1762|3584->1795|3678->1862|3692->1867|3733->1887|3834->1957|3891->1986|3952->2020|4051->2109|4092->2111|4153->2145|4166->2149|4197->2159|4258->2192|4516->2423|4640->2525|4789->2646|5131->2957|5202->3000|5270->3041|5285->3047|5330->3071|5391->3105|5420->3118|5459->3119|5508->3140|5545->3150|5560->3156|5611->3186|5641->3189|5651->3190|5682->3200|5711->3201|5770->3229|5823->3254|5970->3374|5983->3378|6019->3393|6139->3486|6170->3501|6209->3502|6286->3552|6318->3575|6357->3576|6415->3606|6440->3621|6492->3634|6557->3671|6597->3701|6638->3703|6704->3740|7149->4157|7160->4158|7195->4171|7336->4284|7368->4306|7408->4307|7490->4360|7544->4386|7555->4387|7596->4406|7674->4465|7688->4469|7728->4470|7814->4527|7931->4612|8063->4715|8257->4881|8273->4887|8328->4920|8599->5163|8615->5169|8677->5208|8889->5392|8905->5398|8958->5429|9333->5772|9394->5801|9500->5875|9556->5899|9644->5958|9817->6103|9849->6118|9889->6119|9968->6170|10008->6200|10048->6201|10135->6260|10160->6275|10212->6288|10277->6325|10317->6355|10358->6357|10424->6394|10825->6767|10836->6768|10871->6781|10958->6840|10990->6862|11030->6863|11116->6920|11170->6946|11181->6947|11223->6966|11305->7029|11319->7033|11359->7034|11449->7095|11570->7184|11701->7286|11845->7402|11861->7408|11916->7441|12187->7684|12203->7690|12265->7729|12477->7913|12493->7919|12546->7950|12831->8203|12920->8260|12978->8286|13035->8311|13117->8364
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|71->41|71->41|71->41|72->42|75->45|76->46|83->53|83->53|83->53|84->54|85->55|85->55|85->55|87->57|88->58|89->59|89->59|89->59|90->60|90->60|90->60|91->61|96->66|96->66|101->71|108->78|110->80|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|113->83|113->83|113->83|113->83|115->85|116->86|120->90|120->90|120->90|125->95|125->95|125->95|128->98|128->98|128->98|130->100|130->100|130->100|131->101|131->101|131->101|132->102|138->108|138->108|138->108|140->110|140->110|140->110|141->111|141->111|141->111|141->111|142->112|142->112|142->112|143->113|144->114|146->116|150->120|150->120|150->120|154->124|154->124|154->124|157->127|157->127|157->127|163->133|164->134|168->138|170->140|172->142|178->148|178->148|178->148|181->151|181->151|181->151|184->154|184->154|184->154|185->155|185->155|185->155|186->156|191->161|191->161|191->161|192->162|192->162|192->162|193->163|193->163|193->163|193->163|194->164|194->164|194->164|195->165|196->166|198->168|200->170|200->170|200->170|204->174|204->174|204->174|207->177|207->177|207->177|212->182|214->184|215->185|217->187|221->191
                  -- GENERATED --
              */
          