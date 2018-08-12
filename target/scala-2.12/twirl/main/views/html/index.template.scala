
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
                    <h3>Due today</h3>
                       


                     """),_display_(/*94.23*/for(a <- items) yield /*94.38*/{_display_(Seq[Any](format.raw/*94.39*/("""

                       
                       """),_display_(/*97.25*/if(a.isToday() == true)/*97.48*/{_display_(Seq[Any](format.raw/*97.49*/("""

                           """),_display_(/*99.29*/defining(false)/*99.44*/ { compare =>_display_(Seq[Any](format.raw/*99.57*/("""  
                                 """),_display_(/*100.35*/if(a.getCompleted()== compare)/*100.65*/ {_display_(Seq[Any](format.raw/*100.67*/("""
                                    """),format.raw/*101.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*107.80*/a/*107.81*/.getMessage()),format.raw/*107.94*/("""</h5>
                                                    """),_display_(/*108.54*/if(a.getCat() != null)/*108.76*/{_display_(Seq[Any](format.raw/*108.77*/("""
                                                    """),format.raw/*109.53*/("""<p style="float: center">"""),_display_(/*109.79*/a/*109.80*/.getCat().getName()),format.raw/*109.99*/("""</p>
                                                    """)))}/*110.55*/else/*110.59*/{_display_(Seq[Any](format.raw/*110.60*/("""
                                                        """),format.raw/*111.57*/("""<p>No category selected</p>
                                                        """)))}),format.raw/*112.58*/("""
                                                     
                                                """),format.raw/*114.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*118.59*/routes/*118.65*/.HomeController.delete(a.getId())),format.raw/*118.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*122.60*/routes/*122.66*/.HomeController.changeStatus(a.getId())),format.raw/*122.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*125.59*/routes/*125.65*/.HomeController.edit(a.getId())),format.raw/*125.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*131.35*/("""
                           """)))}),format.raw/*132.29*/("""
                           
                  

                        """)))}),format.raw/*136.26*/("""

                     """)))}),format.raw/*138.23*/("""
                     
                    """),format.raw/*140.21*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*146.24*/for(f <- items) yield /*146.39*/{_display_(Seq[Any](format.raw/*146.40*/("""

                       
                        """),_display_(/*149.26*/if(f.hasDatePassed() == false)/*149.56*/{_display_(Seq[Any](format.raw/*149.57*/("""

                           
                            """),_display_(/*152.30*/defining(false)/*152.45*/ { compare =>_display_(Seq[Any](format.raw/*152.58*/("""  
                                 """),_display_(/*153.35*/if(f.getCompleted()== compare)/*153.65*/ {_display_(Seq[Any](format.raw/*153.67*/("""
                                    """),format.raw/*154.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*159.80*/f/*159.81*/.getMessage()),format.raw/*159.94*/("""</h5>
                                                    """),_display_(/*160.54*/if(f.getCat() != null)/*160.76*/{_display_(Seq[Any](format.raw/*160.77*/("""
                                                        """),format.raw/*161.57*/("""<p style="float: center">"""),_display_(/*161.83*/a/*161.84*/.getCat().getName()),format.raw/*161.103*/("""</p>
                                                        """)))}/*162.59*/else/*162.63*/{_display_(Seq[Any](format.raw/*162.64*/("""
                                                            """),format.raw/*163.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*164.62*/("""
                                                    
                                                """),format.raw/*166.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*168.55*/routes/*168.61*/.HomeController.delete(f.getId())),format.raw/*168.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*172.60*/routes/*172.66*/.HomeController.changeStatus(f.getId())),format.raw/*172.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*175.59*/routes/*175.65*/.HomeController.edit(f.getId())),format.raw/*175.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*180.35*/("""
                          
                            """)))}),format.raw/*182.30*/("""
                        """)))}),format.raw/*183.26*/("""

                      """)))}),format.raw/*185.24*/("""

                     

                            """),format.raw/*189.29*/("""</center>
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
                  DATE: Sun Aug 12 03:14:52 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 0a91920991966d41a44fbe1007225faf53753d5e
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1392->238|1407->244|1468->283|1976->764|1991->770|2053->811|2176->906|2205->907|2250->924|2289->935|2318->936|2364->954|2393->955|2435->969|2464->970|2502->981|3062->1514|3108->1551|3148->1553|3209->1586|3303->1653|3317->1658|3358->1678|3459->1748|3516->1777|3577->1811|3676->1900|3717->1902|3778->1936|3791->1940|3822->1950|3883->1983|4141->2214|4265->2316|4414->2437|4756->2748|4827->2791|4895->2832|4910->2838|4955->2862|5016->2896|5045->2909|5084->2910|5133->2931|5170->2941|5185->2947|5236->2977|5266->2980|5276->2981|5307->2991|5336->2992|5395->3020|5448->3045|5657->3227|5688->3242|5727->3243|5804->3293|5836->3316|5875->3317|5932->3347|5956->3362|6007->3375|6072->3412|6112->3442|6153->3444|6219->3481|6664->3898|6675->3899|6710->3912|6797->3971|6829->3993|6869->3994|6951->4047|7005->4073|7016->4074|7057->4093|7135->4152|7149->4156|7189->4157|7275->4214|7392->4299|7524->4402|7718->4568|7734->4574|7789->4607|8060->4850|8076->4856|8138->4895|8350->5079|8366->5085|8419->5116|8794->5459|8855->5488|8961->5562|9017->5586|9089->5629|9262->5774|9294->5789|9334->5790|9413->5841|9453->5871|9493->5872|9580->5931|9605->5946|9657->5959|9722->5996|9762->6026|9803->6028|9869->6065|10270->6438|10281->6439|10316->6452|10403->6511|10435->6533|10475->6534|10561->6591|10615->6617|10626->6618|10668->6637|10750->6700|10764->6704|10804->6705|10894->6766|11015->6855|11146->6957|11290->7073|11306->7079|11361->7112|11632->7355|11648->7361|11710->7400|11922->7584|11938->7590|11991->7621|12276->7874|12365->7931|12423->7957|12480->7982|12562->8035
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|83->53|83->53|83->53|84->54|85->55|85->55|85->55|87->57|88->58|89->59|89->59|89->59|90->60|90->60|90->60|91->61|96->66|96->66|101->71|108->78|110->80|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|113->83|113->83|113->83|113->83|115->85|116->86|124->94|124->94|124->94|127->97|127->97|127->97|129->99|129->99|129->99|130->100|130->100|130->100|131->101|137->107|137->107|137->107|138->108|138->108|138->108|139->109|139->109|139->109|139->109|140->110|140->110|140->110|141->111|142->112|144->114|148->118|148->118|148->118|152->122|152->122|152->122|155->125|155->125|155->125|161->131|162->132|166->136|168->138|170->140|176->146|176->146|176->146|179->149|179->149|179->149|182->152|182->152|182->152|183->153|183->153|183->153|184->154|189->159|189->159|189->159|190->160|190->160|190->160|191->161|191->161|191->161|191->161|192->162|192->162|192->162|193->163|194->164|196->166|198->168|198->168|198->168|202->172|202->172|202->172|205->175|205->175|205->175|210->180|212->182|213->183|215->185|219->189
                  -- GENERATED --
              */
          