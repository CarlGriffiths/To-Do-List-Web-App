
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
                                                     <h5 style="float: center">Testing: """),_display_(/*108.90*/a/*108.91*/.getUser().getEmail()),format.raw/*108.112*/("""</h5>
                                                    """),_display_(/*109.54*/if(a.getCat() != null)/*109.76*/{_display_(Seq[Any](format.raw/*109.77*/("""
                                                    """),format.raw/*110.53*/("""<p style="float: center">"""),_display_(/*110.79*/a/*110.80*/.getCat().getName()),format.raw/*110.99*/("""</p>
                                                    """)))}/*111.55*/else/*111.59*/{_display_(Seq[Any](format.raw/*111.60*/("""
                                                        """),format.raw/*112.57*/("""<p>No category selected</p>
                                                        """)))}),format.raw/*113.58*/("""
                                                     
                                                """),format.raw/*115.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*119.59*/routes/*119.65*/.HomeController.delete(a.getId())),format.raw/*119.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*123.60*/routes/*123.66*/.HomeController.changeStatus(a.getId())),format.raw/*123.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*126.59*/routes/*126.65*/.HomeController.edit(a.getId())),format.raw/*126.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*132.35*/("""
                           """)))}),format.raw/*133.29*/("""
                           
                  

                        """)))}),format.raw/*137.26*/("""

                     """)))}),format.raw/*139.23*/("""
                     
                    """),format.raw/*141.21*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*147.24*/for(f <- items) yield /*147.39*/{_display_(Seq[Any](format.raw/*147.40*/("""

                       
                        """),_display_(/*150.26*/if(f.hasDatePassed() == false)/*150.56*/{_display_(Seq[Any](format.raw/*150.57*/("""

                           
                            """),_display_(/*153.30*/defining(false)/*153.45*/ { compare =>_display_(Seq[Any](format.raw/*153.58*/("""  
                                 """),_display_(/*154.35*/if(f.getCompleted()== compare)/*154.65*/ {_display_(Seq[Any](format.raw/*154.67*/("""
                                    """),format.raw/*155.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*160.80*/f/*160.81*/.getMessage()),format.raw/*160.94*/("""</h5>
                                                    """),_display_(/*161.54*/if(f.getCat() != null)/*161.76*/{_display_(Seq[Any](format.raw/*161.77*/("""
                                                        """),format.raw/*162.57*/("""<p style="float: center">"""),_display_(/*162.83*/f/*162.84*/.getCat().getName()),format.raw/*162.103*/("""</p>
                                                        """)))}/*163.59*/else/*163.63*/{_display_(Seq[Any](format.raw/*163.64*/("""
                                                            """),format.raw/*164.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*165.62*/("""
                                                    
                                                """),format.raw/*167.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*169.55*/routes/*169.61*/.HomeController.delete(f.getId())),format.raw/*169.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*173.60*/routes/*173.66*/.HomeController.changeStatus(f.getId())),format.raw/*173.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*176.59*/routes/*176.65*/.HomeController.edit(f.getId())),format.raw/*176.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*181.35*/("""
                          
                            """)))}),format.raw/*183.30*/("""
                        """)))}),format.raw/*184.26*/("""

                      """)))}),format.raw/*186.24*/("""

                     

                            """),format.raw/*190.29*/("""</center>
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
                  DATE: Mon Aug 13 00:17:09 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 2d7a2b295a22189089341861a4fe3608e537ba23
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1392->238|1407->244|1468->283|1976->764|1991->770|2053->811|2176->906|2205->907|2250->924|2289->935|2318->936|2364->954|2393->955|2435->969|2464->970|2502->981|3062->1514|3108->1551|3148->1553|3209->1586|3303->1653|3317->1658|3358->1678|3459->1748|3516->1777|3577->1811|3676->1900|3717->1902|3778->1936|3791->1940|3822->1950|3883->1983|4141->2214|4265->2316|4414->2437|4756->2748|4827->2791|4895->2832|4910->2838|4955->2862|5016->2896|5045->2909|5084->2910|5133->2931|5170->2941|5185->2947|5236->2977|5266->2980|5276->2981|5307->2991|5336->2992|5395->3020|5448->3045|5657->3227|5688->3242|5727->3243|5804->3293|5836->3316|5875->3317|5932->3347|5956->3362|6007->3375|6072->3412|6112->3442|6153->3444|6219->3481|6664->3898|6675->3899|6710->3912|6833->4007|6844->4008|6888->4029|6975->4088|7007->4110|7047->4111|7129->4164|7183->4190|7194->4191|7235->4210|7313->4269|7327->4273|7367->4274|7453->4331|7570->4416|7702->4519|7896->4685|7912->4691|7967->4724|8238->4967|8254->4973|8316->5012|8528->5196|8544->5202|8597->5233|8972->5576|9033->5605|9139->5679|9195->5703|9267->5746|9440->5891|9472->5906|9512->5907|9591->5958|9631->5988|9671->5989|9758->6048|9783->6063|9835->6076|9900->6113|9940->6143|9981->6145|10047->6182|10448->6555|10459->6556|10494->6569|10581->6628|10613->6650|10653->6651|10739->6708|10793->6734|10804->6735|10846->6754|10928->6817|10942->6821|10982->6822|11072->6883|11193->6972|11324->7074|11468->7190|11484->7196|11539->7229|11810->7472|11826->7478|11888->7517|12100->7701|12116->7707|12169->7738|12454->7991|12543->8048|12601->8074|12658->8099|12740->8152
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|83->53|83->53|83->53|84->54|85->55|85->55|85->55|87->57|88->58|89->59|89->59|89->59|90->60|90->60|90->60|91->61|96->66|96->66|101->71|108->78|110->80|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|113->83|113->83|113->83|113->83|115->85|116->86|124->94|124->94|124->94|127->97|127->97|127->97|129->99|129->99|129->99|130->100|130->100|130->100|131->101|137->107|137->107|137->107|138->108|138->108|138->108|139->109|139->109|139->109|140->110|140->110|140->110|140->110|141->111|141->111|141->111|142->112|143->113|145->115|149->119|149->119|149->119|153->123|153->123|153->123|156->126|156->126|156->126|162->132|163->133|167->137|169->139|171->141|177->147|177->147|177->147|180->150|180->150|180->150|183->153|183->153|183->153|184->154|184->154|184->154|185->155|190->160|190->160|190->160|191->161|191->161|191->161|192->162|192->162|192->162|192->162|193->163|193->163|193->163|194->164|195->165|197->167|199->169|199->169|199->169|203->173|203->173|203->173|206->176|206->176|206->176|211->181|213->183|214->184|216->186|220->190
                  -- GENERATED --
              */
          