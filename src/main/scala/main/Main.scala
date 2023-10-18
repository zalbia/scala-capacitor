package main

import com.raquo.laminar.api.L._
import org.scalajs.dom

object Main {
  def main(args: Array[String]): Unit = {
    val app = h1("Hello world!")
    render(dom.document.getElementById("root"), app)
  }
}
