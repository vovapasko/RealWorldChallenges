/*
Suppose the content library contains the following titles: "duel", "dule", "speed", "spede", "deul", "cars".
 How would you efficiently implement a functionality so that if a user misspells speed as
 spede, they are shown the correct title?

 Constraint: only anagrams misspells are allowed. So no spe for example
 */
fun groupSimilarTitles(inputTitle: String): String {
    val wordBank = arrayListOf("speed", "wheel", "duel", "cars")
    val encodedWordBank: MutableMap<String, Int> = mutableMapOf()
    wordBank.forEach { word ->
        encodedWordBank.set(word, 0)
        word.forEach { symbol ->
            var wordSum = encodedWordBank[word]!!
            wordSum += symbol.code
            encodedWordBank[word] = wordSum
        }
    }

    // encode incoming word
    var encodedInputTitle = 0
    inputTitle.forEach { symbol ->
        encodedInputTitle += symbol.code
    }
    val wordFromBank = encodedWordBank.filterKeys { key -> encodedWordBank[key] == encodedInputTitle }.keys.first()
    return wordFromBank
}