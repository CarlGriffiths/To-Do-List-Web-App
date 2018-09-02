
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

    <!DOCTYPE html>
    <html lang="en">
        <head>
    
                
            <title>"""),_display_(/*17.21*/title),format.raw/*17.26*/("""</title>
            
            <link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.63*/routes/*19.69*/.Assets.versioned("images/favicon.png")),format.raw/*19.108*/("""">
             <!-- Bootstrap CSS -->
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
             <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
            <script src=""""),_display_(/*23.27*/routes/*23.33*/.Assets.versioned("javascripts/hello.js")),format.raw/*23.74*/("""" type="text/javascript"></script>
            <script>  
    
                function checkInput(message)"""),format.raw/*26.45*/("""{"""),format.raw/*26.46*/("""
                    """),format.raw/*27.21*/("""if(message)"""),format.raw/*27.32*/("""{"""),format.raw/*27.33*/("""
    
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/("""
    
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/("""
    
    
            """),format.raw/*34.13*/("""</script>
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
                <li class="nav-item">
                    <a class="nav-link" href="/overdue">Overdue</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/stats">Stats</a>
                </li>
                """),_display_(/*53.18*/if(user != null)/*53.34*/{_display_(Seq[Any](format.raw/*53.35*/("""
                """),format.raw/*54.17*/("""<li class="nav-item">
                    
                    <a class="nav-link" href=""""),_display_(/*56.48*/routes/*56.54*/.HomeController.logout),format.raw/*56.76*/(""""> Logout</a>
                </li>
                """)))}),format.raw/*58.18*/(""" 
                """),format.raw/*59.17*/("""</ul>
            </nav>
	"""),format.raw/*61.83*/(""" """),_display_(/*61.85*/content),format.raw/*61.92*/("""



 

    

    """),format.raw/*69.5*/("""</body>
  </html>
"""))
      }
    }
  }

  def render(title:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 02 19:40:49 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/main.scala.html
                  HASH: 376281cdb90d8769b25a0135729b033815f448a2
                  MATRIX: 1211->260|1347->303|1374->304|1533->436|1559->441|1670->525|1685->531|1746->570|2270->1067|2285->1073|2347->1114|2482->1221|2511->1222|2560->1243|2599->1254|2628->1255|2682->1281|2711->1282|2761->1304|2790->1305|2841->1328|3587->2047|3612->2063|3651->2064|3696->2081|3813->2171|3828->2177|3871->2199|3955->2252|4001->2270|4055->2377|4084->2379|4112->2386|4156->2403
                  LINES: 33->7|38->8|39->9|47->17|47->17|49->19|49->19|49->19|53->23|53->23|53->23|56->26|56->26|57->27|57->27|57->27|59->29|59->29|61->31|61->31|64->34|83->53|83->53|83->53|84->54|86->56|86->56|86->56|88->58|89->59|91->61|91->61|91->61|99->69
                  -- GENERATED --
              */
          