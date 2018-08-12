// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TodoList/conf/routes
// @DATE:Sun Aug 12 20:24:50 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(cat:Integer = 0): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(cat == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("cat", cat)))))
    }
  
    // @LINE:12
    def completed(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "completed")
    }
  
    // @LINE:13
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:7
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submit")
    }
  
    // @LINE:18
    def submitLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitLogin")
    }
  
    // @LINE:14
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:16
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:19
    def submitRegister(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submitRegister")
    }
  
    // @LINE:10
    def changeStatus(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "completed" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def delete(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:9
    def submitDate(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "submitdate" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:8
    def addDate(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "task/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:17
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:15
    def overdue(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "overdue")
    }
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
