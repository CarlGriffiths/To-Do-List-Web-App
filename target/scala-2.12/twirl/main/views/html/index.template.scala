
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
"""),_display_(/*6.2*/main("home", user)/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""

         
        """),format.raw/*9.9*/("""<div class="row">
                <div class="col-12">
                    <center>
                            """),_display_(/*12.30*/if(flash.containsKey("emptyMessage"))/*12.67*/ {_display_(Seq[Any](format.raw/*12.69*/("""
                                """),format.raw/*13.33*/("""<div class="alert alert-warning">
                                """),_display_(/*14.34*/flash/*14.39*/.get("emptyMessage")),format.raw/*14.59*/(""";
                                </div>
                            """)))}),format.raw/*16.30*/("""
                            """),format.raw/*17.29*/("""<br>
                            """),_display_(/*18.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*18.119*/ {_display_(Seq[Any](format.raw/*18.121*/("""
                                """),_display_(/*19.34*/CSRF/*19.38*/.formField),format.raw/*19.48*/("""
                                """),format.raw/*20.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*25.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*25.136*/("""

                    
                                """),format.raw/*28.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*35.30*/("""
                     
                    """),format.raw/*37.21*/("""<center> 
                     <a href=""""),_display_(/*38.32*/routes/*38.38*/.HomeController.index(0)),format.raw/*38.62*/("""">All |</a>
                     """),_display_(/*39.23*/for(c <- cat) yield /*39.36*/{_display_(Seq[Any](format.raw/*39.37*/("""
                    """),format.raw/*40.21*/("""<a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.index(c.getId)),format.raw/*40.67*/("""">"""),_display_(/*40.70*/c/*40.71*/.getName()),format.raw/*40.81*/(""" """),format.raw/*40.82*/("""|</a>

                    """)))}),format.raw/*42.22*/("""    
                    """),format.raw/*43.21*/("""<hr>
                </div> 
            
                <div class="col-6">
                    <center>
                    
                    <h3>Due today</h3>


                     """),_display_(/*52.23*/for(a <- items) yield /*52.38*/{_display_(Seq[Any](format.raw/*52.39*/("""
                         
                       
                       """),_display_(/*55.25*/if(a.isToday() == true)/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""

                           """),_display_(/*57.29*/defining(false)/*57.44*/ { compare =>_display_(Seq[Any](format.raw/*57.57*/("""  
                                 """),_display_(/*58.35*/if(a.getCompleted()== compare)/*58.65*/ {_display_(Seq[Any](format.raw/*58.67*/("""
                                    """),format.raw/*59.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*65.80*/a/*65.81*/.getMessage()),format.raw/*65.94*/("""</h5>
                                                     
                                                    """),_display_(/*67.54*/if(a.getCat() != null)/*67.76*/{_display_(Seq[Any](format.raw/*67.77*/("""
                                                    """),format.raw/*68.53*/("""<p style="float: center">"""),_display_(/*68.79*/a/*68.80*/.getCat().getName()),format.raw/*68.99*/("""</p>
                                                    """)))}/*69.55*/else/*69.59*/{_display_(Seq[Any](format.raw/*69.60*/("""
                                                        """),format.raw/*70.57*/("""<p>No category selected</p>
                                                       """)))}),format.raw/*71.57*/("""
                                                     """),_display_(/*72.55*/a/*72.56*/.dateToString()),format.raw/*72.71*/("""
                                                """),format.raw/*73.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*77.59*/routes/*77.65*/.HomeController.delete(a.getId())),format.raw/*77.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*81.60*/routes/*81.66*/.HomeController.changeStatus(a.getId())),format.raw/*81.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*84.59*/routes/*84.65*/.HomeController.edit(a.getId())),format.raw/*84.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*90.35*/("""
                           """)))}),format.raw/*91.29*/("""
                           
                  

                        """)))}),format.raw/*95.26*/("""

                     """)))}),format.raw/*97.23*/("""
                     
                                    """),format.raw/*99.37*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*105.24*/for(f <- items) yield /*105.39*/{_display_(Seq[Any](format.raw/*105.40*/("""

                       
                        """),_display_(/*108.26*/if(f.dueFuture() == true)/*108.51*/{_display_(Seq[Any](format.raw/*108.52*/("""

                           
                            """),_display_(/*111.30*/defining(false)/*111.45*/ { compare =>_display_(Seq[Any](format.raw/*111.58*/("""  
                                 """),_display_(/*112.35*/if(f.getCompleted()== compare)/*112.65*/ {_display_(Seq[Any](format.raw/*112.67*/("""
                                    """),format.raw/*113.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*118.80*/f/*118.81*/.getMessage()),format.raw/*118.94*/("""</h5>
                                                    """),_display_(/*119.54*/if(f.getCat() != null)/*119.76*/{_display_(Seq[Any](format.raw/*119.77*/("""
                                                        """),format.raw/*120.57*/("""<p style="float: center">"""),_display_(/*120.83*/f/*120.84*/.getCat().getName()),format.raw/*120.103*/("""</p>
                                                        """)))}/*121.59*/else/*121.63*/{_display_(Seq[Any](format.raw/*121.64*/("""
                                                            """),format.raw/*122.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*123.62*/("""
                                                            """),_display_(/*124.62*/f/*124.63*/.dateToString()),format.raw/*124.78*/("""
                                                    
                                                """),format.raw/*126.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*128.55*/routes/*128.61*/.HomeController.delete(f.getId())),format.raw/*128.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*132.60*/routes/*132.66*/.HomeController.changeStatus(f.getId())),format.raw/*132.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*135.59*/routes/*135.65*/.HomeController.edit(f.getId())),format.raw/*135.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*140.35*/("""
                          
                            """)))}),format.raw/*142.30*/("""
                        """)))}),format.raw/*143.26*/("""

                      """)))}),format.raw/*145.24*/("""

                     

                            """),format.raw/*149.29*/("""</center>
                            </div>

       
               
           

""")))}),format.raw/*156.2*/("""

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
                  DATE: Wed Sep 19 17:33:42 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 9a551ac09a797d307cc78290a273572ece239d93
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->97|1254->115|1293->117|1339->137|1479->250|1525->287|1565->289|1626->322|1720->389|1734->394|1775->414|1876->484|1933->513|1994->547|2093->636|2134->638|2195->672|2208->676|2239->686|2300->719|2558->950|2682->1052|2765->1107|3107->1418|3178->1461|3246->1502|3261->1508|3306->1532|3367->1566|3396->1579|3435->1580|3484->1601|3521->1611|3536->1617|3587->1647|3617->1650|3627->1651|3658->1661|3687->1662|3746->1690|3799->1715|4017->1906|4048->1921|4087->1922|4189->1997|4221->2020|4260->2021|4317->2051|4341->2066|4392->2079|4456->2116|4495->2146|4535->2148|4600->2185|5044->2602|5054->2603|5088->2616|5228->2729|5259->2751|5298->2752|5379->2805|5432->2831|5442->2832|5482->2851|5559->2910|5572->2914|5611->2915|5696->2972|5811->3056|5893->3111|5903->3112|5939->3127|6016->3176|6209->3342|6224->3348|6278->3381|6548->3624|6563->3630|6624->3669|6835->3853|6850->3859|6902->3890|7276->4233|7336->4262|7441->4336|7496->4360|7583->4419|7756->4564|7788->4579|7828->4580|7907->4631|7942->4656|7982->4657|8069->4716|8094->4731|8146->4744|8211->4781|8251->4811|8292->4813|8358->4850|8759->5223|8770->5224|8805->5237|8892->5296|8924->5318|8964->5319|9050->5376|9104->5402|9115->5403|9157->5422|9239->5485|9253->5489|9293->5490|9383->5551|9504->5640|9594->5702|9605->5703|9642->5718|9773->5820|9917->5936|9933->5942|9988->5975|10259->6218|10275->6224|10337->6263|10549->6447|10565->6453|10618->6484|10903->6737|10992->6794|11050->6820|11107->6845|11189->6898|11304->6982
                  LINES: 28->2|31->4|34->3|35->5|36->6|36->6|36->6|39->9|42->12|42->12|42->12|43->13|44->14|44->14|44->14|46->16|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|55->25|55->25|58->28|65->35|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|72->42|73->43|82->52|82->52|82->52|85->55|85->55|85->55|87->57|87->57|87->57|88->58|88->58|88->58|89->59|95->65|95->65|95->65|97->67|97->67|97->67|98->68|98->68|98->68|98->68|99->69|99->69|99->69|100->70|101->71|102->72|102->72|102->72|103->73|107->77|107->77|107->77|111->81|111->81|111->81|114->84|114->84|114->84|120->90|121->91|125->95|127->97|129->99|135->105|135->105|135->105|138->108|138->108|138->108|141->111|141->111|141->111|142->112|142->112|142->112|143->113|148->118|148->118|148->118|149->119|149->119|149->119|150->120|150->120|150->120|150->120|151->121|151->121|151->121|152->122|153->123|154->124|154->124|154->124|156->126|158->128|158->128|158->128|162->132|162->132|162->132|165->135|165->135|165->135|170->140|172->142|173->143|175->145|179->149|186->156
                  -- GENERATED --
              */
          