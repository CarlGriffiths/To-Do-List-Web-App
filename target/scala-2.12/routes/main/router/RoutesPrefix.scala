// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/TodoList/conf/routes
// @DATE:Thu Jul 26 02:31:43 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
