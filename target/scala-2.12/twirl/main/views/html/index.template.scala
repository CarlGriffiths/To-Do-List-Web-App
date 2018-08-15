
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
            """),format.raw/*47.13*/("""<li class="nav-item">
                
                <a class="nav-link" href=""""),_display_(/*49.44*/routes/*49.50*/.HomeController.logout),format.raw/*49.72*/(""""> Current points: """),_display_(/*49.92*/user/*49.96*/.getPoints()),format.raw/*49.108*/("""</a>
            </li>
            </ul>
        </nav>

         
        <div class="row">
                <div class="col-12">
                    <center>
                    <h3>Hello, """),_display_(/*58.33*/user/*58.37*/.getEmail()),format.raw/*58.48*/("""</h3>
                            """),_display_(/*59.30*/if(flash.containsKey("emptyMessage"))/*59.67*/ {_display_(Seq[Any](format.raw/*59.69*/("""
                                """),format.raw/*60.33*/("""<div class="alert alert-warning">
                                """),_display_(/*61.34*/flash/*61.39*/.get("emptyMessage")),format.raw/*61.59*/(""";
                                </div>
                            """)))}),format.raw/*63.30*/("""
                            """),format.raw/*64.29*/("""<br>
                            """),_display_(/*65.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*65.119*/ {_display_(Seq[Any](format.raw/*65.121*/("""
                                """),_display_(/*66.34*/CSRF/*66.38*/.formField),format.raw/*66.48*/("""
                                """),format.raw/*67.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*72.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*72.136*/("""

                    
                                """),format.raw/*75.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*82.30*/("""
                     
                    """),format.raw/*84.21*/("""<center> 
                     <a href=""""),_display_(/*85.32*/routes/*85.38*/.HomeController.index(0)),format.raw/*85.62*/("""">All |</a>
                     """),_display_(/*86.23*/for(c <- cat) yield /*86.36*/{_display_(Seq[Any](format.raw/*86.37*/("""
                    """),format.raw/*87.21*/("""<a href=""""),_display_(/*87.31*/routes/*87.37*/.HomeController.index(c.getId)),format.raw/*87.67*/("""">"""),_display_(/*87.70*/c/*87.71*/.getName()),format.raw/*87.81*/(""" """),format.raw/*87.82*/("""|</a>

                    """)))}),format.raw/*89.22*/("""    
                    """),format.raw/*90.21*/("""<hr>
                </div> 
            
                <div class="col-6">
                    <center>
                    
                    <h3>Due today</h3>


                     """),_display_(/*99.23*/for(a <- items) yield /*99.38*/{_display_(Seq[Any](format.raw/*99.39*/("""
                         
                       
                       """),_display_(/*102.25*/if(a.isToday() == true)/*102.48*/{_display_(Seq[Any](format.raw/*102.49*/("""

                           """),_display_(/*104.29*/defining(false)/*104.44*/ { compare =>_display_(Seq[Any](format.raw/*104.57*/("""  
                                 """),_display_(/*105.35*/if(a.getCompleted()== compare)/*105.65*/ {_display_(Seq[Any](format.raw/*105.67*/("""
                                    """),format.raw/*106.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*112.80*/a/*112.81*/.getMessage()),format.raw/*112.94*/("""</h5>
                                                     
                                                    """),_display_(/*114.54*/if(a.getCat() != null)/*114.76*/{_display_(Seq[Any](format.raw/*114.77*/("""
                                                    """),format.raw/*115.53*/("""<p style="float: center">"""),_display_(/*115.79*/a/*115.80*/.getCat().getName()),format.raw/*115.99*/("""</p>
                                                    """)))}/*116.55*/else/*116.59*/{_display_(Seq[Any](format.raw/*116.60*/("""
                                                        """),format.raw/*117.57*/("""<p>No category selected</p>
                                                        """)))}),format.raw/*118.58*/("""
                                                     """),_display_(/*119.55*/a/*119.56*/.dateToString()),format.raw/*119.71*/("""
                                                """),format.raw/*120.49*/("""</div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*124.59*/routes/*124.65*/.HomeController.delete(a.getId())),format.raw/*124.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*128.60*/routes/*128.66*/.HomeController.changeStatus(a.getId())),format.raw/*128.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*131.59*/routes/*131.65*/.HomeController.edit(a.getId())),format.raw/*131.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*137.35*/("""
                           """)))}),format.raw/*138.29*/("""
                           
                  

                        """)))}),format.raw/*142.26*/("""

                     """)))}),format.raw/*144.23*/("""
                     
                                    """),format.raw/*146.37*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*152.24*/for(f <- items) yield /*152.39*/{_display_(Seq[Any](format.raw/*152.40*/("""

                       
                        """),_display_(/*155.26*/if(f.dueFuture() == true)/*155.51*/{_display_(Seq[Any](format.raw/*155.52*/("""

                           
                            """),_display_(/*158.30*/defining(false)/*158.45*/ { compare =>_display_(Seq[Any](format.raw/*158.58*/("""  
                                 """),_display_(/*159.35*/if(f.getCompleted()== compare)/*159.65*/ {_display_(Seq[Any](format.raw/*159.67*/("""
                                    """),format.raw/*160.37*/("""<div class="card border-dark mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*165.80*/f/*165.81*/.getMessage()),format.raw/*165.94*/("""</h5>
                                                    """),_display_(/*166.54*/if(f.getCat() != null)/*166.76*/{_display_(Seq[Any](format.raw/*166.77*/("""
                                                        """),format.raw/*167.57*/("""<p style="float: center">"""),_display_(/*167.83*/f/*167.84*/.getCat().getName()),format.raw/*167.103*/("""</p>
                                                        """)))}/*168.59*/else/*168.63*/{_display_(Seq[Any](format.raw/*168.64*/("""
                                                            """),format.raw/*169.61*/("""<p>No category selected</p>
                                                            """)))}),format.raw/*170.62*/("""
                                                            """),_display_(/*171.62*/f/*171.63*/.dateToString()),format.raw/*171.78*/("""
                                                    
                                                """),format.raw/*173.49*/("""</div>
                                                <hr />
                                            <a href=""""),_display_(/*175.55*/routes/*175.61*/.HomeController.delete(f.getId())),format.raw/*175.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*179.60*/routes/*179.66*/.HomeController.changeStatus(f.getId())),format.raw/*179.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*182.59*/routes/*182.65*/.HomeController.edit(f.getId())),format.raw/*182.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*187.35*/("""
                          
                            """)))}),format.raw/*189.30*/("""
                        """)))}),format.raw/*190.26*/("""

                      """)))}),format.raw/*192.24*/("""

                     

                            """),format.raw/*196.29*/("""</center>
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
                  DATE: Wed Aug 15 23:19:58 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 537e92fae443be01f06b8fcdd6962d1fa39b2da2
                  MATRIX: 983->2|1130->79|1174->77|1201->95|1228->96|1409->250|1424->256|1485->295|1993->776|2008->782|2070->823|2193->918|2222->919|2267->936|2306->947|2335->948|2381->966|2410->967|2452->981|2481->982|2519->993|2961->1408|2986->1424|3025->1425|3066->1438|3175->1520|3190->1526|3233->1548|3309->1593|3351->1607|3460->1689|3475->1695|3518->1717|3565->1737|3578->1741|3612->1753|3830->1944|3843->1948|3875->1959|3937->1994|3983->2031|4023->2033|4084->2066|4178->2133|4192->2138|4233->2158|4334->2228|4391->2257|4452->2291|4551->2380|4592->2382|4653->2416|4666->2420|4697->2430|4758->2463|5016->2694|5140->2796|5223->2851|5565->3162|5636->3205|5704->3246|5719->3252|5764->3276|5825->3310|5854->3323|5893->3324|5942->3345|5979->3355|5994->3361|6045->3391|6075->3394|6085->3395|6116->3405|6145->3406|6204->3434|6257->3459|6475->3650|6506->3665|6545->3666|6648->3741|6681->3764|6721->3765|6779->3795|6804->3810|6856->3823|6921->3860|6961->3890|7002->3892|7068->3929|7513->4346|7524->4347|7559->4360|7700->4473|7732->4495|7772->4496|7854->4549|7908->4575|7919->4576|7960->4595|8038->4654|8052->4658|8092->4659|8178->4716|8295->4801|8378->4856|8389->4857|8426->4872|8504->4921|8698->5087|8714->5093|8769->5126|9040->5369|9056->5375|9118->5414|9330->5598|9346->5604|9399->5635|9774->5978|9835->6007|9941->6081|9997->6105|10085->6164|10258->6309|10290->6324|10330->6325|10409->6376|10444->6401|10484->6402|10571->6461|10596->6476|10648->6489|10713->6526|10753->6556|10794->6558|10860->6595|11261->6968|11272->6969|11307->6982|11394->7041|11426->7063|11466->7064|11552->7121|11606->7147|11617->7148|11659->7167|11741->7230|11755->7234|11795->7235|11885->7296|12006->7385|12096->7447|12107->7448|12144->7463|12275->7565|12419->7681|12435->7687|12490->7720|12761->7963|12777->7969|12839->8008|13051->8192|13067->8198|13120->8229|13405->8482|13494->8539|13552->8565|13609->8590|13691->8643
                  LINES: 28->2|31->4|34->3|35->5|36->6|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|71->41|71->41|71->41|72->42|74->44|74->44|74->44|76->46|77->47|79->49|79->49|79->49|79->49|79->49|79->49|88->58|88->58|88->58|89->59|89->59|89->59|90->60|91->61|91->61|91->61|93->63|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|102->72|102->72|105->75|112->82|114->84|115->85|115->85|115->85|116->86|116->86|116->86|117->87|117->87|117->87|117->87|117->87|117->87|117->87|117->87|119->89|120->90|129->99|129->99|129->99|132->102|132->102|132->102|134->104|134->104|134->104|135->105|135->105|135->105|136->106|142->112|142->112|142->112|144->114|144->114|144->114|145->115|145->115|145->115|145->115|146->116|146->116|146->116|147->117|148->118|149->119|149->119|149->119|150->120|154->124|154->124|154->124|158->128|158->128|158->128|161->131|161->131|161->131|167->137|168->138|172->142|174->144|176->146|182->152|182->152|182->152|185->155|185->155|185->155|188->158|188->158|188->158|189->159|189->159|189->159|190->160|195->165|195->165|195->165|196->166|196->166|196->166|197->167|197->167|197->167|197->167|198->168|198->168|198->168|199->169|200->170|201->171|201->171|201->171|203->173|205->175|205->175|205->175|209->179|209->179|209->179|212->182|212->182|212->182|217->187|219->189|220->190|222->192|226->196
                  -- GENERATED --
              */
          