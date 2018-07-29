
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

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html lang="en">
        <head>
    
                
            <title>title</title>
            
            <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.63*/routes/*7.69*/.Assets.versioned("images/favicon.png")),format.raw/*7.108*/("""">
             <!-- Bootstrap CSS -->
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
             <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
            <script src=""""),_display_(/*11.27*/routes/*11.33*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.74*/("""" type="text/javascript"></script>
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
    </body>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 29 02:01:49 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/test.scala.html
                  HASH: ff5e99fc148e333be437515513377c7fcb09cae3
                  MATRIX: 1029->0|1217->162|1231->168|1291->207|1815->704|1830->710|1892->751
                  LINES: 33->1|39->7|39->7|39->7|43->11|43->11|43->11
                  -- GENERATED --
              */
          