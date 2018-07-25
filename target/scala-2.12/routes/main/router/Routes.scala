// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TodoList/conf/routes
// @DATE:Thu Jul 26 00:30:35 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:Integer ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit""", """controllers.HomeController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """task""", """controllers.HomeController.addDate(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitdate""", """controllers.HomeController.submitDate(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """completed""" + "$" + """id<[^/]+>""", """controllers.HomeController.changeStatus(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """id<[^/]+>""", """controllers.HomeController.delete(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """completed""", """controllers.HomeController.completed"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_submit1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_HomeController_submit1_invoker = createInvoker(
    HomeController_0.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submit",
      Nil,
      "POST",
      this.prefix + """submit""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_addDate2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("task")))
  )
  private[this] lazy val controllers_HomeController_addDate2_invoker = createInvoker(
    HomeController_0.addDate(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDate",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """task""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_submitDate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitdate")))
  )
  private[this] lazy val controllers_HomeController_submitDate3_invoker = createInvoker(
    HomeController_0.submitDate(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "submitDate",
      Seq(classOf[Integer]),
      "POST",
      this.prefix + """submitdate""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_changeStatus4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("completed"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_changeStatus4_invoker = createInvoker(
    HomeController_0.changeStatus(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changeStatus",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """completed""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete5_invoker = createInvoker(
    HomeController_0.delete(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_completed6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("completed")))
  )
  private[this] lazy val controllers_HomeController_completed6_invoker = createInvoker(
    HomeController_0.completed,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "completed",
      Nil,
      "GET",
      this.prefix + """completed""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[Integer]("cat", Some(0))) { (cat) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(cat))
      }
  
    // @LINE:7
    case controllers_HomeController_submit1_route(params@_) =>
      call { 
        controllers_HomeController_submit1_invoker.call(HomeController_0.submit)
      }
  
    // @LINE:8
    case controllers_HomeController_addDate2_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_HomeController_addDate2_invoker.call(HomeController_0.addDate(id))
      }
  
    // @LINE:9
    case controllers_HomeController_submitDate3_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_HomeController_submitDate3_invoker.call(HomeController_0.submitDate(id))
      }
  
    // @LINE:10
    case controllers_HomeController_changeStatus4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_changeStatus4_invoker.call(HomeController_0.changeStatus(id))
      }
  
    // @LINE:11
    case controllers_HomeController_delete5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_delete5_invoker.call(HomeController_0.delete(id))
      }
  
    // @LINE:12
    case controllers_HomeController_completed6_route(params@_) =>
      call { 
        controllers_HomeController_completed6_invoker.call(HomeController_0.completed)
      }
  
    // @LINE:16
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
