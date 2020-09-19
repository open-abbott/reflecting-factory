package com.daveabbott.reflection

import com.typesafe.config.Config

import scala.reflect.runtime.{currentMirror, universe => ru}

trait ReflectingFactory[T] {

  def create(config: Config): T = {
    val className = config.getString("className")
    try {
      val m = ru.runtimeMirror(getClass.getClassLoader)
      val myClass = m.staticClass(className)
      val myType = myClass.toType
      val ctor = myType.member(ru.termNames.CONSTRUCTOR).asMethod
      val classMirror = currentMirror.reflectClass(myType.typeSymbol.asClass)
      classMirror.reflectConstructor(ctor).apply(config).asInstanceOf[T]
    }
    catch {
      case e: ScalaReflectionException => {
        println(s"Failed attempting to load class: '$className'")
        throw e
      }
    }
  }

}
