package example

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt

import core.Weather

object Hello extends App {
  val w = Await.result(Weather.weather, 10.seconds)
  println(s"Hello! The weather in New York is $w.")
  Weather.http.close()
}
