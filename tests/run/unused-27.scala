object Test {
  def main(args: Array[String]): Unit = {
    ({
      println("block")
      foo
    })(x)
  }
  def foo(unused a: Int): Unit = {
    println("foo")
  }
  def x: Int = {
    println("x")
    42
  }
}
