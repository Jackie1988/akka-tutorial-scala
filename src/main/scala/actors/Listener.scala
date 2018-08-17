package actors

import actorModels.PiApproximation
import akka.actor.Actor

/**
  * Created by YS1607131010 on 8/8/2018.
  */
class Listener extends Actor {
  def receive = {
    case PiApproximation(pi, duration) ⇒
      println("\n\tPi approximation: \t\t%s\n\tCalculation time: \t%s"
        .format(pi, duration))
      context.system.shutdown()
  }
}
