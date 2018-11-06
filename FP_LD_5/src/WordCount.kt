class WordCount {
     fun phrase(text:String): Map<String, Int> = text.toLowerCase()
            .split(Regex("[^A-Za-z0-9']"))
            .filter{it.isNotEmpty()}
            .map { it.removeSurrounding("'", "'") }
            .groupBy{it}
            .mapValues{it.value.size}
}