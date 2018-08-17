package actorModels

/**
  * Created by YS1607131010 on 8/8/2018.
  */

import scala.concurrent.duration.Duration

sealed trait PiMessage
case object Calculate extends PiMessage
case class Work(start: Int, nrOfElements: Int) extends PiMessage
case class Result(value: Double) extends PiMessage
case class PiApproximation(pi: Double, duration: Duration)


