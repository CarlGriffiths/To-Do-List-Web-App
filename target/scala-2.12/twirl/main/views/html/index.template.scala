
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

    """),format.raw/*8.5*/("""<script>
        var weather = new XMLHttpRequest();
        var city = "";
	city = """"),_display_(/*11.11*/user/*11.15*/.getCity()),format.raw/*11.25*/("""";
        weather.open("GET", "https://api.openweathermap.org/data/2.5/find?q=" + city + "&units=metric&appid=8bbdccfff8927111b6c3cb756294790b", false);
        weather.send(null);
    
        var r = JSON.parse(weather.response);
        var h = r.list["0"].main.temp;
    
    
     </script>

         
        <div class="row">
                <div class="col-12">
                    <center>
                            """),_display_(/*25.30*/if(flash.containsKey("emptyMessage"))/*25.67*/ {_display_(Seq[Any](format.raw/*25.69*/("""
                                """),format.raw/*26.33*/("""<div class="alert alert-warning">
                                """),_display_(/*27.34*/flash/*27.39*/.get("emptyMessage")),format.raw/*27.59*/(""";
                                </div>
                            """)))}),format.raw/*29.30*/("""
                            """),format.raw/*30.29*/("""<h2>
                                The current temperature is:
                                    <script>document.write(h)</script>
                                

                            </h2>
                            <br>
                            """),_display_(/*37.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*37.119*/ {_display_(Seq[Any](format.raw/*37.121*/("""
                                """),_display_(/*38.34*/CSRF/*38.38*/.formField),format.raw/*38.48*/("""
                                """),format.raw/*39.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*44.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*44.136*/("""

                    
                                """),format.raw/*47.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*54.30*/("""
                     
                    """),format.raw/*56.21*/("""<center> 
                     <a href=""""),_display_(/*57.32*/routes/*57.38*/.HomeController.index(0)),format.raw/*57.62*/("""">All |</a>
                     """),_display_(/*58.23*/for(c <- cat) yield /*58.36*/{_display_(Seq[Any](format.raw/*58.37*/("""
                    """),format.raw/*59.21*/("""<a href=""""),_display_(/*59.31*/routes/*59.37*/.HomeController.index(c.getId)),format.raw/*59.67*/("""">"""),_display_(/*59.70*/c/*59.71*/.getName()),format.raw/*59.81*/(""" """),format.raw/*59.82*/("""|</a>

                    """)))}),format.raw/*61.22*/("""    
                    """),format.raw/*62.21*/("""<hr>
                </div> 
            
                <div class="col-6">
                    <center>
                    
                    <h3>Due today</h3>


                     """),_display_(/*71.23*/for(a <- items) yield /*71.38*/{_display_(Seq[Any](format.raw/*71.39*/("""
                         
                       
                       """),_display_(/*74.25*/if(a.isToday() == true)/*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""

                           """),_display_(/*76.29*/defining(false)/*76.44*/ { compare =>_display_(Seq[Any](format.raw/*76.57*/("""  
                                 """),_display_(/*77.35*/if(a.getCompleted()== compare)/*77.65*/ {_display_(Seq[Any](format.raw/*77.67*/("""
                                    """),format.raw/*78.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*84.80*/a/*84.81*/.getMessage()),format.raw/*84.94*/("""</h5>
                                                     
                                                    """),_display_(/*86.54*/if(a.getCat() != null)/*86.76*/{_display_(Seq[Any](format.raw/*86.77*/("""
                                                    """),format.raw/*87.53*/("""<p style="float: center">"""),_display_(/*87.79*/a/*87.80*/.getCat().getName()),format.raw/*87.99*/("""</p>
                                                    """)))}/*88.55*/else/*88.59*/{_display_(Seq[Any](format.raw/*88.60*/("""
                                                        """),format.raw/*89.57*/("""<p>No category selected</p>
                                                       """)))}),format.raw/*90.57*/("""
                                                     
                                                """),format.raw/*92.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*96.59*/routes/*96.65*/.HomeController.delete(a.getId())),format.raw/*96.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*100.60*/routes/*100.66*/.HomeController.changeStatus(a.getId())),format.raw/*100.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*103.59*/routes/*103.65*/.HomeController.edit(a.getId())),format.raw/*103.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*109.35*/("""
                           """)))}),format.raw/*110.29*/("""
                           
                  

                        """)))}),format.raw/*114.26*/("""

                     """)))}),format.raw/*116.23*/("""
                     
                                    """),format.raw/*118.37*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*124.24*/for(f <- items) yield /*124.39*/{_display_(Seq[Any](format.raw/*124.40*/("""

                       
                        """),_display_(/*127.26*/if(f.dueFuture() == true)/*127.51*/{_display_(Seq[Any](format.raw/*127.52*/("""

                           
                            """),_display_(/*130.30*/defining(false)/*130.45*/ { compare =>_display_(Seq[Any](format.raw/*130.58*/("""  
                                 """),_display_(/*131.35*/if(f.getCompleted()== compare)/*131.65*/ {_display_(Seq[Any](format.raw/*131.67*/("""
                                    """),format.raw/*132.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*137.80*/f/*137.81*/.getMessage()),format.raw/*137.94*/("""</h5>
                                                    """),_display_(/*138.54*/if(f.getCat() != null)/*138.76*/{_display_(Seq[Any](format.raw/*138.77*/("""
                                                        """),format.raw/*139.57*/("""<p style="float: center">"""),_display_(/*139.83*/f/*139.84*/.getCat().getName()),format.raw/*139.103*/("""</p>
                                                        """)))}/*140.59*/else/*140.63*/{_display_(Seq[Any](format.raw/*140.64*/("""
                                                            """),format.raw/*141.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*142.62*/("""
                                                            
                                                    
                                                """),format.raw/*145.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*147.55*/routes/*147.61*/.HomeController.delete(f.getId())),format.raw/*147.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*151.60*/routes/*151.66*/.HomeController.changeStatus(f.getId())),format.raw/*151.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*154.59*/routes/*154.65*/.HomeController.edit(f.getId())),format.raw/*154.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*159.35*/("""
                          
                            """)))}),format.raw/*161.30*/("""
                        """)))}),format.raw/*162.26*/("""

                      """)))}),format.raw/*164.24*/("""

                     

                            """),format.raw/*168.29*/("""</center>
                            </div>

       
               
           

""")))}),format.raw/*175.2*/("""

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
                  DATE: Tue Oct 02 01:31:36 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: a4447b6fc16b97deac5ca2a5dcf425c71606e690
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->97|1254->115|1293->117|1325->123|1438->209|1451->213|1482->223|1938->652|1984->689|2024->691|2085->724|2179->791|2193->796|2234->816|2335->886|2392->915|2685->1181|2784->1270|2825->1272|2886->1306|2899->1310|2930->1320|2991->1353|3249->1584|3373->1686|3456->1741|3798->2052|3869->2095|3937->2136|3952->2142|3997->2166|4058->2200|4087->2213|4126->2214|4175->2235|4212->2245|4227->2251|4278->2281|4308->2284|4318->2285|4349->2295|4378->2296|4437->2324|4490->2349|4708->2540|4739->2555|4778->2556|4880->2631|4912->2654|4951->2655|5008->2685|5032->2700|5083->2713|5147->2750|5186->2780|5226->2782|5291->2819|5735->3236|5745->3237|5779->3250|5919->3363|5950->3385|5989->3386|6070->3439|6123->3465|6133->3466|6173->3485|6250->3544|6263->3548|6302->3549|6387->3606|6502->3690|6633->3793|6826->3959|6841->3965|6895->3998|7166->4241|7182->4247|7244->4286|7456->4470|7472->4476|7525->4507|7900->4850|7961->4879|8067->4953|8123->4977|8211->5036|8384->5181|8416->5196|8456->5197|8535->5248|8570->5273|8610->5274|8697->5333|8722->5348|8774->5361|8839->5398|8879->5428|8920->5430|8986->5467|9387->5840|9398->5841|9433->5854|9520->5913|9552->5935|9592->5936|9678->5993|9732->6019|9743->6020|9785->6039|9867->6102|9881->6106|9921->6107|10011->6168|10132->6257|10324->6420|10468->6536|10484->6542|10539->6575|10810->6818|10826->6824|10888->6863|11100->7047|11116->7053|11169->7084|11454->7337|11543->7394|11601->7420|11658->7445|11740->7498|11855->7582
                  LINES: 28->2|31->4|34->3|35->5|36->6|36->6|36->6|38->8|41->11|41->11|41->11|55->25|55->25|55->25|56->26|57->27|57->27|57->27|59->29|60->30|67->37|67->37|67->37|68->38|68->38|68->38|69->39|74->44|74->44|77->47|84->54|86->56|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59|89->59|89->59|89->59|89->59|89->59|91->61|92->62|101->71|101->71|101->71|104->74|104->74|104->74|106->76|106->76|106->76|107->77|107->77|107->77|108->78|114->84|114->84|114->84|116->86|116->86|116->86|117->87|117->87|117->87|117->87|118->88|118->88|118->88|119->89|120->90|122->92|126->96|126->96|126->96|130->100|130->100|130->100|133->103|133->103|133->103|139->109|140->110|144->114|146->116|148->118|154->124|154->124|154->124|157->127|157->127|157->127|160->130|160->130|160->130|161->131|161->131|161->131|162->132|167->137|167->137|167->137|168->138|168->138|168->138|169->139|169->139|169->139|169->139|170->140|170->140|170->140|171->141|172->142|175->145|177->147|177->147|177->147|181->151|181->151|181->151|184->154|184->154|184->154|189->159|191->161|192->162|194->164|198->168|205->175
                  -- GENERATED --
              */
          