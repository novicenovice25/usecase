package com.sc.usecase2

import org.apache.hadoop.hive.ql.exec.UDF
import org.apache.hadoop.io.Text


class BanqueFinder extends UDF {
  def evaluate(input: Text): Option[Text] = {
    if (input.toString.contains("Banque")) {
      Some(input)
    }
    else {
      None
    }
  }
}
