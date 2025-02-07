object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    // Используем filter для отбора строк по предикату,
    // затем map для преобразования выбранных строк в верхний регистр.
    // filter и map возвращают новый список
    strings.filter(_.length > 3).map(_.toUpperCase)
  }


  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}


