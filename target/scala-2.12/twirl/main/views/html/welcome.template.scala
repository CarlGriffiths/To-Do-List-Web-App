
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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

    """),format.raw/*5.5*/("""<section id="top">
        <div class="wrapper">
            <h1><a href="https://playframework.com/documentation/"""),_display_(/*7.67*/version),format.raw/*7.74*/("""/Home">"""),_display_(/*7.82*/message),format.raw/*7.89*/("""</a></h1>
        </div>
    </section>

    <div id="content" class="wrapper doc">
        <article>

            <h1>Welcome to Play</h1>

            <p>
                Congratulations, you’ve just created a new Play application. This page will help you with the next few steps.
            </p>

            <blockquote>
                <p>
                    You’re using Play """),_display_(/*22.40*/version),format.raw/*22.47*/("""
                """),format.raw/*23.17*/("""</p>
            </blockquote>

            <h2>Why do you see this page?</h2>

            <p>
                The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>HomeController.index</code> action
                whenever a browser requests the <code>/</code> URI using the GET method:
            </p>

            <pre><code># Home page
GET     /               controllers.HomeController.index</code></pre>


            <p>
                Play has invoked the <code>controllers.HomeController.index</code> method:
            </p>

            <pre><code>public Result index() """),format.raw/*41.46*/("""{"""),format.raw/*41.47*/("""
    """),format.raw/*42.5*/("""return ok(index.render("Your new application is ready."));
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""</code></pre>

            <p>
                An action method handles the incoming HTTP request, and returns the HTTP result to send back to the web client.
                Here we send a <code>200 OK</code> response, using a template to fill its content.
            </p>

            <p>
                The template is defined in the <code>app/views/index.scala.html</code> file and compiled as a standard Java class.
            </p>

            <pre><code>@(message: String)

  @main("Welcome to Play") """),format.raw/*56.29*/("""{"""),format.raw/*56.30*/("""

  """),format.raw/*58.3*/("""@play20.welcome(message, style = "Java")

"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""</code></pre>

            <p>
                The first line of the template defines the function signature. Here it just takes a single <code>String</code> parameter.
                Then this template calls another function defined in <code>app/views/main.scala.html</code> which displays the HTML layout, and another
                function that displays this welcome message. You can freely add any HTML fragment mixed with Scala code in this file.
            </p>

            <blockquote>
                <p>
                    <strong>Note</strong> that Scala is fully compatible with Java, so if you don’t know Scala don’t panic, a Scala statement is very similar to a Java one.
                </p>
            </blockquote>

            <p>You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*74.94*/version),format.raw/*74.101*/("""/ScalaTemplates">Twirl</a>, the template language used by Play, and how Play handles <a href="https://www.playframework.com/documentation/"""),_display_(/*74.240*/version),format.raw/*74.247*/("""/JavaActions">actions</a>.</p>

            <h2>Async Controller</h2>

            Now that you've seen how Play renders a page, take a look at <code>AsyncController.java</code>, which shows how to do asynchronous programming when handling a request.  The code is almost exactly the same as <code>HomeController.java</code>, but instead of returning <code>Result</code>, the action returns <code>CompletionStage&lt;Result&gt;</code> to Play.  When the execution completes, Play can use a thread to render the result without blocking the thread in the mean time.

            <p>
                <a href=""""),_display_(/*81.27*/routes/*81.33*/.AsyncController.message),format.raw/*81.57*/("""">Click here for the AsyncController action!</a>
            </p>

            <p>
                You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*85.95*/version),format.raw/*85.102*/("""/JavaAsync">asynchronous actions</a> in the documentation.
            </p>

            <h2>Count Controller</h2>

            <p>
                Both the HomeController and AsyncController are very simple, and typically controllers present the results of the interaction of several services.  As an example, see the <code>CountController</code>, which shows how to inject a component into a controller and use the component when handling requests.  The count controller increments every time you click on it, so keep clicking to see the numbers go up.
            </p>

            <p>
                <a href=""""),_display_(/*95.27*/routes/*95.33*/.CountController.count),format.raw/*95.55*/("""">Click here for the CountController action!</a>
            </p>

            <p>
                You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*99.95*/version),format.raw/*99.102*/("""/JavaDependencyInjection">dependency injection</a> in the documentation.
            </p>

            <h2>Need more info on the console?</h2>

            <p>
                For more information on the various commands you can run on Play, i.e. running tests and packaging applications for production, see <a href="https://playframework.com/documentation/"""),_display_(/*105.199*/version),format.raw/*105.206*/("""/PlayConsole">Using the Play console</a>.
            </p>

            <h2>Need to set up an IDE?</h2>

            <p>
                You can start hacking your application right now using any text editor. Any changes will be automatically reloaded at each page refresh,
                including modifications made to Scala source files.
            </p>

            <p>
                If you want to set-up your application in <strong>IntelliJ IDEA</strong> or any other Java IDE, check the
                <a href="https://www.playframework.com/documentation/"""),_display_(/*117.71*/version),format.raw/*117.78*/("""/IDE">Setting up your preferred IDE</a> page.
            </p>

            <h2>Need more documentation?</h2>

            <p>
                Play documentation is available at <a href="https://www.playframework.com/documentation/"""),_display_(/*123.106*/version),format.raw/*123.113*/("""">https://www.playframework.com/documentation</a>.
            </p>

            <p>
                Play comes with lots of example templates showcasing various bits of Play functionality at <a href="https://www.playframework.com/download#examples">https://www.playframework.com/download#examples</a>.
            </p>

            <h2>Need more help?</h2>

            <p>
                Play questions are asked and answered on Stackoverflow using the "playframework" tag: <a href="https://stackoverflow.com/questions/tagged/playframework">https://stackoverflow.com/questions/tagged/playframework</a>
            </p>

            <p>
                The <a href="https://discuss.playframework.com">Discuss Play Forum</a>  is where Play users come to seek help,
                announce projects, and discuss issues and new features.
            </p>

            <p>
                Gitter is a real time chat channel, like IRC. The <a href="https://gitter.im/playframework/playframework">playframework/playframework</a>  channel is used by Play users to discuss the ins and outs of writing great Play applications.
            </p>

        </article>

        <aside>
            <h3>Browse</h3>
            <ul>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*150.71*/version),format.raw/*150.78*/("""">Documentation</a></li>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*151.71*/version),format.raw/*151.78*/("""/api/"""),_display_(/*151.84*/style),format.raw/*151.89*/("""/index.html">Browse the """),_display_(/*151.114*/{style.capitalize}),format.raw/*151.132*/(""" """),format.raw/*151.133*/("""API</a></li>
            </ul>
            <h3>Start here</h3>
            <ul>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*155.71*/version),format.raw/*155.78*/("""/PlayConsole">Using the Play console</a></li>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*156.71*/version),format.raw/*156.78*/("""/IDE">Setting up your preferred IDE</a></li>
                <li><a href="https://playframework.com/download#examples">Example Projects</a>
            </ul>
            <h3>Help here</h3>
            <ul>
                <li><a href="https://stackoverflow.com/questions/tagged/playframework">Stack Overflow</a></li>
                <li><a href="https://discuss.playframework.com">Discuss Play Forum</a> </li>
                <li><a href="https://gitter.im/playframework/playframework">Gitter Channel</a></li>
            </ul>

        </aside>

    </div>
""")))}),format.raw/*169.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 13 02:23:30 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/welcome.scala.html
                  HASH: e8ce4ade92b28aa900a58c91a4aca50c8c54cfe0
                  MATRIX: 957->1|1092->43|1119->45|1166->84|1216->97|1248->103|1389->218|1416->225|1450->233|1477->240|1889->625|1917->632|1962->649|2607->1266|2636->1267|2668->1272|2754->1331|2782->1332|3321->1845|3350->1846|3381->1850|3450->1893|3478->1894|4337->2726|4366->2733|4533->2872|4562->2879|5194->3484|5209->3490|5254->3514|5458->3691|5487->3698|6129->4313|6144->4319|6187->4341|6391->4518|6420->4525|6807->4883|6837->4890|7433->5458|7462->5465|7723->5697|7753->5704|9071->6994|9100->7001|9223->7096|9252->7103|9286->7109|9313->7114|9367->7139|9408->7157|9439->7158|9617->7308|9646->7315|9790->7431|9819->7438|10409->7997
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|38->7|38->7|38->7|53->22|53->22|54->23|72->41|72->41|73->42|74->43|74->43|87->56|87->56|89->58|91->60|91->60|105->74|105->74|105->74|105->74|112->81|112->81|112->81|116->85|116->85|126->95|126->95|126->95|130->99|130->99|136->105|136->105|148->117|148->117|154->123|154->123|181->150|181->150|182->151|182->151|182->151|182->151|182->151|182->151|182->151|186->155|186->155|187->156|187->156|200->169
                  -- GENERATED --
              */
          