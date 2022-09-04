object O {
  class AC(code: => Unit) {
    def apply() = code

    def this(code: => Unit, key: Int = 1, modifiers: Int = 0) = {
      this(code)
    }
  }

  class Doc {
    def method: Boolean = true
  }

  val doc = new Doc

  val ac = new AC(doc.method) // error

  def foo[T](code: => Unit): Unit = ()
  def foo[T](code: => Unit, key: Int = 1, modifiers: Int = 0): Unit = foo(code)
  foo(doc.method) // error
  foo[Int](doc.method) // error
}