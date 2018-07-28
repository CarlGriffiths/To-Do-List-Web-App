
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
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

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Navbar</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      
      <li class="nav-item">
        <a class="nav-link" href=".">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/completed">completed</a>
      </li>
    </ul>
    
  </div>
</nav>
            

              


         
        <div class="row">
                <div class="col-12">
                    <center>
                            <br>
                            """),_display_(/*61.30*/form(action=routes.HomeController.submit(), 'class -> "form-hotizontal", 'role -> "form")/*61.119*/ {_display_(Seq[Any](format.raw/*61.121*/("""
                                """),_display_(/*62.34*/CSRF/*62.38*/.formField),format.raw/*62.48*/("""
                                """),format.raw/*63.33*/("""<form class="form-inline" action=routes.HomeController.submit()>
                                     <div class="form-group">

                                     
                               
                                """),_display_(/*68.34*/inputText(itemForm("message"),'_label -> "Add New Task", 'size -> 40, 'placeholder -> "Add task here")),format.raw/*68.136*/("""

                                
                                
                    
                                """),format.raw/*73.33*/("""<input type="submit" value="Add task" class="btn btn-outline-primary">
                    
                                 
                                 </div>
                                </form>  
                                            
                            
                            """)))}),format.raw/*80.30*/("""
                     
                    """),format.raw/*82.21*/("""<center> 
                     <a href=""""),_display_(/*83.32*/routes/*83.38*/.HomeController.index(0)),format.raw/*83.62*/("""">All |</a>
                     """),_display_(/*84.23*/for(c <- cat) yield /*84.36*/{_display_(Seq[Any](format.raw/*84.37*/("""
                    """),format.raw/*85.21*/("""<a href=""""),_display_(/*85.31*/routes/*85.37*/.HomeController.index(c.getId)),format.raw/*85.67*/("""">"""),_display_(/*85.70*/c/*85.71*/.getName()),format.raw/*85.81*/(""" """),format.raw/*85.82*/("""|</a>

                    """)))}),format.raw/*87.22*/("""    
                    """),format.raw/*88.21*/("""<hr>
                </div>  
                <div class="col-6">
                    <center>
                    <h3>Due today</h3>
                       


                     """),_display_(/*96.23*/for(a <- items) yield /*96.38*/{_display_(Seq[Any](format.raw/*96.39*/("""

                       
                       """),_display_(/*99.25*/if(a.isToday() == true)/*99.48*/{_display_(Seq[Any](format.raw/*99.49*/("""

                           """),_display_(/*101.29*/defining(false)/*101.44*/ { compare =>_display_(Seq[Any](format.raw/*101.57*/("""  
                                 """),_display_(/*102.35*/if(a.getCompleted()== compare)/*102.65*/ {_display_(Seq[Any](format.raw/*102.67*/("""
                                    """),format.raw/*103.37*/("""<div class="card border-primary mb-3" style="max-width: 27rem;">
                                           
                                            
                                            <div class="card-body">
                                            
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*109.80*/a/*109.81*/.getMessage()),format.raw/*109.94*/("""</h5>
                                                    <p style="float: center">"""),_display_(/*110.79*/a/*110.80*/.getCat().getName()),format.raw/*110.99*/("""</p>
                                                </div>
                                                <hr />

                                            
                                                <a href=""""),_display_(/*115.59*/routes/*115.65*/.HomeController.delete(a.getId())),format.raw/*115.98*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*119.60*/routes/*119.66*/.HomeController.changeStatus(a.getId())),format.raw/*119.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*122.59*/routes/*122.65*/.HomeController.edit(a.getId())),format.raw/*122.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                             
                                            
                                        </div>
                                    </div>
                                 """)))}),format.raw/*128.35*/("""
                           """)))}),format.raw/*129.29*/("""
                           
                  

                        """)))}),format.raw/*133.26*/("""

                     """)))}),format.raw/*135.23*/("""
                     
                    """),format.raw/*137.21*/("""</div>
                    <div class="col-5">
                    <center>
                     <h3>Due in future</h3>


                      """),_display_(/*143.24*/for(f <- items) yield /*143.39*/{_display_(Seq[Any](format.raw/*143.40*/("""

                       
                        """),_display_(/*146.26*/if(f.hasDatePassed() == false)/*146.56*/{_display_(Seq[Any](format.raw/*146.57*/("""

                           
                            """),_display_(/*149.30*/defining(false)/*149.45*/ { compare =>_display_(Seq[Any](format.raw/*149.58*/("""  
                                 """),_display_(/*150.35*/if(f.getCompleted()== compare)/*150.65*/ {_display_(Seq[Any](format.raw/*150.67*/("""
                                    """),format.raw/*151.37*/("""<div class="card border-primary mb-3" style="max-width: 27rem;">
                                            
                                            
                                            <div class="card-body">
                                                <div style="clear: both">
                                                    <h5 style="float: center">"""),_display_(/*156.80*/f/*156.81*/.getMessage()),format.raw/*156.94*/("""</h5>
                                                    <p style="float: center">"""),_display_(/*157.79*/f/*157.80*/.getCat().getName()),format.raw/*157.99*/("""</p>
                                                    
                                                </div>
                                                <hr />
                                            <a href=""""),_display_(/*161.55*/routes/*161.61*/.HomeController.delete(f.getId())),format.raw/*161.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*165.60*/routes/*165.66*/.HomeController.changeStatus(f.getId())),format.raw/*165.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>

                                                <a href=""""),_display_(/*168.59*/routes/*168.65*/.HomeController.edit(f.getId())),format.raw/*168.96*/("""" class="btn btn-outline-secondary btn-sm">
                                                    <i class="fas fa-edit"></i></a>
                                        </div>
                                    </div>

                                 """)))}),format.raw/*173.35*/("""
                          
                            """)))}),format.raw/*175.30*/("""
                        """)))}),format.raw/*176.26*/("""

                      """)))}),format.raw/*178.24*/("""

                     

                            """),format.raw/*182.29*/("""</center>
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
                  DATE: Sat Jul 28 22:18:27 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/index.scala.html
                  HASH: 7ceccbfb163fa7968b6cea8242be0a94a375cd91
                  MATRIX: 978->2|1113->67|1157->65|1184->83|1211->84|1378->224|1393->230|1456->271|1544->332|1559->338|1620->377|2128->858|2143->864|2205->905|2328->1000|2357->1001|2402->1018|2441->1029|2470->1030|2516->1048|2545->1049|2587->1063|2616->1064|2654->1075|3626->2020|3725->2109|3766->2111|3827->2145|3840->2149|3871->2159|3932->2192|4190->2423|4314->2525|4463->2646|4805->2957|4876->3000|4944->3041|4959->3047|5004->3071|5065->3105|5094->3118|5133->3119|5182->3140|5219->3150|5234->3156|5285->3186|5315->3189|5325->3190|5356->3200|5385->3201|5444->3229|5497->3254|5706->3436|5737->3451|5776->3452|5853->3502|5885->3525|5924->3526|5982->3556|6007->3571|6059->3584|6124->3621|6164->3651|6205->3653|6271->3690|6719->4110|6730->4111|6765->4124|6877->4208|6888->4209|6929->4228|7176->4447|7192->4453|7247->4486|7518->4729|7534->4735|7596->4774|7808->4958|7824->4964|7877->4995|8252->5338|8313->5367|8419->5441|8475->5465|8547->5508|8720->5653|8752->5668|8792->5669|8871->5720|8911->5750|8951->5751|9038->5810|9063->5825|9115->5838|9180->5875|9220->5905|9261->5907|9327->5944|9731->6320|9742->6321|9777->6334|9889->6418|9900->6419|9941->6438|10191->6660|10207->6666|10262->6699|10533->6942|10549->6948|10611->6987|10823->7171|10839->7177|10892->7208|11177->7461|11266->7518|11324->7544|11381->7569|11463->7622
                  LINES: 28->2|31->4|34->3|35->5|36->6|42->12|42->12|42->12|43->13|43->13|43->13|47->17|47->17|47->17|50->20|50->20|51->21|51->21|51->21|53->23|53->23|55->25|55->25|58->28|91->61|91->61|91->61|92->62|92->62|92->62|93->63|98->68|98->68|103->73|110->80|112->82|113->83|113->83|113->83|114->84|114->84|114->84|115->85|115->85|115->85|115->85|115->85|115->85|115->85|115->85|117->87|118->88|126->96|126->96|126->96|129->99|129->99|129->99|131->101|131->101|131->101|132->102|132->102|132->102|133->103|139->109|139->109|139->109|140->110|140->110|140->110|145->115|145->115|145->115|149->119|149->119|149->119|152->122|152->122|152->122|158->128|159->129|163->133|165->135|167->137|173->143|173->143|173->143|176->146|176->146|176->146|179->149|179->149|179->149|180->150|180->150|180->150|181->151|186->156|186->156|186->156|187->157|187->157|187->157|191->161|191->161|191->161|195->165|195->165|195->165|198->168|198->168|198->168|203->173|205->175|206->176|208->178|212->182
                  -- GENERATED --
              */
          