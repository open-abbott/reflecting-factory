package com.daveabbott.reflection

import com.typesafe.config.ConfigFactory

object Reflector {

  def main(args: Array[String]): Unit = {
    val typeName = "SpecialThingy"
    val config = ConfigFactory.load().getConfig(typeName)
    val thingy = ThingyFactory.create(config)
    thingy.action()
  }

}
