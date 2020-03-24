package com.sc.usecase1

class Parking(val externalEntity: Next, setOfInstruction: List[String]) extends NextDAO {
  val nextDataContext = new NextDataContext(setOfInstruction, externalEntity)

  def writeToParking() = {
    if (containsMMD(externalEntity)) {
      insert(externalEntity)
    }

    if (nextDataContext.isSetOfInfoSufficient() == false) {
      insert(externalEntity)

    }
  }

  def containsMMD(entity: Next): Boolean = ???

}
