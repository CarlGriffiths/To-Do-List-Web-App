
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

object overdue extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Item],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("overdue tasks", user)/*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""
         
        """),format.raw/*8.9*/("""<div class="row">
                <div class="col-12 center-block">
                    <center>
                           
                    <h2>Overdue</h2>     
                     <hr>
                     
                      """),_display_(/*15.24*/for(f <- user.getItems()) yield /*15.49*/{_display_(Seq[Any](format.raw/*15.50*/("""
                        """),_display_(/*16.26*/if(f.getCompleted()== false)/*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""
                             """),_display_(/*17.31*/defining(true)/*17.45*/ { compare =>_display_(Seq[Any](format.raw/*17.58*/("""  
                                 """),_display_(/*18.35*/if(f.hasDatePassed()== compare)/*18.66*/ {_display_(Seq[Any](format.raw/*18.68*/("""
                           
                                    """),format.raw/*20.37*/("""<div class="card border-dark mb-3" style="max-width: 25rem;">
   
                                            <div class="card-body">
                                                    <div style="clear: both">
                                                            <h5 style="float: center">"""),_display_(/*24.88*/f/*24.89*/.getMessage()),format.raw/*24.102*/("""</h5>
                                                           
                                                           
                                                        </div>
                                                        <hr />
                                          
                                            <a href=""""),_display_(/*30.55*/routes/*30.61*/.HomeController.delete(f.getId())),format.raw/*30.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*34.60*/routes/*34.66*/.HomeController.changeStatus(f.getId())),format.raw/*34.105*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>
                                 
                                """)))}),format.raw/*39.34*/("""
                            """)))}),format.raw/*40.30*/("""
                              
                        """)))}),format.raw/*42.26*/("""
                    
                    """)))}),format.raw/*44.22*/("""
                     

                            """),format.raw/*47.29*/("""</center>
                            </div>

          
        
               
           
""")))}))
      }
    }
  }

  def render(items:List[Item],user:User): play.twirl.api.HtmlFormat.Appendable = apply(items,user)

  def f:((List[Item],User) => play.twirl.api.HtmlFormat.Appendable) = (items,user) => apply(items,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 03 19:42:57 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/overdue.scala.html
                  HASH: bb30deacfe20a1bcdd2a527db57988493f018fd7
                  MATRIX: 959->2|1063->36|1107->34|1134->52|1161->54|1196->81|1235->83|1280->102|1545->340|1586->365|1625->366|1678->392|1715->420|1755->422|1813->453|1836->467|1887->480|1951->517|1991->548|2031->550|2124->615|2450->914|2460->915|2495->928|2871->1277|2886->1283|2940->1316|3210->1559|3225->1565|3286->1604|3599->1886|3660->1916|3748->1973|3822->2016|3902->2068
                  LINES: 28->2|31->4|34->3|35->5|36->6|36->6|36->6|38->8|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|50->20|54->24|54->24|54->24|60->30|60->30|60->30|64->34|64->34|64->34|69->39|70->40|72->42|74->44|77->47
                  -- GENERATED --
              */
          