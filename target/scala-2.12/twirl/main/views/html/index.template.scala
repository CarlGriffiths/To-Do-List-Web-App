
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
                <a class="nav-link" href=".">Tasks ("""),_display_(/*36.54*/user/*36.58*/.getNumUncompleted()),format.raw/*36.78*/(""")</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/completed">Completed</a>
            </li>
            """),_display_(/*41.14*/if(user != null)/*41.30*/{_display_(Seq[Any](format.raw/*41.31*/("""
            """),format.raw/*42.13*/("""<li class="nav-item">
                
                <a class="nav-link" href=""""),_display_(/*44.44*/routes/*44.50*/.HomeController.logout),format.raw/*44.72*/(""""> Logout</a>
            </li>
            """)))}),format.raw/*46.14*/(""" 
            """),format.raw/*47.13*/("""</ul>
        </nav>

         
        <div class="row">
                <div class="col-12">
                    <center>
                    <h3>Hello, """),_display_(/*54.33*/user/*54.37*/.getEmail()),format.raw/*54.48*/("""</h3>
                            """),_display_(/*55.30*/if(flash.containsKey("emptyMessage"))/*55.67*/ {_display_(Seq[Any](format.raw/*55.69*/("""
                                """),format.raw/*56.33*/("""<div class="alert alert-warning">
                                """),_display_(/*57.34*/flash/*57.39*/.get("emptyMessage")),format.raw/*57.59*/(""";
                                </div>
                            """)))}),format.raw/*59.30*/("""
                            """),format.raw/*60.29*/("""<br>
                            """),_display_(/*61.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*61.119*/ {_display_(Seq[Any](format.raw/*61.121*/("""
                                """),_display_(/*62.34*/CSRF/*62.38*/.formField),format.raw/*62.48*/("""
                                """),format.raw/*63.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*68.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*68.136*/("""

                    
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

                       
                        """),_display_(/*151.26*/if(f.isToday() == false)/*151.50*/{_display_(Seq[Any](format.raw/*151.51*/("""

                           
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
                  DATE: Mon Aug 13 23:44:00 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 0bc192d457e7651543f3732a523dcbe2d4933d18
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->96|1409->250|1424->256|1485->295|1993->776|2008->782|2070->823|2193->918|2222->919|2267->936|2306->947|2335->948|2381->966|2410->967|2452->981|2481->982|2519->993|2808->1255|2821->1259|2862->1279|3046->1436|3071->1452|3110->1453|3151->1466|3260->1548|3275->1554|3318->1576|3394->1621|3436->1635|3619->1791|3632->1795|3664->1806|3726->1841|3772->1878|3812->1880|3873->1913|3967->1980|3981->1985|4022->2005|4123->2075|4180->2104|4241->2138|4340->2227|4381->2229|4442->2263|4455->2267|4486->2277|4547->2310|4805->2541|4929->2643|5012->2698|5354->3009|5425->3052|5493->3093|5508->3099|5553->3123|5614->3157|5643->3170|5682->3171|5731->3192|5768->3202|5783->3208|5834->3238|5864->3241|5874->3242|5905->3252|5934->3253|5993->3281|6046->3306|6264->3497|6295->3512|6334->3513|6436->3588|6468->3611|6507->3612|6565->3642|6590->3657|6642->3670|6707->3707|6747->3737|6788->3739|6854->3776|7299->4193|7310->4194|7345->4207|7486->4320|7518->4342|7558->4343|7640->4396|7694->4422|7705->4423|7746->4442|7824->4501|7838->4505|7878->4506|7964->4563|8081->4648|8213->4751|8407->4917|8423->4923|8478->4956|8749->5199|8765->5205|8827->5244|9039->5428|9055->5434|9108->5465|9483->5808|9544->5837|9650->5911|9706->5935|9794->5994|9967->6139|9999->6154|10039->6155|10118->6206|10152->6230|10192->6231|10279->6290|10304->6305|10356->6318|10421->6355|10461->6385|10502->6387|10568->6424|10969->6797|10980->6798|11015->6811|11102->6870|11134->6892|11174->6893|11260->6950|11314->6976|11325->6977|11367->6996|11449->7059|11463->7063|11503->7064|11593->7125|11714->7214|11845->7316|11989->7432|12005->7438|12060->7471|12331->7714|12347->7720|12409->7759|12621->7943|12637->7949|12690->7980|12975->8233|13064->8290|13122->8316|13179->8341|13261->8394
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|66->36|66->36|66->36|71->41|71->41|71->41|72->42|74->44|74->44|74->44|76->46|77->47|84->54|84->54|84->54|85->55|85->55|85->55|86->56|87->57|87->57|87->57|89->59|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|98->68|98->68|101->71|108->78|110->80|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|113->83|113->83|113->83|113->83|115->85|116->86|125->95|125->95|125->95|128->98|128->98|128->98|130->100|130->100|130->100|131->101|131->101|131->101|132->102|138->108|138->108|138->108|140->110|140->110|140->110|141->111|141->111|141->111|141->111|142->112|142->112|142->112|143->113|144->114|146->116|150->120|150->120|150->120|154->124|154->124|154->124|157->127|157->127|157->127|163->133|164->134|168->138|170->140|172->142|178->148|178->148|178->148|181->151|181->151|181->151|184->154|184->154|184->154|185->155|185->155|185->155|186->156|191->161|191->161|191->161|192->162|192->162|192->162|193->163|193->163|193->163|193->163|194->164|194->164|194->164|195->165|196->166|198->168|200->170|200->170|200->170|204->174|204->174|204->174|207->177|207->177|207->177|212->182|214->184|215->185|217->187|221->191
                  -- GENERATED --
              */
          