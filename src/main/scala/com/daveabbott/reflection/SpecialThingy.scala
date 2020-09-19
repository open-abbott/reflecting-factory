package com.daveabbott.reflection

import com.typesafe.config.Config

class SpecialThingy(config: Config) extends Thingy {
  override def action(): Unit = {
    println("We did it!")
  }
}
