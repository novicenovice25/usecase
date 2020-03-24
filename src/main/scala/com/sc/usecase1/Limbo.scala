package com.sc.usecase1

class Limbo(val invalidEntity: Next) extends NextDAO {
  def writeToLimbo(): Unit ={
    insert(invalidEntity)
  }

}
