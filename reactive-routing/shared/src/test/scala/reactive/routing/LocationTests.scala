package reactive
package routing

import org.scalatest.FunSuite
import org.scalatest.Matchers

class LocationTests extends FunSuite with Matchers {
  test("toUrl") {
    val loc = Location(List("p@th", "to&", "re/source"), List(("f!eld", "v@lue"), ("ke%", "value?")))
    loc.toUrl should equal ("/p%40th/to%26/re%2Fsource?f%21eld=v%40lue&ke%25=value%3F")
  }
}
