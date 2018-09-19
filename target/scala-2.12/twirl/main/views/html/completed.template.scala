
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

object completed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Item],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: List[Item], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("complated", user)/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
         
        """),format.raw/*8.9*/("""<div class="row">
                <div class="col-12 center-block">
                    <center>
                           
                    <h2>Completed</h2>     
                   

                     <hr>
                     


                      """),_display_(/*19.24*/for(f <- items) yield /*19.39*/{_display_(Seq[Any](format.raw/*19.40*/("""

                       
                        
                             """),_display_(/*23.31*/defining(true)/*23.45*/ { compare =>_display_(Seq[Any](format.raw/*23.58*/("""  
                                 """),_display_(/*24.35*/if(f.getCompleted()== compare)/*24.65*/ {_display_(Seq[Any](format.raw/*24.67*/("""
                           
                                    """),format.raw/*26.37*/("""<div class="card border-dark mb-3" style="max-width: 25rem;">
                                            
                                            
                                            <div class="card-body">
                                                    <div style="clear: both">
                                                            <strike><h5 style="float: center">"""),_display_(/*31.96*/f/*31.97*/.getMessage()),format.raw/*31.110*/("""</h5></strike>
                                                            <p style="float: center">"""),_display_(/*32.87*/f/*32.88*/.getDateCompleted()),format.raw/*32.107*/("""</p>
                                                            
                                                        </div>
                                                        <hr />
                                          
                                            <a href=""""),_display_(/*37.55*/routes/*37.61*/.HomeController.delete(f.getId())),format.raw/*37.94*/("""" class="btn btn-outline-secondary btn-sm">
                                                <i class="far  fa-trash-alt"></i></a>
                                                </a>

                                                 <a href=""""),_display_(/*41.60*/routes/*41.66*/.HomeController.changeStatus(f.getId())),format.raw/*41.105*/("""" class="btn btn-secondary btn-sm">
                                                <i class="fas fa-check"></i></a>
                                        </div>
                                    </div>

                                 
                                """)))}),format.raw/*47.34*/("""
                            """)))}),format.raw/*48.30*/("""

                              
                        """)))}),format.raw/*51.26*/("""

                    

                     

                            """),format.raw/*57.29*/("""</center>
                            </div>

          
        
               
           
""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(items:List[Item],user:User): play.twirl.api.HtmlFormat.Appendable = apply(items,user)

  def f:((List[Item],User) => play.twirl.api.HtmlFormat.Appendable) = (items,user) => apply(items,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Sep 19 17:33:42 IST 2018
                  SOURCE: /home/wdd/Desktop/TodoList/app/views/completed.scala.html
                  HASH: f683c45e5f7ca3642619420ba96b224d2643538e
                  MATRIX: 961->2|1065->36|1109->34|1136->52|1163->54|1194->77|1233->79|1278->98|1568->361|1599->376|1638->377|1746->458|1769->472|1820->485|1884->522|1923->552|1963->554|2056->619|2476->1012|2486->1013|2521->1026|2649->1127|2659->1128|2700->1147|3016->1436|3031->1442|3085->1475|3355->1718|3370->1724|3431->1763|3737->2038|3798->2068|3887->2126|3990->2201|4115->2296
                  LINES: 28->2|31->4|34->3|35->5|36->6|36->6|36->6|38->8|49->19|49->19|49->19|53->23|53->23|53->23|54->24|54->24|54->24|56->26|61->31|61->31|61->31|62->32|62->32|62->32|67->37|67->37|67->37|71->41|71->41|71->41|77->47|78->48|81->51|87->57|94->64
                  -- GENERATED --
              */
          