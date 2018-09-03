
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

object stats extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("stats", user)/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
        """),format.raw/*7.9*/("""<div class="row">
                <div class="col-12 center-block">
                    <center>
                           
                    <h2>Stats</h2>  
                    <h4>Current points """),_display_(/*12.41*/user/*12.45*/.getPoints),format.raw/*12.55*/("""</h4>  
                    <h4>Completed tasks: """),_display_(/*13.43*/user/*13.47*/.getCompletedCount()),format.raw/*13.67*/("""</h4>        
                    <h4>Uncompleted tasks: """),_display_(/*14.45*/user/*14.49*/.getNumUncompleted()),format.raw/*14.69*/("""</h4> 

          
        
               
           

""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 03 19:35:42 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/stats.scala.html
                  HASH: 29275441c995cec1064480fa0f815848380daae8
                  MATRIX: 946->2|1030->16|1074->14|1101->32|1128->34|1155->53|1194->55|1229->64|1458->266|1471->270|1502->280|1579->330|1592->334|1633->354|1718->412|1731->416|1772->436
                  LINES: 28->2|31->4|34->3|35->5|36->6|36->6|36->6|37->7|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14
                  -- GENERATED --
              */
          