// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TodoList/conf/routes
// @DATE:Thu Jul 26 00:30:35 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:12
    def completed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.completed",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "completed"})
        }
      """
    )
  
    // @LINE:7
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submit"})
        }
      """
    )
  
    // @LINE:10
    def changeStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.changeStatus",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "completed" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:11
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:9
    def submitDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.submitDate",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submitdate" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:8
    def addDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "task" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
