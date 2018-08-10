
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
                                                    <p style="float: center">"""),_display_(/*108.79*/a/*108.80*/.getCat().getName()),format.raw/*108.99*/("""</p>
                                                </div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*113.59*/routes/*113.65*/.HomeController.delete(a.getId())),format.raw/*113.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*117.60*/routes/*117.66*/.HomeController.changeStatus(a.getId())),format.raw/*117.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*120.59*/routes/*120.65*/.HomeController.edit(a.getId())),format.raw/*120.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*126.35*/("""
                           """)))}),format.raw/*127.29*/("""
                           
                  

                        """)))}),format.raw/*131.26*/("""

                     """)))}),format.raw/*133.23*/("""
                     
                    """),format.raw/*135.21*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*141.24*/for(f <- items) yield /*141.39*/{_display_(Seq[Any](format.raw/*141.40*/("""

                       
                        """),_display_(/*144.26*/if(f.hasDatePassed() == false)/*144.56*/{_display_(Seq[Any](format.raw/*144.57*/("""

                           
                            """),_display_(/*147.30*/defining(false)/*147.45*/ { compare =>_display_(Seq[Any](format.raw/*147.58*/("""  
                                 """),_display_(/*148.35*/if(f.getCompleted()== compare)/*148.65*/ {_display_(Seq[Any](format.raw/*148.67*/("""
                                    """),format.raw/*149.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*154.80*/f/*154.81*/.getMessage()),format.raw/*154.94*/("""</h5>
                                                    <p style="float: center">"""),_display_(/*155.79*/f/*155.80*/.getCat().getName()),format.raw/*155.99*/("""</p>
                                                    
                                                </div>
                                                <hr />
                                            <a href=""""),_display_(/*159.55*/routes/*159.61*/.HomeController.delete(f.getId())),format.raw/*159.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*163.60*/routes/*163.66*/.HomeController.changeStatus(f.getId())),format.raw/*163.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*166.59*/routes/*166.65*/.HomeController.edit(f.getId())),format.raw/*166.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*171.35*/("""
                          
                            """)))}),format.raw/*173.30*/("""
                        """)))}),format.raw/*174.26*/("""

                      """)))}),format.raw/*176.24*/("""

                     

                            """),format.raw/*180.29*/("""</center>
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
                  DATE: Fri Aug 10 19:19:39 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 23c29633b9c29c8ba798a7006a2a6421a5326fc6
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1392->238|1407->244|1468->283|1976->764|1991->770|2053->811|2176->906|2205->907|2250->924|2289->935|2318->936|2364->954|2393->955|2435->969|2464->970|2502->981|3062->1514|3108->1551|3148->1553|3209->1586|3303->1653|3317->1658|3358->1678|3459->1748|3516->1777|3577->1811|3676->1900|3717->1902|3778->1936|3791->1940|3822->1950|3883->1983|4141->2214|4265->2316|4414->2437|4756->2748|4827->2791|4895->2832|4910->2838|4955->2862|5016->2896|5045->2909|5084->2910|5133->2931|5170->2941|5185->2947|5236->2977|5266->2980|5276->2981|5307->2991|5336->2992|5395->3020|5448->3045|5657->3227|5688->3242|5727->3243|5804->3293|5836->3316|5875->3317|5932->3347|5956->3362|6007->3375|6072->3412|6112->3442|6153->3444|6219->3481|6664->3898|6675->3899|6710->3912|6822->3996|6833->3997|6874->4016|7121->4235|7137->4241|7192->4274|7463->4517|7479->4523|7541->4562|7753->4746|7769->4752|7822->4783|8197->5126|8258->5155|8364->5229|8420->5253|8492->5296|8665->5441|8697->5456|8737->5457|8816->5508|8856->5538|8896->5539|8983->5598|9008->5613|9060->5626|9125->5663|9165->5693|9206->5695|9272->5732|9673->6105|9684->6106|9719->6119|9831->6203|9842->6204|9883->6223|10133->6445|10149->6451|10204->6484|10475->6727|10491->6733|10553->6772|10765->6956|10781->6962|10834->6993|11119->7246|11208->7303|11266->7329|11323->7354|11405->7407
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|83->53|83->53|83->53|84->54|85->55|85->55|85->55|87->57|88->58|89->59|89->59|89->59|90->60|90->60|90->60|91->61|96->66|96->66|101->71|108->78|110->80|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|113->83|113->83|113->83|113->83|115->85|116->86|124->94|124->94|124->94|127->97|127->97|127->97|129->99|129->99|129->99|130->100|130->100|130->100|131->101|137->107|137->107|137->107|138->108|138->108|138->108|143->113|143->113|143->113|147->117|147->117|147->117|150->120|150->120|150->120|156->126|157->127|161->131|163->133|165->135|171->141|171->141|171->141|174->144|174->144|174->144|177->147|177->147|177->147|178->148|178->148|178->148|179->149|184->154|184->154|184->154|185->155|185->155|185->155|189->159|189->159|189->159|193->163|193->163|193->163|196->166|196->166|196->166|201->171|203->173|204->174|206->176|210->180
                  -- GENERATED --
              */
          