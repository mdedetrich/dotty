//> using options -Xfatal-warnings

package Foos

object Outer {
  case class X() // error
  object x
}
