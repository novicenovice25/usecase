package com.sc.usecase1

class NextDataContext(val setOfInfo: List[String], next: Next) extends NextDAO {
  def workflow() = {
    setOfInfo.foreach { step =>
      step.toLowerCase match {
        case "select" => select(next: Next)
        case "insert" => insert(next: Next)
        case "update" => update(next: Next)
        case "delete" => delete(next: Next)
      }
    }
  }
  def isSetOfInfoSufficient():Boolean = ???
}
