
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
                            """),_display_(/*54.30*/if(flash.containsKey("emptyMessage"))/*54.67*/ {_display_(Seq[Any](format.raw/*54.69*/("""
                                """),format.raw/*55.33*/("""<div class="alert alert-warning">
                                """),_display_(/*56.34*/flash/*56.39*/.get("emptyMessage")),format.raw/*56.59*/(""";
                                </div>
                            """)))}),format.raw/*58.30*/("""
                            """),format.raw/*59.29*/("""<br>
                            """),_display_(/*60.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*60.119*/ {_display_(Seq[Any](format.raw/*60.121*/("""
                                """),_display_(/*61.34*/CSRF/*61.38*/.formField),format.raw/*61.48*/("""
                                """),format.raw/*62.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*67.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*67.136*/("""

                    
                                """),format.raw/*70.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*77.30*/("""
                     
                    """),format.raw/*79.21*/("""<center> 
                     <a href=""""),_display_(/*80.32*/routes/*80.38*/.HomeController.index(0)),format.raw/*80.62*/("""">All |</a>
                     """),_display_(/*81.23*/for(c <- cat) yield /*81.36*/{_display_(Seq[Any](format.raw/*81.37*/("""
                    """),format.raw/*82.21*/("""<a href=""""),_display_(/*82.31*/routes/*82.37*/.HomeController.index(c.getId)),format.raw/*82.67*/("""">"""),_display_(/*82.70*/c/*82.71*/.getName()),format.raw/*82.81*/(""" """),format.raw/*82.82*/("""|</a>

                    """)))}),format.raw/*84.22*/("""    
                    """),format.raw/*85.21*/("""<hr>
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
                                                     
                                                    """),_display_(/*109.54*/if(a.getCat() != null)/*109.76*/{_display_(Seq[Any](format.raw/*109.77*/("""
                                                    """),format.raw/*110.53*/("""<p style="float: center">"""),_display_(/*110.79*/a/*110.80*/.getCat().getName()),format.raw/*110.99*/("""</p>
                                                    """)))}/*111.55*/else/*111.59*/{_display_(Seq[Any](format.raw/*111.60*/("""
                                                        """),format.raw/*112.57*/("""<p>No category selected</p>
                                                        """)))}),format.raw/*113.58*/("""
                                                     """),_display_(/*114.55*/a/*114.56*/.dateToString()),format.raw/*114.71*/("""
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
                     
                                    """),format.raw/*141.37*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*147.24*/for(f <- items) yield /*147.39*/{_display_(Seq[Any](format.raw/*147.40*/("""

                       
                        """),_display_(/*150.26*/if(f.dueFuture() == true)/*150.51*/{_display_(Seq[Any](format.raw/*150.52*/("""

                           
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
                                                            """),_display_(/*166.62*/f/*166.63*/.dateToString()),format.raw/*166.78*/("""
                                                    
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
                  DATE: Fri Aug 17 21:22:23 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 73b22cf7c8312b95f32e8b08be5f6928471a78db
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->96|1409->250|1424->256|1485->295|1993->776|2008->782|2070->823|2193->918|2222->919|2267->936|2306->947|2335->948|2381->966|2410->967|2452->981|2481->982|2519->993|2961->1408|2986->1424|3025->1425|3066->1438|3175->1520|3190->1526|3233->1548|3309->1593|3351->1607|3531->1760|3577->1797|3617->1799|3678->1832|3772->1899|3786->1904|3827->1924|3928->1994|3985->2023|4046->2057|4145->2146|4186->2148|4247->2182|4260->2186|4291->2196|4352->2229|4610->2460|4734->2562|4817->2617|5159->2928|5230->2971|5298->3012|5313->3018|5358->3042|5419->3076|5448->3089|5487->3090|5536->3111|5573->3121|5588->3127|5639->3157|5669->3160|5679->3161|5710->3171|5739->3172|5798->3200|5851->3225|6069->3416|6100->3431|6139->3432|6241->3507|6273->3530|6312->3531|6369->3561|6393->3576|6444->3589|6509->3626|6549->3656|6590->3658|6656->3695|7101->4112|7112->4113|7147->4126|7288->4239|7320->4261|7360->4262|7442->4315|7496->4341|7507->4342|7548->4361|7626->4420|7640->4424|7680->4425|7766->4482|7883->4567|7966->4622|7977->4623|8014->4638|8092->4687|8286->4853|8302->4859|8357->4892|8628->5135|8644->5141|8706->5180|8918->5364|8934->5370|8987->5401|9362->5744|9423->5773|9529->5847|9585->5871|9673->5930|9846->6075|9878->6090|9918->6091|9997->6142|10032->6167|10072->6168|10159->6227|10184->6242|10236->6255|10301->6292|10341->6322|10382->6324|10448->6361|10849->6734|10860->6735|10895->6748|10982->6807|11014->6829|11054->6830|11140->6887|11194->6913|11205->6914|11247->6933|11329->6996|11343->7000|11383->7001|11473->7062|11594->7151|11684->7213|11695->7214|11732->7229|11863->7331|12007->7447|12023->7453|12078->7486|12349->7729|12365->7735|12427->7774|12639->7958|12655->7964|12708->7995|12993->8248|13082->8305|13140->8331|13197->8356|13279->8409
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|71->41|71->41|71->41|72->42|74->44|74->44|74->44|76->46|77->47|84->54|84->54|84->54|85->55|86->56|86->56|86->56|88->58|89->59|90->60|90->60|90->60|91->61|91->61|91->61|92->62|97->67|97->67|100->70|107->77|109->79|110->80|110->80|110->80|111->81|111->81|111->81|112->82|112->82|112->82|112->82|112->82|112->82|112->82|112->82|114->84|115->85|124->94|124->94|124->94|127->97|127->97|127->97|129->99|129->99|129->99|130->100|130->100|130->100|131->101|137->107|137->107|137->107|139->109|139->109|139->109|140->110|140->110|140->110|140->110|141->111|141->111|141->111|142->112|143->113|144->114|144->114|144->114|145->115|149->119|149->119|149->119|153->123|153->123|153->123|156->126|156->126|156->126|162->132|163->133|167->137|169->139|171->141|177->147|177->147|177->147|180->150|180->150|180->150|183->153|183->153|183->153|184->154|184->154|184->154|185->155|190->160|190->160|190->160|191->161|191->161|191->161|192->162|192->162|192->162|192->162|193->163|193->163|193->163|194->164|195->165|196->166|196->166|196->166|198->168|200->170|200->170|200->170|204->174|204->174|204->174|207->177|207->177|207->177|212->182|214->184|215->185|217->187|221->191
                  -- GENERATED --
              */
          